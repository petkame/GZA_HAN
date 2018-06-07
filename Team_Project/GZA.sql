
--유저 테이블
create table user_table(
   u_id varchar(20) primary key,--유저아이디
   u_pw varchar(20) not null,--비밀번호
   u_name varchar(8) not null,--유저이름
   u_money int default 0--유저 현금 보유량 : 기본 0원
);
select * from user_table where u_name = 'name1' and u_pw = 'pass1'
--매입 테이블
create table purchase_table(
   u_id varchar(20),--유저아이디-외래키
   p_name varchar(10),--코인이름
   p_date date,--매입날짜
   p_price int,--매수했을때 가격
   p_amount decimal(20,8)--매수 수량 double형과 같고 총 자릿수20자리에 8자리는 소수점을 의미
);
alter table purchase_table add constraint fk_u_id 
foreign key(u_id) references user_table(u_id) on delete cascade

--매수 테이블
create table sell_table(
   u_id varchar(20),--유저아이디-외래키
   s_name varchar(10),--코인이름
   s_date date,--매수날짜
   s_price int,--매수했을때 가격
   s_amount decimal(20,8)--매수 수량
);
alter table sell_table add constraint fk_u_id 
foreign key(u_id) references user_table(u_id) on delete cascade

