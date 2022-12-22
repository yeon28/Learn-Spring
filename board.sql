drop table board;

CREATE TABLE BOARD (
	SEQ NUMBER(5) PRIMARY KEY,
	TITLE VARCHAR2(200),
	WRITER VARCHAR2(20),
	CONTENT VARCHAR2(2000),
	REGDATE DATE DEFAULT SYSDATE,
	CNT NUMBER(5) DEFAULT 0
);

CREATE TABLE BOARD (
	SEQ bigint auto_increment PRIMARY KEY,
	TITLE VARCHAR2(200),
	WRITER VARCHAR2(20),
	CONTENT VARCHAR2(2000),
	REGDATE DATE DEFAULT CURRENT_DATE(),
	CNT NUMBER(5) DEFAULT 0
);


insert into BOARD (seq, title, writer, content) values(1, '게시글1', '글쓴이1', '게시글 내용 1');
insert into BOARD (seq, title, writer, content) values(2, '게시글2', '글쓴이2', '게시글 내용 2');
insert into BOARD (seq, title, writer, content) values(3, '게시글3', '글쓴이3', '게시글 내용 3');
insert into BOARD (seq, title, writer, content) values(4, '게시글4', '글쓴이4', '게시글 내용 4');
insert into BOARD (seq, title, writer, content) values(5, '게시글5', '글쓴이5', '게시글 내용 5');
insert into BOARD (seq, title, writer, content) values(6, '게시글6', '글쓴이6', '게시글 내용 6');
insert into BOARD (seq, title, writer, content) values(7, '게시글7', '글쓴이7', '게시글 내용 7');
insert into BOARD (seq, title, writer, content) values(8, '게시글8', '글쓴이8', '게시글 내용 8');
insert into BOARD (seq, title, writer, content) values(9, '게시글9', '글쓴이9', '게시글 내용 9');
insert into BOARD (seq, title, writer, content) values(10, '게시글10', '글쓴이10', '게시글 내용 10');

select * from users;
select * from board ORDER by seq;

ROLLBACK;
COMMIT;
