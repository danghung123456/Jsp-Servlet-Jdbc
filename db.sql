DROP DATABASE jsp_servletDB

CREATE DATABASE jsp_servletDB;
USE jsp_servletDB;

create table role(
roleId bigint primary key not null,
roleName varchar(255),
code varchar(255)
);

create table user(
userId bigint primary key not null auto_increment,
roleId bigint not null,
userName varchar(255),
password varchar(255),
fullname varchar(255),
status int not null
);

alter table user add constraint fk_user_role foreign key (roleId) references role(roleId);

create table movie(
movieId bigint primary key NOT NULL AUTO_INCREMENT,
genreId bigint not null,
movieName varchar(255),
author varchar(255),
actor varchar(255),
views int,
movieDuration int,
movieThumbnail varchar(255),
movieDescription text
);



create table genre(
genreId bigint primary key NOT NULL AUTO_INCREMENT,
genreName varchar(255)
);

insert into genre(genreName) 
values("Hành động");
insert into genre(genreName) 
values("Tình cảm");
insert into genre(genreName) 
values("Hài hước");
insert into genre(genreName) 
values("Kinh dị");
insert into genre(genreName) 
values("Viễn tưởng-Phiêu lưu");
insert into genre(genreName) 
values("Hoạt hình");

alter table movie add constraint fk_movie_genre foreign key (genreId)  references genre(genreId);




INSERT INTO movie(genreId,movieName,author,actor,views,movieDuration,movieThumbnail)
 VALUES
 (1,"Người Nhện: Không còn nhà", "Alan Watts", "Tom Holland", 255000,124,
 "https://i.ytimg.com/vi/JfVOs4VSpmA/sddefault.jpg","mô tả phim");
 INSERT INTO movie(genreId,movieName,author,actor,views,movieDuration,movieThumbnail)
 VALUES
 (2,"Người Nhện: Không còn nhà", "Alan Watts", "Tom Holland 1", 255000,124,
 "https://i.ytimg.com/vi/JfVOs4VSpmA/sddefault.jpg");

update movie set movieName = "Người Nhện: Có ở nhà" where movieId = 1;


create table nation(
nationId bigint not null primary key auto_increment,
nationName varchar(255),
Code varchar(255)
);

insert into nation (nationName,Code) values("Nhật Bản","JB123456");


create table actor(
actorId bigint not null primary key auto_increment,
actorName varchar(255)
);


select * from movie
select * from genre
select * from nation
