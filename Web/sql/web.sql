drop database if exists web;
create database web;
use web;
create table users(
user_id int primary key auto_increment,
username varchar(255),
nickname varchar(255),
password varchar(255)
);

insert into users values(1, "taro", "tarochan", "123");
insert into users values(2, "jiro", "jirochan", "456");
insert into users values(3, "hanako", "hanakochan", "789");