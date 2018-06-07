
select * from user_table;
select * from purchase_table;
select * from sell_table;

--그냥 넣은 값
insert into user_table(u_id, u_pw, u_name) values('hen4482', '12345', '박재현');
insert into user_table(u_id, u_pw, u_name) values('hfeu34', '3432', 'AAA');
insert into user_table(u_id, u_pw, u_name) values('djipogr1', '4444', 'BBB');

drop table user_table
--유저 테이블
create table user_table(
	u_id varchar(20) primary key,--유저아이디
	u_pw varchar(20) not null,--비밀번호
	u_name varchar(8) not null,--유저이름
	u_money  default 0--유저 현금 보유량 : 기본 0원
);

create table user_table2(
	u_id varchar2(20) primary key,--유저아이디
	u_pw varchar2(20) not null,--비밀번호
	u_name varchar2(8) not null,--유저이름
	u_money number default 0--유저 현금 보유량 : 기본 0원
);

insert into user_table2(u_id, u_pw, u_name) values ('id1', 'pass1', 'name1')

select * from user_table where u_id = 'id1';

--매입 테이블
create table purchase_table(
	u_id varchar(20),--유저아이디-외래키
	p_name varchar(10),--코인이름
	p_date date,--매입날짜
	p_price int,--매수했을때 가격
	p_amount decimal(20,8)--매수 수량 double형과 같고 총 자릿수20자리에 8자리는 소수점을 의미
);
--외래 키 설정
alter table purchase_table add constraint fk_p_table_u_id 
foreign key(u_id) references user_table(u_id) on delete cascade

--그냥 넣은 값
insert into purchase_table values('hen4482', 'BTC', '18/04/05', 12300, 0.875);

--매수 테이블
create table sell_table(
	u_id varchar(20),--유저아이디-외래키
	s_name varchar(10),--코인이름
	s_date date,--매수날짜
	s_price int,--매수했을때 가격
	s_amount decimal(20,8)--매수 수량
);
--외래 키 설정
alter table sell_table add constraint fk_s_table_u_id 
foreign key(u_id) references user_table(u_id) on delete cascade

drop table purchase_table
drop table 
--임시로 넣은 값
insert into sell_table values('hen4482', 'BTC', '18/04/07', 17600, 0.4);
insert into purchase_table values('hen4482', 'BTC', '18/05/29',7500000, 1.23232);
insert into sell_table values('hen4482', 'BTC', '18/04/27', 705000, 0.235);
insert into virtualmoney_table values('djipogr1', 'BTC', '18/05/27', 705000, 3.345543);


--유저와 관계된 필요한 정보를 가져오는 SQL
--유저 이름, 유저명, 유저현금, 
--매입코인명, 매입날짜, (매입당시의)시세, 매입량
--매수코인명, 매수날짜, (매수당시의)시세, 매수량,
select USER_TABLE.u_id,u_name,u_money, 
PURCHASE_TABLE.p_name,p_date,p_price,p_amount,
SELL_TABLE.s_name,s_date,s_price,s_amount
from USER_TABLE left join PURCHASE_TABLE on USER_TABLE.u_id = PURCHASE_TABLE.u_id
left join SELL_TABLE on USER_TABLE.u_id = SELL_TABLE.u_id


--매입정보 볼 때 사용할 것
--유저 이름, 유저명, 유저현금, 
--매입코인명, 매입날짜, (매입당시의)시세, 매입량
select USER_TABLE.u_id,u_name,u_money, 
PURCHASE_TABLE.p_name,p_date,p_price,p_amount
from USER_TABLE left join PURCHASE_TABLE on USER_TABLE.u_id = PURCHASE_TABLE.u_id


--매수정보 볼 때 사용할 것
--유저 이름, 유저명, 유저현금, 
--매수코인명, 매수날짜, (매수당시의)시세, 매수량,
select USER_TABLE.u_id,u_name,u_money, 
SELL_TABLE.s_name,s_date,s_price,s_amount
from USER_TABLE left join SELL_TABLE on USER_TABLE.u_id = SELL_TABLE.u_id

--로그인 할 때는 아이디랑 이름만 메인으로

--자본금 공식 => 현금 + (코인량*당시시세)
--비트코인량 공식 => 총 매수량 - 총 매입량 
--sql에서 select sum(매수량 또는 매입량) 을 하면 총매수량(또는 총 매입량)을 구할 수 있다



















