SELECT* FROM member;

alter table member rename column reg_date to regdate;
alter table member modify password varchar(300);
alter table member rename column password to pw;
alter table member rename column address to addr;
alter table member rename column mempoint to pt;

desc member;