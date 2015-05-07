insert into instrument (type, producer, prod_date, purch_date) values ('Grand piano', 'August Förster', '1980-07-30', '1999-08-13');
insert into instrument (type, producer, prod_date, purch_date) values ('Guitar', 'Gibson', '1992-05-05', '2004-09-07');
insert into instrument (type, producer, prod_date, purch_date) values ('Violin', 'Carlo Giordano', '1995-02-25', '2003-11-27');

insert into student (instrument_id, first_name, last_name, birth_date) values (1, 'Nika', 'Renaud', '1980-07-30');
insert into student (instrument_id, first_name, last_name, birth_date) values (1, 'Robert', 'Wild', '1990-11-02');
insert into student (instrument_id, first_name, last_name, birth_date) values (3, 'John', 'Smith', '1964-02-28');

insert into composition (title, author) values ('Joke', 'Bach');
insert into composition (title, author) values ('Symphony №40', 'Mozart');
insert into composition (title, author) values ('Moonlight Sonata', 'Beethoven');

insert into performance (composition_id) values (1);
insert into performance (composition_id) values (2);
insert into performance (composition_id) values (3);

insert into performance_participants (performance_id, student_id) values (1, 1);
insert into performance_participants (performance_id, student_id) values (2, 1);
insert into performance_participants (performance_id, student_id) values (1, 3);