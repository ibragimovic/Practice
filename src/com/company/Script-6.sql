create table visitors (
id integer primary key,
full_name varchar(100) not null,
date_of_birth varchar(50) not null,
gender varchar(10) not null
);

insert into visitors(id, full_name, date_of_birth, gender) values(1, 'Shamil', '01.01.2001', 'M');
insert into visitors(id, full_name, date_of_birth, gender) values(2, 'Aigerim', '01.01.2001', 'F');
insert into visitors(id, full_name, date_of_birth, gender) values(3, 'Nick', '01.01.2001', 'M');

select * from visitors;

create table teachers (
id integer primary key,
name varchar(10) not null,
subject varchar(50) not null
);

insert into teachers (id, name, subject) values(1, 'Max', 'math');
insert into teachers (id, name, subject) values(2, 'Pierre', 'java');
insert into teachers (id, name, subject) values(3, 'John', 'history');

select * from teachers;



create table visits (
id integer primary key,
visitor_id integer not null references visitors(id),
visit_time timestamp not null,
teacher_id integer not null references teachers(id)
);



insert into visits(id, visitor_id, visit_time, teacher_id) values(1, 1, '2021-02-01 9:30:00', 1);
insert into visits(id, visitor_id, visit_time, teacher_id) values(2, 2, '2021-02-01 12:00:00', 2);
insert into visits(id, visitor_id, visit_time, teacher_id) values(3, 1, '2021-02-01 10:00:00', 1);
insert into visits(id, visitor_id, visit_time, teacher_id) values(4, 2, '2021-02-01 8:00:00', 2);
insert into visits(id, visitor_id, visit_time, teacher_id) values(5, 3, '2021-02-01 11:30:00', 3);
insert into visits(id, visitor_id, visit_time, teacher_id) values(6, 3, '2021-02-01 11:30:00', 2);
insert into visits(id, visitor_id, visit_time, teacher_id) values(7, 1, '2021-02-01 11:30:00', 1);

select * from visits;

