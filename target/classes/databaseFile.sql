drop table emp;
create table emp(empno number(6), ename varchar(25), esal number(7), job varchar(18), hiredate date);
insert into emp values(101,'Ujjawal Raj',45000,'Soft Engineer','03-mar-2016');
insert into emp values(102,'Kundan Kumar',48000,'Soft Engineer','15-jan-2011');
drop procedure Proc1;
create or replace Procedure Proc1(eno in number, name out varchar2, exp out number)
is
d1 date;
d2 date;
begin
select ename into name from emp where empno=eno;
select hiredate into d1 from emp where empno=eno;
select sysdate into d2 from dual;
exp := (d2-d1)/365;
end;
/
commit;