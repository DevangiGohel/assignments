 -- CREATE DATABASE DevangiGohelDB;
-- use DevangiGohelDB;
-- create table demo(ID int,FirstName varchar(30),LastName varchar(30),UserName varchar(30));
-- insert into demo values(1,'hill','flinstone','fred');
--SELECT* FROM demo;
--insert into demo values(2,'Homer','Simpson','homey');
-- insert into demo values(3,'Homer','Brown','notsofamous');
-- insert into demo values(4,'Ozzy','Ozzbourne','sabbath');
-- insert into demo values(5,'Homer','Gain','noplacelike');
--SELECT * FROM demo;
--SELECT * FROM demo where id=2;
--SELECT * FROM demo where FirstName='Homer';
--select id,FirstName from demo;
--select * from demo where UserName='fred';
-- select * from demo where FirstName='homer' AND LastName='gain';
--select * from demo where FirstName='homer' OR LastName='gain';
--select * from demo order by LastName;
--select * from demo order by FirstName desc;
--select top 2 * from demo;
--SELECT TOP 4 * FROM demo ORDER BY LastName DESC;
--SELECT DISTINCT(FirstName) FROM demo;
--SELECT * FROM demo WHERE LastName IN('gain','ozzbourne');
--select * from demo;
--select d.FirstName from demo AS d; 
--create table demo2(ID int,City varchar(30));
--insert into demo2 values(1,'abc');
-- insert into demo2 values(2,'aaa');
-- insert into demo2 values(3,'bbb');
-- insert into demo2 values(4,'ccc');
-- insert into demo2 values(5,'ddd');
-- insert into demo2 values(10,'eee');
--select * from demo2;
--SELECT * FROM demo INNER JOIN demo2 ON demo.ID= demo2.ID WHERE demo.ID = 2;
--SELECT * FROM demo AS d LEFT JOIN demo2 AS d2 ON d.ID = d2.ID;
--DELETE from demo2 where Id=5;
--select * from demo2;
--SELECT * FROM demo AS d LEFT JOIN demo2 AS d2 ON d.ID = d2.ID;
--SELECT * FROM demo AS d RIGHT JOIN demo2 AS d2 ON d.ID = d2.ID;
--SELECT * FROM demo AS d FULL JOIN demo2 AS d2 ON d.ID = d2.ID;
--update demo set FirstName='john' where id=1;
--select * from demo;
--update demo set FirstName='abc',LastName='pqr' where id=1;
--select * from demo;
--select count(*) from demo;
--select count(*) from demo2;
--SELECT COUNT(DISTINCT(FirstName)) FROM demo;
--CREATE INDEX ID ON demo (LastName);
--ALTER TABLE demo DROP COLUMN UserName;
--select * from demo;