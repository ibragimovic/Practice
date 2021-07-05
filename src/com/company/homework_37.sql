
--HOMEWORK 37

--TASK A and B

create table sport_type(
	id serial not null,
	sport_types varchar(25) not null,
	salary Integer not null,
	primary key(id)
);

insert into sport_type(sport_types, salary) values('football', 15000);
insert into sport_type(sport_types, salary) values('basketball', 12000);
insert into sport_type(sport_types, salary) values('tennis', 16000);
insert into sport_type(sport_types, salary) values('swimming', 17000);
insert into sport_type(sport_types, salary) values('gym', 13000);

select * from sport_type;


create table trainer(
	id serial not null,
	trainer_full_name varchar(50) not null,
	sport_type integer references sport_type(id) not null,
	primary key(id)
);

insert into trainer(trainer_full_name, sport_type) values('Alex Ferguson', 1);
insert into trainer(trainer_full_name, sport_type) values('Musaeva Nargiza', 2);
insert into trainer(trainer_full_name, sport_type) values('Abubakirova Aruujan', 3);
insert into trainer(trainer_full_name, sport_type) values('Seitaliev Talgat', 4);
insert into trainer(trainer_full_name, sport_type) values('Seitaliev Amir', 5);

select * from trainer;


create table student(
	id serial not null,
	student_full_name varchar(50) not null,
	sport_type integer references sport_type(id) not null,
	primary key(id)
);

insert into student(student_full_name, sport_type) values('Maxim', 1);
insert into student(student_full_name, sport_type) values('Denis', 1);
insert into student(student_full_name, sport_type) values('Dmitriy', 1);
insert into student(student_full_name, sport_type) values('Anya', 2);
insert into student(student_full_name, sport_type) values('Aselya', 2);
insert into student(student_full_name, sport_type) values('Dinara', 2);
insert into student(student_full_name, sport_type) values('Ibragim', 3);
insert into student(student_full_name, sport_type) values('Meerim', 3);
insert into student(student_full_name, sport_type) values('Tuma', 3);
insert into student(student_full_name, sport_type) values('Kanykey', 4);
insert into student(student_full_name, sport_type) values('Vasya', 4);
insert into student(student_full_name, sport_type) values('Evgenyi', 4);
insert into student(student_full_name, sport_type) values('Evgenyi', 5);
insert into student(student_full_name, sport_type) values('Jenya', 5);
insert into student(student_full_name, sport_type) values('Alexandr', 5);

select * from student;

create table group_student(
	id serial not null,
	student_full_name varchar(50) not null,
	course varchar(10) not null,
	primary key(id)
);

insert into group_student(student_full_name, course) values('Ibragim', 'Java');
insert into group_student(student_full_name, course) values('Kanat', 'Python');
insert into group_student(student_full_name, course) values('Samat', 'JavaScript');
insert into group_student(student_full_name, course) values('Mirlan', 'C#');
insert into group_student(student_full_name, course) values('Nargiza', 'Java');
insert into group_student(student_full_name, course) values('Bermet', 'Kotlin');

SELECT * FROM group_student;

select trainer_full_name from trainer;

SELECT trainer.trainer_full_name, sport_type.salary FROM trainer JOIN sport_type on sport_type.id = trainer.sport_type;

SELECT SUM(sport_type.salary) FROM trainer JOIN sport_type ON sport_type.id = trainer.sport_type;

select count(id) from student;



--TASK C
create table people(
	id 				serial 			not null,
	first_name 		varchar(100) 	not null,
	last_name 		varchar(100) 	not null,
	date_of_birth 	date 			not null,
	primary key(id)
);

insert into people(first_name, last_name, date_of_birth) values ('Frank-Walter', 'Steinmeier', '5.01.1956');
insert into people(first_name, last_name, date_of_birth) values ('Dieter', 'Reiter', '19.05.1958');
insert into people(first_name, last_name, date_of_birth) values ('Alexander Boris', 'de Pfeffel Johnson', '19.06.1964');
insert into people(first_name, last_name, date_of_birth) values ('Sadiq', 'Aman Khan', '8.10.1970');
insert into people(first_name, last_name, date_of_birth) values ('Sadyr', 'Japarov Nurgojoevich', '6.12.1968');
insert into people(first_name, last_name, date_of_birth) values ('Baktybek', 'Kudaybergenov Japarovich', '8.12.1962');
insert into people(first_name, last_name, date_of_birth) values ('Ибрагим', 'Мусаев', '3.12.1988');


select * from people;



create table country(
	id		 		serial			not null,
	name 			varchar(70) 	not null,
	code			varchar(25)		not null,
	population		integer			not null,
	president		int 			references people(id),
	primary key(id)
);


insert into country(name, code, population, president) values ('Germany', '+49', 53733, 1);
insert into country(name, code, population, president) values ('England', '+44', 68207116, 1);
update country set population = 83756658 where id = 1;
update country set president = 3 where id = 2;
insert into country(name, code, population, president) values ('Kyrgyzstan', '+996', 6457000, 5);


select * from country;

create table city(
	id				serial			not null,
	name			varchar(70)		not null,
	country_id		integer			references country(id)		not null,
	mayor			integer			references people(id),
	population		integer			not null,
	primary key(id)
);

insert into city(name, country_id, mayor, population) values('London', 2, 4, 8982000);
insert into city(name, country_id, mayor, population) values('Munich', 1, 2, 1472000);
insert into city(name, country_id, mayor, population) values('Bishkek', 3, 6, 976734);
insert into city(name, country_id, mayor, population) values('Kant', 3, 7, 35698);

--Выбрать все города страны, название которой начинается на букву «К»
select ci.name, co.name
from city ci
join country co on co.id = ci.country_id
where ci.name like 'K%';

--Подсчитать общее количество человек в городах каждой страны.
select  country.name, sum(city.population) as population
from city
join country on city.country_id =  country.id
group by country.id;

--Добавить возможность добавления понятия «Гос. Языка» к каждой стране.
alter table country
add column official_language varchar(25);

update country
set official_language = 'German'
where country.name = 'Germany';

update country
set official_language = 'English'
where country.id = 2;

update country
set official_language = 'Kyrgyz'
where name like 'K%';

select * from country;
















