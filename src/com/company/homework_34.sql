/*Home work 34*/
/*Task A*/
create table visitors(
id integer primary key,
full_name varchar(100) not null,
date_of_birth timestamp,
gender varchar(10) not null
);

select * from visitors;

insert into visitors values (1, 'Musaev Ibragim', '1988-12-03', 'M');
insert into visitors values (2, 'Mirlan Duyishenbaev', '1987-05-17', 'M');
insert into visitors values (3, 'Seitaliev Talgat', '2014-01-15', 'M');
insert into visitors values (4, 'Abubakirova Aruujan', '2018-08-28', 'F');
insert into visitors values (5, 'Seitaliev Amir', '2015-04-30', 'M');
insert into visitors values (6, 'Valieva Leila', '1962-02-20', 'F');
insert into visitors values (7, 'Musaeva Nargiza', '1990-08-17', 'F');
insert into visitors values (8, 'Ruslan kyzy Meerim', '1990-06-20', 'F');
insert into visitors values (9, 'Seitaliev Jenish', '1989-05-09', 'M');


create table subject(
id serial primary key,
subject_name varchar(50) not null,
salary integer
);

insert into subject(subject_name, salary) values ('JAVA', '150000');
insert into subject(subject_name, salary) values ('Kids programming', '80000');
insert into subject(subject_name, salary) values ('C#', '120000');
insert into subject(subject_name, salary) values ('Swimming', '35000');
insert into subject(subject_name, salary) values ('Investing courses', '75000');
insert into subject(subject_name, salary) values ('JavaScript', '135000');
insert into subject(subject_name, salary) values ('Football', '25000');

select * from subject;

create table teacher(
teacher_id serial primary key,
full_name varchar(100) not null,
subject_id integer references subject(id),
phone_number varchar(15),
email varchar (100)
);

insert into teacher(full_name, subject_id, phone_number, email) values('Temirbekova Sabina', 1, '705148569', 'temirbekovasabina@gmail.com');
insert into teacher(full_name, subject_id, phone_number, email) values('Musaev Ibragim', 2, '702178887', 'm.ibragim@gmail.com');
insert into teacher(full_name, subject_id, phone_number, email) values('Musaev Samat', 6, '772158963', 'musaevsamat@gmail.com');
insert into teacher(full_name, subject_id, phone_number, email) values('Michel Phelps', 4, '85965458587', 'michelphelps@gmail.com');
insert into teacher(full_name, subject_id, phone_number, email) values('Brian Tracy', 5, '5545478845445', 'briantracy@gmail.com');
insert into teacher(full_name, subject_id, phone_number, email) values('Nina Berikova', 3, '+5555141141454', 'nberikova@gmail.com');
insert into teacher(full_name, subject_id, phone_number, email) values('Alex Ferguson', 1, '5464654545824', 'manchesterbossa@gmail.com');

select * from teacher;

create table visit (
id integer primary key,
visitor_id integer not null references visitors(id),
visit_time timestamp not null,
teacher_id integer not null references teacher(teacher_id)
);

select * from visit;
drop table visit;

insert into visit values(1, 1, '2021-06-25 19:00', 1);
insert into visit values(2, 2, '2021-06-25 16:00', 3);
insert into visit values(3, 3, '2021-06-25 15:30', 2);
insert into visit values(4, 4, '2021-06-25 15:30', 2);
insert into visit values(5, 5, '2021-06-25 15:30', 2);
insert into visit values(6, 6, '2021-06-25 10:00', 4);
insert into visit values(7, 7, '2021-06-25 17:00', 6);
insert into visit values(8, 8, '2021-06-25 20:00', 5);
insert into visit values(9, 9, '2021-06-25 19:30', 7);

insert into visit values(10, 1, '2021-06-28 19:00', 1);
insert into visit values(11, 2, '2021-06-28 16:00', 3);
insert into visit values(12, 3, '2021-06-28 15:30', 2);
insert into visit values(13, 4, '2021-06-28 15:30', 2);
insert into visit values(14, 5, '2021-06-28 15:30', 2);
insert into visit values(15, 6, '2021-06-28 10:00', 4);
insert into visit values(16, 7, '2021-06-28 17:00', 6);
insert into visit values(17, 8, '2021-06-28 20:00', 5);
insert into visit values(18, 9, '2021-06-28 19:30', 7);

select * from visit;

select visitors.full_name, visit.visit_time, teacher.full_name
from visit
left join visitors on visit.visitor_id = visitors.id
join teacher on visit.teacher_id = teacher.teacher_id
order by visit.visit_time desc;
/*==================================================================*/

/*Task B*/

create table university(
	id serial not null,
	university_name varchar(150) not null,
	primary key(id)
);

