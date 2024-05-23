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

























</div>

  </details>
