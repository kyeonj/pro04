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
content varchar2(800) not null,
nickname varchar2(20),
regdate date,
visited number
);

insert into board values(1, '샘플 글 제목1입니다.', '여기는 샘플 글1에 대한 내용입니다.', 'admin', sysdate, 0);
insert into board values((select nvl(max(seq), 0)+1 from board), '샘플2 제목입니다.', '샘플글 2 여기는 샘플 글1에 대한 내용입니다.', 'admin', sysdate, 0);
insert into board values((select nvl(max(seq), 0)+1 from board), '샘플3 제목입니다.', '샘플글 3 여기는 샘플 글1에 대한 내용입니다.', 'admin', sysdate, 0);
insert into board values((select nvl(max(seq), 0)+1 from board), '샘플4 제목입니다.', '샘플글 4 여기는 샘플 글1에 대한 내용입니다.', 'admin', sysdate, 0);
insert into board values((select nvl(max(seq), 0)+1 from board), '샘플5 제목입니다.', '샘플글 5 여기는 샘플 글1에 대한 내용입니다.', 'admin', sysdate, 0);
commit;
select * from board where seq=2;

-- 파일 첨부가 가능한 자유 게시판
create table free(bno int primary key,  -- 글번호
title varchar2(100) not null,   -- 글제목
content varchar2(1500) not null,    -- 글내용
regdate date,   -- 작성일
visited int,    -- 조회수
id varchar2(20),    -- 작성자
rec int -- 추천수
);

create table member(id varchar2(20) primary key,
pw varchar2(300) not null,
name varchar2(50),
email varchar2(100) not null,
tel varchar2(20) not null,
addr1 varchar2(200),
addr2 varchar2(100),
postcode varchar2(10),
regdate date default sysdate,
birth date,
pt int default 100,
visited int default 0
);