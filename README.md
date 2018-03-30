# wePro

HOW TO RUN: 

Add Configuration:
select Run->Run Configurations->Arguments->VM Arguments. Add -Dspring.profiles.active=local

Open file "WeProStartUp.java" and run it as a java application.

Dummy Database Script:

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