insert into university(university_name) values ('КГУСТА');
insert into university(university_name) values ('Политех');
insert into university(university_name) values ('КНУ');
insert into university(university_name) values ('КГМА');
insert into university(university_name) values ('АУЦА');



create table faculty(
	id serial primary key,
	faculty_name varchar(150) not null,
	university integer references university(id) not null
);

insert into faculty(faculty_name, university) values('Теплогазоснабжение и вентиляция', 1);
insert into faculty(faculty_name, university) values('Водоснабжение и водоотведения', 1);
insert into faculty(faculty_name, university) values('Электроснабжение больших подстанций', 2);
insert into faculty(faculty_name, university) values('Финансы и кредит', 3);
insert into faculty(faculty_name, university) values('Стоматологический факультет', 4);
insert into faculty(faculty_name, university) values('Экономический факультет', 5);




create table group_student(
	id serial not null,
	faculty_id integer references faculty(id) not null,
	group_code varchar(50) not null,
	primary key(id)
);

insert into group_student (faculty_id, group_code) values(1, 'ТВ-1-07');
insert into group_student (faculty_id, group_code) values(2, 'ВВ-1-07');
insert into group_student (faculty_id, group_code) values(3, 'ЭБП-1-12');
insert into group_student (faculty_id, group_code) values(4, 'ФК-1-06');
insert into group_student (faculty_id, group_code) values(5, 'СТОМ-1-08');
insert into group_student (faculty_id, group_code) values(6, 'EF-2-08');




create table student(
	id serial not null,
	full_name varchar(100) not null,
	group_student_id integer references group_student(id) not null,
	date_of_birth varchar(30) not null,
	primary key(id)
);

insert into student(full_name, group_student_id, date_of_birth) values('Мусаев Ибрагим Абубакирович', 1, '03.12.1988');
insert into student(full_name, group_student_id, date_of_birth) values('Сыпабеков Абылбек Сыпабекович', 1, '30.09.1989');
insert into student(full_name, group_student_id, date_of_birth) values('Каримова Малика', 2, '01.10.1990');
insert into student(full_name, group_student_id, date_of_birth) values('Батырбекова Жибек', 2, '03.12.1988');
insert into student(full_name, group_student_id, date_of_birth) values('Нагима', 2, '25.11.1990');
insert into student(full_name, group_student_id, date_of_birth) values('Дуйшенбаев Мирлан Джолдошбекович', 3, '17.05.1987');
insert into student(full_name, group_student_id, date_of_birth) values('Ахметжанов Тимур Насипбуллаевич', 4, '06.06.1989');
insert into student(full_name, group_student_id, date_of_birth) values('Абдуналиев Кубат Аскарбекович', 5, '28.11.1990');
insert into student(full_name, group_student_id, date_of_birth) values('Руслан кызы Мээрим', 6, '20.06.1990');
insert into student(full_name, group_student_id, date_of_birth) values('Мамбетов Канат Басарбекович', 6, '31.07.1988');

select * from student;

create table course(
	id serial not null,
	course_name varchar(50) not null,
	primary key(id)
);
select * from course;

insert into course(course_name) values('Теплоснабжение');
insert into course(course_name) values('Газоснабжение');
insert into course(course_name) values('Сопративление материалов');
insert into course(course_name) values('Высшая математика');
insert into course(course_name) values('Водоснабжение');
insert into course(course_name) values('Водоотведение');
insert into course(course_name) values('Электроснабжение больших подстанций');
insert into course(course_name) values('Генрация и выработка электроэнергии');
insert into course(course_name) values('Макроэкономика');
insert into course(course_name) values('Кредитование малых предприятий');
insert into course(course_name) values('Финансы');
insert into course(course_name) values('Хирургия лица');
insert into course(course_name) values('Фармацевтика');
insert into course(course_name) values('Имплантация зуба');
insert into course(course_name) values('financial management');
insert into course(course_name) values('macro- and microeconomics');
insert into course(course_name) values('accounting and analysis');






create table grade(
	id serial not null,
	student_id integer references student(id) not null,
	grade integer not null,
	course_id integer references course(id),
	primary key(id)
);


insert into grade(student_id, grade, course_id) values(1, 10, 1);
insert into grade(student_id, grade, course_id) values(1, 10, 2);
insert into grade(student_id, grade, course_id) values(1, 10, 3);
insert into grade(student_id, grade, course_id) values(1, 10, 4);

insert into grade(student_id, grade, course_id) values(2, 9, 1);
insert into grade(student_id, grade, course_id) values(2, 8, 2);
insert into grade(student_id, grade, course_id) values(2, 8, 3);
insert into grade(student_id, grade, course_id) values(2, 7, 4);

