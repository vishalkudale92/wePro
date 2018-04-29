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
create table project(
	id int not null auto_increment,
	name varchar(1024) not null,
	description varchar(10240),
	status_id int not null,
	duration int,
	due_date date not null,
	owner int not null,
	assessment_id int,
	positions int,
	pay int,
	primary key(id)
);
CREATE TABLE `user` (
   `id` int(11) NOT NULL AUTO_INCREMENT,
   `email` varchar(255) DEFAULT NULL,
   `firstname` varchar(255) DEFAULT NULL,
   `lastname` varchar(45) DEFAULT NULL,
   `password` varchar(255) DEFAULT NULL,
   `dob` varchar(255) DEFAULT NULL,
   `gender` varchar(255) DEFAULT NULL,
   `address` varchar(255) DEFAULT NULL,
   `phone` varchar(255) DEFAULT NULL,
   `occupation` varchar(255) DEFAULT NULL,
   `experience` varchar(255) DEFAULT NULL,
   `description` varchar(700) DEFAULT NULL,
   PRIMARY KEY (`id`)
 ) ENGINE=InnoDB DEFAULT CHARSET=latin1

create table skills(
	id int not null auto_increment,
	name varchar(255) not null,
	primary key(id)
);


create table project_skills(
	project_id int not null,
	skill_name varchar(255) not null
);
     
create table assessment_result(
		user_id varchar(255),
		assessment_id varchar(255),
		result float(4,2),
		primary key (user_id,assessment_id),
		FOREIGN KEY (user_id) REFERENCES user(user_id)
	);

CREATE TABLE `user_project` (
   `id` bigint(20) NOT NULL,
   `user_id` bigint(20) NOT NULL,
   `project_id` int(11) NOT NULL,
   `active` tinyint(1) NOT NULL DEFAULT '0',
   PRIMARY KEY (`id`),
   KEY `projectId_fk_idx` (`project_id`),
   CONSTRAINT `projectId_fk` FOREIGN KEY (`project_id`) REFERENCES `project` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
 ) ENGINE=InnoDB DEFAULT CHARSET=latin1
 
 CREATE TABLE `user_skills` (
  `id` INT(11) NOT NULL,
  `user_id` INT(11) NULL,
  `skill_id` INT(11) NULL,
  PRIMARY KEY (`id`),
  INDEX `sk_fk_idx` (`skill_id` ASC),
  INDEX `uid_fk_idx` (`user_id` ASC),
  CONSTRAINT `sk_fk`
    FOREIGN KEY (`skill_id`)
    REFERENCES `skills` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `uid_fk`
    FOREIGN KEY (`user_id`)
    REFERENCES `user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

