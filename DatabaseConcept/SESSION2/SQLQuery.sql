--use DevangiGohelDB;

--create table employee(ID int PRIMARY KEY,FirstName varchar(30),LastName varchar(30),City varchar(30));

--insert into employee values(1,'aaa','aaa','a');

--insert into employee values(2,'tapan','shah','ahm');

--insert into employee values(3,'dip','kumar','rjt');

--insert into employee values(4,'nihar','sharma','ahm');

--insert into employee values(5,'monish','bhatia','jngh');

--insert into employee values(6,'kalindi','chauhan','ahm');

--select * from employee;

--select * from employee where id=1;

--select * from employee where FirstName='aaa';

--select id,city from employee;

--CREATE PROCEDURE SelectAll @City nvarchar(30)

--AS

--SELECT * FROM employee WHERE City = @City;

--GO

--EXEC SelectAll @City = "RJT";

--SELECT DISTINCT(City) FROM employee;

--select d.FirstName from employee AS d; 

--CREATE TABLE employee2(ID int,Age int);

--insert into employee2 values(1,20);

--insert into employee2 values(2,34);

--insert into employee2 values(3,45);

--insert into employee2 values(10,30);
--select * from employee order by FirstName;

--select * from employee order by FirstName desc;

--SELECT * FROM employee2;

--SELECT * FROM employee INNER JOIN employee2 ON employee.ID= employee2.ID WHERE employee.ID = 3;

--SELECT * FROM employee AS d LEFT JOIN employee2 AS d2 ON d.ID = d2.ID;

--SELECT * FROM employee AS d RIGHT JOIN employee2 AS d2 ON d.ID = d2.ID;

--SELECT * FROM employee AS d FULL JOIN employee2 AS d2 ON d.ID = d2.ID;
--UPDATE EMPLOYEE SET FirstName='A' WHERE id=1;


--SELECT * FROM employee;

--SELECT COUNT(*) FROM employee;

--SELECT COUNT(*) FROM employee2;

--SELECT COUNT(ID), City FROM employee GROUP BY City;

--CREATE PROCEDURE p
--AS
--BEGIN

   --SELECT e.FirstName,e.LastName
   --FROM employee e
  -- INNER JOIN employee e2 ON e.id=e2.id;
--END
