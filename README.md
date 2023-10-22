# 📚 스프링부트 - 날씨 일기 프로젝트

## 🌟 소개

> 외부 API를 이용해서 날씨 데이터를 가져와 일기를 작성하는 프로젝트입니다.

## 💻 기술 스택

- Java 8
- Spring Boot 2.7.14
- Spring Boot Data JPA
- Spring Boot JDBC
- Swagger
- MySQL
- Git

## 💡 주요 기능

- 일기 관련된 CRUD
- 외부 API를 이용해서 날씨 데이터 가져오기
- 가져온 날씨 데이터를 매일 새벽 1시마다 DB에 저장하기
- logback을 이용한 로그 기록 남기기
- swagger을 이용한 API 문서 작성

## 🖼 ERD
![diagram](https://github.com/9898s/weather-diary-api/assets/46531692/e6b02d6e-8d03-4e29-ae84-7e6500d04cf2)

## 🗂 API 명세서

### 일기

#### 작성

`POST` 요청을 사용해서 일기를 작성할 수 있습니다.

##### Request fields

| Path   | Type     | Description |
|--------|----------|-------------|
| `text` | `String` | 내용          |

##### Example request

``` http request
POST http://localhost:8080/create/diary?date=2023-01-01
Content-Type: application/json

{
  "text": "오늘 날씨 맑음"
}
```

#### 조회

`GET` 요청을 사용해서 해당 기간에 작성된 일기를 조회할 수 있습니다.

##### Path parameters

> /read/diary?date=2023-01-01

#### 기간 조회

`GET` 요청을 사용해서 기간 내의 작성된 일기를 조회할 수 있습니다.

##### Path parameters

> /read/diary?startDate=2023-01-01&endDate=2023-01-10

#### 수정

`PUT` 요청을 사용해서 해당 기간에 작성된 일기를 수정할 수 있습니다.

##### Request fields

| Path   | Type     | Description |
|--------|----------|-------------|
| `text` | `String` | 내용          |

##### Example request

``` http request
PUT http://localhost:8080/update/diary?date=2023-01-01
Content-Type: application/json

{
  "text": "오늘 날씨 흐림"
}
```

#### 삭제

`DELETE` 요청을 사용해서 해당 기간에 작성된 일기를 삭제할 수 있습니다.

##### Path parameters

> /delete/diary?date=2023-01-01
