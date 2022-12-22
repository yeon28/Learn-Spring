drop table users;

CREATE TABLE USERS (
	ID VARCHAR2(8) PRIMARY KEY,
	PASSWORD VARCHAR2(8),
	NAME VARCHAR2(20),
	ROLE VARCHAR2(5)
);
insert into USERS (id, password, name, role) values('1111', '1234', '관리자', 'admin');
insert into USERS (id, password, name, role) values('2222', '1234', '사용자', 'user');

select * from users;
select * from board ORDER by seq;

COMMIT;