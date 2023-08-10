drop database if exists jsd2306;
create database if not exists jsd2306;
use jsd2306;
drop table if exists location;
create table if not exists location
(
    id     int primary key,
    city   varchar(100),
    center varchar(100),
    street varchar(100),
    post   varchar(20)
);
drop table if exists subject;
create table if not exists subject
(
    id        int primary key,
    className varchar(100),
    class     varchar(1000)
);
select * from location;
select * from subject;