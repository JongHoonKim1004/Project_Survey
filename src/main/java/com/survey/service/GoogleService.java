package com.survey.service;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.survey.dto.GoogleDTO;
import com.survey.repository.UsersRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
@Slf4j
public class GoogleService {
    @Autowired
    private UsersRepository usersRepository;

    @Value("${google.client-id}")
    private String clientId;

    @Value("${google.client-password}")
    private String clientSecret;

    // 엑세스 토큰 획득
    public String getAccessToken(@RequestParam("code") String code) throws IOException {
        log.info("ACCESS GET ACCESS_TOKEN");
        String access_token = "";

        String reqURL = "https://oauth2.googleapis.com/token";

        try{
            URL url = new URL(reqURL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("POST");
            conn.setDoOutput(true);

            BufferedWriter br = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
            StringBuilder sb = new StringBuilder();
            sb.append("grant_type=authorization_code");
            sb.append("&client_id=" + clientId);
            sb.append("&client_secret=" + clientSecret);
            sb.append("&redirect_uri=" + "http://localhost:8080/login/oauth/google");
            sb.append("&code=" + code);
            br.write(sb.toString());
            br.flush();

            int responseCode = conn.getResponseCode();
            log.info(String.valueOf(responseCode));

            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = "";
            String result = "";
            while ((line = rd.readLine()) != null) {
                result += line;
            }
            log.info("RESPONSE BODY: " + result);

            JsonParser parser = new JsonParser();
            JsonElement element = parser.parse(result);


            access_token = element.getAsJsonObject().get("access_token").getAsString();
            log.info("ACCESS TOKEN: " + access_token);

        } catch (Exception e){
            e.printStackTrace();
        }


        return access_token;
    }

    // 개인정보 요청
    public GoogleDTO getUserInfo(String access_token) throws IOException {
        log.info("GET USER INFO");
        GoogleDTO googleDTO = new GoogleDTO();

        String reqURL = "https://www.googleapis.com/userinfo/v2/me";

        try{
            URL url = new URL(reqURL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "Bearer " + access_token);

            int responseCode = conn.getResponseCode();
            log.info("responseCode: " + responseCode);

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String line = "";
            String result = "";

            while((line = br.readLine()) != null) {
                result += line;
            }

            log.info("responseBody: " + result);

            JsonParser parser = new JsonParser();
            JsonElement element = parser.parse(result);

            JsonObject obj = element.getAsJsonObject();
            String name = obj.get("name").getAsString();
            String email = obj.get("email").getAsString();

            googleDTO.setEmail(email);
            googleDTO.setName(name);

        } catch (Exception e){
            e.printStackTrace();
        }

        return googleDTO;
    }
}
