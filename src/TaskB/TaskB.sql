create table people(
	people_id serial not null,
	first_name varchar(100) not null,
	last_name varchar(100) not null,
	date_of_birth varchar(15) not null,
	primary key(people_id)
);

create table country(
	country_id serial not null,
	name varchar(50) not null,
	population integer not null,
	president int references people(people_id),
	primary key(country_id)
);

create table city(
	city_id serial not null,
	name varchar(50) not null,
	country_id integer references country(country_id) not null,
	mayor integer references people(people_id),
	population integer not null,
	primary key(city_id)
);

--drop table people;
--drop table city;
--drop table country;
select * from country;
select * from people;
select * from city;

select *
from city
join people on city.mayor =  people.id
join country on city.country_id = country.id;