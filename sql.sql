SELECT* FROM member;

alter table member rename column reg_date to regdate;
alter table member modify password varchar(300);
alter table member rename column password to pw;
alter table member rename column address to addr;
alter table member rename column mempoint to pt;

desc member;
select * from board;
drop table board;

create table board(seq number primary key,
title varchar2(100) not null,
content varchar2(1000) not null,
nickname varchar2(20),
regdate date default sysdate,
visited INT DEFAULT 0);
commit;