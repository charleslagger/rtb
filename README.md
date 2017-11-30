# rtb
Run with ORACLE-DB
create two DB: USER_ and ADVERTISER

*SQL command:

CREATE SEQUENCE user_seq; // tao sequence tang dan cho ID
CREATE TABLE USER_
(
  ID NUMBER(10) NOT NULL,
  USER_NAME VARCHAR2(255) NOT NULL,
  AGE NUMBER(10) NOT NULL,
  GENDER VARCHAR2(255) NOT NULL ,
  DAY_ TIMESTAMP,
  OCCUPATION VARCHAR2(255) NOT NULL,
  INTEREST VARCHAR(10),
  PRIMARY KEY ("ID")
);

CREATE SEQUENCE ads_seq;
CREATE TABLE ADVERTISER
(
  ID NUMBER(10) NOT NULL,
  ADS_NAME VARCHAR2(255) NOT NULL,
  STATUS NUMBER(3) NOT NULL,
  PRIMARY KEY ("ID")
);


*Dung postman de test api:

Cac giao thuc restful:

http://localhost:8080/bid_request/user/create_user
http://localhost:8080/bid_request/user/get_users
http://localhost:8080/bid_response/ads/create_ads