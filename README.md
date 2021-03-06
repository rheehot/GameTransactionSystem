<div align=center>

![](/images/project_main.png)

</div>

# GTS (Game Transaction System / 게임 거래 시스템)
> System Name : I VIEW ver 1.1 (UPDATE : 2020. 02. 11.) 

<br>
<br>

# What is I VIEW?
I VIEW는 Item view의 줄인말이며 게임 거래 시스템이다. <br>
~~시스템 모티브는 League of Legend게임의 상점 거래이다.~~ <br>
**[2020.02.11]** _현재 게임 거래소(경매장)의 바탕인 E-커머스로서 수정 진행중이다._

<br>

## Environments
---------------------------------------

#### Development

**[ ~ 2019. 02. 13. ]**
* Java MVC Model 2
* RDBMS: Oracle

**[ 2020. 02. 11. ~ ]**
* Framework : SpringBoot
* Build Tool : MAVEN 2
* RDBMS : MariaDB
* DBCP : hikariCP
* SERVER : Tomcat 8
* Java SE Development Kit 1.8
* lombok

<br>

#### Libraries

* Spring
  - Spring-webmvc 5.2.4.RELEASE
* Data Access
  - MyBatis 3.4.6
  - HikariCP 2.4.7
* XSS
  - Naver Lucy 2.0.1
* Servlet 4.0.1
* JSP 2.3.3
* Lombok 1.16.4
* SLF4J 1.7.12
* Jackson 2.10.3
* Mushbird 0.0.1.RELEASE

<br>
<br>

## :memo: Explain


<div align=center>

![](/images/contents.png)

</div>

<br>

### Section
 추후 작성
<br>
<br>

### InterFace
**1. FO (사용자)**
추후 작성


**2. BO (관리자)**
추후 작성


**이전 데이터**

- 로그인 (Session)
  - 회원가입
  - 로그아웃

- 상품
  - 상품검색(조회) 
  - 상품상세보기
  - 상품등록
  - 상품수정

- 평가 (CS)
  - 평가등록
  - 평가수정
  - 평가삭제
  - 평가조회

- 주문
  - 주문등록
  - 주문조회
<br>
<br>

### Explain
<br>
[정리 필요]

~~등급은 관리자와 회원으로 나뉘어진다.~~
<br>
~~구매자 등급과 판매자 등급에 따라~~
<br>
~~구매자 등급이 높으면 가격 할인율이 증가하며 판매자 등급이 높으면 아이템 등급과 가격이 높아진다.~~
<br>
~~관리자는 상품을 구매할 수 없다.~~
<br>
~~회원은 상품을 등록과 상품 구매 모두 가능하다. (회원은 판매자, 구매자 입장)~~
<br>
~~관리자와 회원은 컨텐츠 목록과 마이페이지 또한 다르다.~~
<br>
~~관리자는 회원정보를 수정, 삭제, 조회(검색), 평가 수정 및 삭제~~
<br>
~~마이페이지에서는 등급 설정 및 내 정보 수정~~
<br>
~~회원은  상품을 등록, 수정, 삭제, 조회(검색), 평가 작성~~
<br>
~~마이페이지에서는 내 정보 수정 , 구매내역, 상품내역~~

<br>
<br>

## :bulb: Function

~~구매는 자기 상품은 구매할 수 없으며 판매가 완료된 상품 또한 구매할 수 없다.~~
<br>
~~상세정보 보기를 통해 구매가 가능하다.~~
<br>
~~만약 소지하고 있는 골드가 부족하다면 상품 리스트로 되돌아간다.~~
<br>
<br>

## :gem: 구매처리

~~구매자 입장에서는 골드(소지금) 감소, 구매횟수 증가, 포인트 증가, 구매목록에 추가~~
<br>
~~판매자 입장에서는 골드 증가, 판매횟수 증가, 판매목록에 추가~~
<br>
~~상품 입장에서는 판매중에서 판매완료로 변경~~