insert into grade(student_id, grade, course_id) values(3, 7, 3);
insert into grade(student_id, grade, course_id) values(3, 8, 4);
insert into grade(student_id, grade, course_id) values(3, 10, 5);
insert into grade(student_id, grade, course_id) values(3, 10, 6);

insert into grade(student_id, grade, course_id) values(4, 6, 3);
insert into grade(student_id, grade, course_id) values(4, 7, 4);
insert into grade(student_id, grade, course_id) values(4, 9, 5);
insert into grade(student_id, grade, course_id) values(4, 9, 6);

insert into grade(student_id, grade, course_id) values(5, 8, 3);
insert into grade(student_id, grade, course_id) values(5, 9, 4);
insert into grade(student_id, grade, course_id) values(5, 7, 5);
insert into grade(student_id, grade, course_id) values(5, 10, 6);

insert into grade(student_id, grade, course_id) values(6, 10, 4);
insert into grade(student_id, grade, course_id) values(6, 9, 7);
insert into grade(student_id, grade, course_id) values(6, 10, 8);

insert into grade(student_id, grade, course_id) values(7, 8, 9);
insert into grade(student_id, grade, course_id) values(7, 7, 10);
insert into grade(student_id, grade, course_id) values(7, 5, 11);

insert into grade(student_id, grade, course_id) values(8, 1, 12);
insert into grade(student_id, grade, course_id) values(8, 2, 13);
insert into grade(student_id, grade, course_id) values(8, 2, 14);

insert into grade(student_id, grade, course_id) values(9, 8, 15);
insert into grade(student_id, grade, course_id) values(9, 9, 16);
insert into grade(student_id, grade, course_id) values(9, 10, 17);

insert into grade(student_id, grade, course_id) values(10, 7, 15);
insert into grade(student_id, grade, course_id) values(10, 7, 16);
insert into grade(student_id, grade, course_id) values(10, 6, 17);


select student.full_name, group_student.group_code, faculty.faculty_name,  university.university_name
from student
join group_student on student.group_student_id = group_student.id
join faculty on student.group_student_id = group_student.id and group_student.faculty_id = faculty.id
join university on student.group_student_id = group_student.id and group_student.faculty_id = faculty.id and faculty.university = university.id;

select avg(grade) from grade group by student_id = 1;

/*select student.full_name, avg(grade.grade) as average_grade
from student
join grade on grade.student_id = student.id
group by grade.student_id;

select avg(grade) from grade group by student.full_namefull_name;*/


/*============================================================================================*/
/*TASK C*/

create table it_course(
	id serial not null,
	course_name varchar(20),
	primary key(id)
);

insert into it_course(course_name) values('JAVA');
insert into it_course(course_name) values('PYTHON');
insert into it_course(course_name) values('JavaScript');
insert into it_course(course_name) values('C#');
insert into it_course(course_name) values('FrontEnd');
insert into it_course(course_name) values('Kotlin');




create table trainer(
	id serial not null,
	trainer_name varchar(100) not null,
	course_id integer references it_course(id) not null,
	salary integer not null,
	phone_number varchar(15),
	email varchar(60) not null,
	primary key(id)
);


insert into trainer(trainer_name, course_id, salary, phone_number, email) values('Musaev Ibragim', 1, 250000,  '702178887', 'm.ibragim88@gmail.com');
insert into trainer(trainer_name, course_id, salary, phone_number, email) values('Mambetov Kanat', 2, 150000, '758458854', 'kanomambetov@gmail.com');
insert into trainer(trainer_name, course_id, salary, phone_number, email) values('Musaev Samat', 3, 125000, '555896632', 'samatmusaev@gmail.com');
insert into trainer(trainer_name, course_id, salary, phone_number, email) values('Dyishenbaev Mirlan', 4, 200000,  '4565451224', 'dyishenbaevmirlan@gmail.com');
insert into trainer(trainer_name, course_id, salary, phone_number, email) values('Baktybekova Bermet', 5, 80000, '454551254', 'baktybekovabermet@gmail.com');
insert into trainer(trainer_name, course_id, salary, phone_number, email) values('Baktybekova Bermet', 6, 100000, '454551254', 'baktybekovabermet@gmail.com');


create table reviewer(
	id serial not null,
	reviewer_name varchar(100) not null,
	course_id integer references it_course(id) not null,
	salary integer not null,
	phone_number varchar(15),
	email varchar(60) not null,
	primary key(id)
);

