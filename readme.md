<h1 align="center"><img src="https://www.panel.co.kr/user/img/h_logo.gif" style="width: 300px; height: 100px">&nbsp;
  </h1>
  <h1 align="center">스프링부트 + 리액트 온라인 설문조사 프로젝트</h1>
  <br /><br />
  ## 목차
  - [개요](https://github.com/JongHoonKim1004/ProjectReact#-개요)
  
  - [기술 스택](https://github.com/JongHoonKim1004/ProjectReact#-기술-스택)
    
  - [프로젝트 설계](https://github.com/JongHoonKim1004/ProjectReact#-프로젝트-설계)
    
  - [핵심 기능](https://github.com/JongHoonKim1004/ProjectReact#-핵심-기능)
    
  - [주요기능 실행화면](https://github.com/JongHoonKim1004/ProjectReact#-주요기능-실행화면)
    
  - [개선사항](https://github.com/JongHoonKim1004/ProjectReact#-개선사항)


  ## 🚩 개요
  - 프로젝트 목표 : 다양한 API 이용과 분리된 서버와 클라이언트 이용을 위한 `스프링부트`, `리액트` 온라인 설문조사 프로젝트
  - 개발 기간 : 24/04/24 ~ 24/05/22

  ## 🔧 기술 스택
  - API : `다음 주소 API`, `PORTONE API`, `네이버 API`, `Google API`
  - Language : `Java(17)`, `JavaScript(ES6)`
  - Database : `MySQL(8.0)`
  - Target : `Web Browser`

  - Tool : `IntelliJ IDEA 2024.1`
  - ETC : `Git`

  ## 👾 프로젝트 설계, 구현 📂 PPT 📂 (ERD, USECASE)
<details><summary>프로젝트 설계, 구현, PPT</summary>
  
<div align="center">
    
| ![Project_Survey_PPT_01](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/838140ae-147c-4163-bce5-f07a2294ad39) | ![Project_Survey_PPT_02](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/7532b9e5-45d4-4969-b22f-3671e3dfea8a) |
| :-------------: | :-------------: | 
| ![Project_Survey_PPT_03](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/f6d30ab9-d47f-4bd8-be48-21cf31f12ed1) | ![Project_Survey_PPT_04](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/3a7670c9-190c-4628-be40-96399b56281f) |
| ![Project_Survey_PPT_05](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/aa378177-25af-4227-9f83-de2126de7aec) | ![Project_Survey_PPT_06](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/7df1920c-6827-4c40-9333-79d273e1ff22) |
| ![Project_Survey_PPT_07](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/68353781-90af-41d1-9945-7d0ec522bcaa) | ![Project_Survey_PPT_08](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/2e6b96e3-6dd2-4f8f-9838-9ac641e78a0d) |
| ![Project_Survey_PPT_09](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/15c541eb-9312-4cbc-abcd-0b5f4b8617ba) | ![Project_Survey_PPT_10](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/7743ce23-6ab5-4fc6-aaf7-eaa38572ee1a) |
| ![Project_Survey_PPT_11](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/da566a0c-f0b1-4eb1-b937-3429518a5733) | ![Project_Survey_PPT_12](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/24935b3f-5f40-434d-a057-902283e4118c) |
| ![Project_Survey_PPT_13](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/76319dca-b83d-4e26-a39b-53c1819961b6) | ![Project_Survey_PPT_14](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/b6598c6e-bad1-4c32-8f5c-0569c6cc33da) |
| ![Project_Survey_PPT_15](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/51c4a819-3ff9-4857-9093-9febbdd03e50) | ![Project_Survey_PPT_16](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/0e6fc233-41c7-4bdb-8af4-814c2facefb5) |
| ![Project_Survey_PPT_17](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/5cdd3b93-ecbf-4792-b198-fec4209e7e4f) | ![Project_Survey_PPT_18](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/ab24ed8b-1296-48b4-87be-aaf448d260af) |
| ![Project_Survey_PPT_19](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/62531872-64c3-4808-881f-9e467084cf43) | ![Project_Survey_PPT_20](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/d40905a2-47e8-4f43-9121-4094b3e15374) |
| ![Project_Survey_PPT_21](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/6f31c449-6604-47bf-9c0b-5663dda4e089) | ![Project_Survey_PPT_22](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/e1bcd109-e479-4670-824d-6767bd4fb6cd) |
| ![Project_Survey_PPT_23](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/2a2f9b04-27aa-4d48-bde1-53158d9a3e10) | ![Project_Survey_PPT_24](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/44cb60ca-04cb-4cf2-b0ff-6aa0bb7d3636) |
| ![Project_Survey_PPT_25](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/9f7c320e-99e6-429e-8b85-d0828f01b9a8) | ![Project_Survey_PPT_26](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/c523ba59-33ef-4bbc-86b7-7490513648cf) |
| ![Project_Survey_PPT_27](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/6e002aac-b3a9-4dca-9a17-0b11bb58a60b) | ![Project_Survey_PPT_28](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/43102938-f3fa-4e48-b21f-1e4751b09815) |
| ![Project_Survey_PPT_29](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/2626bcb0-97f4-4019-8858-21c91e889806) | ![Project_Survey_PPT_30](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/1ddb0fd5-f209-4f09-94ab-07c65afa7536) |
| ![Project_Survey_PPT_31](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/e36fc0d9-e8ef-45ba-8455-0e05b33826bd) | ![Project_Survey_PPT_32](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/4675efbc-9c41-4634-9c01-149192ee9552) |
| ![Project_Survey_PPT_33](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/9aef1bd4-c29b-4a72-ab29-63ff61433d96) | ![Project_Survey_PPT_34](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/fba167e2-6229-45c3-af56-2a8747ed187a) |
| ![Project_Survey_PPT_35](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/ad75cd4e-8d70-4f11-96d2-6937e9ad044e) | ![Project_Survey_PPT_36](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/a42b7e52-01e0-47c9-aae8-f2b5d2169189) |
| ![Project_Survey_PPT_37](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/0deaa77c-5dbf-4544-b871-3b2b9a87d53b) | ![Project_Survey_PPT_38](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/00ddbf5d-88ec-40f7-a8e4-9420d0d6500f) |
| ![Project_Survey_PPT_39](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/63a3aa47-8325-4011-9056-a1f9b141732c) | ![Project_Survey_PPT_40](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/217f41f0-5c8c-41d3-9798-66bc506964d9) |
| ![Project_Survey_PPT_41](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/2be3c487-b13a-4ba8-a9ad-44269c3ead1a) | ![Project_Survey_PPT_42](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/395ecace-969d-4210-90ca-b062845d2561) |
| ![Project_Survey_PPT_43](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/26079f94-b761-48e0-84a4-4bed09128ff0) | ![Project_Survey_PPT_44](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/afdeb0ef-b370-46be-b90f-dc52a83f1ba7) |
| ![Project_Survey_PPT_45](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/816176b7-5f01-494a-89e7-d9c5d2d925bd) | ![Project_Survey_PPT_46](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/0445fada-dfb2-443a-b022-23afd11f97ee) |
| ![Project_Survey_PPT_47](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/e776c9bb-e4d8-4e0a-843d-26db0200e85d) | ![Project_Survey_PPT_48](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/8525ac51-5831-4fff-bc39-572ae7fa3699) |
| ![Project_Survey_PPT_49](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/5ff69ab1-4caa-40c4-956a-9c881445fab5) | ![Project_Survey_PPT_50](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/fa626dd1-6397-440d-86f0-4a2c7b51d489) |
| ![Project_Survey_PPT_51](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/b834c9b6-227e-406e-8605-96bf730e9af7) | ![Project_Survey_PPT_52](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/424969fc-4494-4acc-be4b-80e1f0d8bf80) |
| ![Project_Survey_PPT_53](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/d499ec40-ea1e-4d6e-8900-8c8e38d0e67c) | ![Project_Survey_PPT_54](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/f0197c46-d01c-4258-9569-4df51fdaa15f) |
| ![Project_Survey_PPT_55](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/4e2fb0b7-3d2e-4378-8359-addbeff79c1c) | ![Project_Survey_PPT_56](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/ddc5b313-31c8-43f2-b55f-f13d0e9f62ba) |
| ![Project_Survey_PPT_57](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/a05ae7e2-fdaf-4bb9-b841-ae370c85f57a) | ![Project_Survey_PPT_58](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/5cf2be92-b5f2-4c7f-a825-aca66bb7fe4d) |
| ![Project_Survey_PPT_59](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/325a09f8-1e64-4069-bc71-ebb1b11507fe) | ![Project_Survey_PPT_60](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/486250fc-645b-4722-9190-f4bedb2834aa) |
| ![Project_Survey_PPT_61](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/e95842ff-2f1b-4794-b97d-cd1cf799cc5e) | ![Project_Survey_PPT_62](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/4d2fb1e7-484c-42de-8acc-f3b9b676bb15) |
| ![Project_Survey_PPT_63](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/bb34881b-ced2-4501-9c6a-aa7ce5fc92b9) | ![Project_Survey_PPT_64](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/3887b9be-2a61-45fa-841b-4f6e2f2e78c4) |
| ![Project_Survey_PPT_65](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/4945a736-32a6-411b-b7a2-3c955b08755f) | ![Project_Survey_PPT_66](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/29d35705-df2c-4601-aa23-39e48c1fc6ef) |
| ![Project_Survey_PPT_67](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/427e8dd3-f8ff-4fa8-aa38-6eba1363dbaf) | ![Project_Survey_PPT_68](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/18fdd796-1e01-4281-8e7d-0d51f650cc7f) |
| ![Project_Survey_PPT_69](https://github.com/JongHoonKim1004/Project_Survey/assets/155927559/2f3c0f96-90f8-4553-b3e5-8c2a9ad2fbff) | |













 


 











</div>

  </details>
