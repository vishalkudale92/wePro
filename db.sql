create table assessment(
     question_id int not null auto_increment,
     assessment_id varchar(255),
     question varchar(10240) not null,
     option1 varchar(1024) not null,
     option2 varchar(1024) not null,
     option3 varchar(1024),
     option4 varchar(1024),
     correct_answer int not null,
     marks int,
     primary key(question_id)
     );