insert into reviewer(reviewer_name, course_id, salary, phone_number, email) values('Satarov Shamil', 1, 180000, '0705157587', 'shamilsatarov@gmail.com');
insert into reviewer(reviewer_name, course_id, salary, phone_number, email) values('Kanimetov Bakyt', 2, 150000, '072587445', 'kanimetov@gmail.com');
insert into reviewer(reviewer_name, course_id, salary, phone_number, email) values('Jamanbaeva Aigerim', 3, 112000, '0556782745', 'ajamanbaeva@gmail.com');
insert into reviewer(reviewer_name, course_id, salary, phone_number, email) values('Niyazaliev Ular', 4, 175000, '0558789963', 'uniyazaliev@gmail.com');
insert into reviewer(reviewer_name, course_id, salary, phone_number, email) values('Baktybekov Dastan', 5, 115000, '0774586932', 'dastanbaktybekov@gmail.com');
insert into reviewer(reviewer_name, course_id, salary, phone_number, email) values('Ruslan kyzy Tumaruuz', 6, 115000, '0705412165', 'tumaruuz@gmail.com');




create table it_student(
	id serial not null,
	student_name varchar(100) not null,
	course_id integer references it_course(id) not null,
	phone_number varchar(15),
	email varchar(60) not null,
	primary key(id)
);

insert into it_student(student_name, course_id, phone_number, email) values('Musaeva Nargiza', 1, '707170890', 'musaevanargiza@gmail.com');
insert into it_student(student_name, course_id, phone_number, email) values('Seitaliev Talgat', 2, '754545465', 'talgat@gmail.com');
insert into it_student(student_name, course_id, phone_number, email) values('Seitaliev Amir', 3, '707170565', 'amir@gmail.com');
insert into it_student(student_name, course_id, phone_number, email) values('Abubakirova Aruujan', 4, '707170890', 'aruujan@gmail.com');
insert into it_student(student_name, course_id, phone_number, email) values('Musaev Nursultan', 5, '707170890', 'nursultan@gmail.com');
insert into it_student(student_name, course_id, phone_number, email) values('Musaev Dastan', 6, '707170890', 'dastan@gmail.com');


create table lesson(
	id serial not null,
	lesson varchar(150) not null,
	date_lesson date,
	trainer_id integer references trainer(id) not null,
	primary key(id)
);

insert into lesson(lesson, date_lesson, trainer_id) values('Введение в базу данных', '27-06-2021', 1);
insert into lesson(lesson, date_lesson, trainer_id) values('Введение в базу данных', '27-06-2021', 2);
insert into lesson(lesson, date_lesson, trainer_id) values('Введение в базу данных', '27-06-2021', 3);
insert into lesson(lesson, date_lesson, trainer_id) values('Введение в базу данных', '27-06-2021', 4);
insert into lesson(lesson, date_lesson, trainer_id) values('Введение в базу данных', '27-06-2021', 5);
insert into lesson(lesson, date_lesson, trainer_id) values('Введение в базу данных', '27-06-2021', 6);


create table homework(
	id serial not null,
	homework varchar(150) not null,
	deadline date not null,
	lesson_id integer references lesson(id) not null,
	primary key(id)
);

insert into homework(homework, deadline, lesson_id) values('SQL', '28-06-2021', 1);
insert into homework(homework, deadline, lesson_id) values('SQL', '28-06-2021', 2);
insert into homework(homework, deadline, lesson_id) values('SQL', '28-06-2021', 3);
insert into homework(homework, deadline, lesson_id) values('SQL', '28-06-2021', 4);
insert into homework(homework, deadline, lesson_id) values('SQL', '28-06-2021', 5);
insert into homework(homework, deadline, lesson_id) values('SQL', '28-06-2021', 6);


create table homework_grade(
	id serial not null,
	student_id integer references it_student(id) not null,
	homework_id integer references homework(id) not null,
	grade integer not null,
	primary key(id)
);

insert into homework_grade(student_id, homework_id, grade) values(1, 1, 10);
insert into homework_grade(student_id, homework_id, grade) values(2, 2, 10);
insert into homework_grade(student_id, homework_id, grade) values(3, 3, 10);
insert into homework_grade(student_id, homework_id, grade) values(4, 4, 10);
insert into homework_grade(student_id, homework_id, grade) values(5, 5, 10);
insert into homework_grade(student_id, homework_id, grade) values(6, 6, 10);


select it_student.student_name, it_course.course_name, trainer.trainer_name, reviewer.reviewer_name, homework_grade.grade
from it_student
join homework_grade on homework_grade.student_id = it_student.id
join it_course on it_student.course_id = it_course.id
join trainer on it_student.course_id = it_course.id and it_course.id = trainer.course_id
join reviewer on it_student.course_id = it_course.id and it_course.id = reviewer.course_id;




























