drop database if exists Bee;
create database if not exists Bee;
use Bee;
create table student
(
    id          int,
    name        varchar(50)        not null,
    age         int                not null check ( age > 0 | age < 150 ),
    gender      enum ('male','female') default 'male',
    phone       varchar(11) unique not null,
    birthday    date               not null,
    email       varchar(100)       not null unique,
    create_time datetime               default current_timestamp,
    update_time datetime               default current_timestamp
);
insert into student
values (1, 'qwq', 149, 'female', '11111111111', '1111-11-11', 'email@example.com', now(), now());
select *
from student;