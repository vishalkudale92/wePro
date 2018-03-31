# wePro

HOW TO RUN: 

#1) Add Configuration:
select Run->Run Configurations->Arguments->VM Arguments. Add -Dspring.profiles.active=local

#2) Create Dummy Database:

Create database with name "wePro"

SCRIPT:
create table user (
   id BIGINT NOT NULL AUTO_INCREMENT,
   name VARCHAR(30) NOT NULL,
   age  INTEGER NOT NULL,
   email VARCHAR(70) NOT NULL,
   PRIMARY KEY (id)
);
   
/* Populate USER Table */
INSERT INTO user(name,age,email)
VALUES ('Sam',30,'sam@gmail.com');
   
INSERT INTO user(name,age,email)
VALUES ('Tom',40,'tom@gmail.com');


#3) Open file "WeProStartUp.java" and run it as a java application.

#4) Check if everything is working fine by hitting URL : http://localhost:8080/wePro/#/
