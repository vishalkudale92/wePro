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



create table skills(
	id int not null auto_increment,
	name varchar(255) not null,
	primary key(id)
);


create table project_skills(
	project_id int not null,
	skill_name varchar(255) not null
);