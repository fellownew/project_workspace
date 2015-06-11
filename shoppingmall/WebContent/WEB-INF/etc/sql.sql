/*
 * 세팅용 sql문.
 */

drop table note;
drop table rnote;
drop table cart;
drop table orders;
drop table center;
drop table pboard;
drop table product;
drop table seller;
drop table buyer;
drop table recipient;

drop sequence c_note_no;
drop sequence recipient_no_seq;
drop sequence c_product_id;
drop sequence c_board_id;
drop sequence order_no;


create table note(
	note_no number primary key,
	title varchar2(50) not null,
	content varchar2(2000) not null,
	send_id varchar2(20) not null,
	receive_id varchar2(20) not null,
	send_date varchar2(20) not null,
	read varchar2(10),
	store varchar2(10)
);

create table rnote(
	note_no number primary key,
	title varchar2(50) not null,
	content varchar2(2000) not null,
	send_id varchar2(20) not null,
	receive_id varchar2(20) not null,
	send_date varchar2(20) not null,
	read varchar2(10),
	store varchar2(10)
);

create table buyer(
   buyer_id varchar2(20) primary key,
   password varchar2(50) not null,
   name varchar2(12) not null,
   address varchar2(100) not null,
   email varchar2(20) not null,
   phone varchar2(30) not null,
   postcode varchar2(10) not null
);

create table seller(
   seller_id varchar2(20) primary key,
   password varchar2(50) not null,
   name varchar2(12) not null,
   gender varchar2(6) not null,
   address varchar2(100) not null,
   email varchar2(20) not null,
   phone varchar2(30) not null,
   auth varchar2(10) not null,
   admin varchar2(10) not null,
   corporate_number varchar2(12) not null,
   postcode varchar2(10) not null
);

create table product(
   product_id number primary key,
   product_name varchar2(50) not null,
   product_price number not null,
   category varchar2(20) not null,
   product_info varchar2(2000) not null,
   image_path varchar2(200) not null,
   info_image_path varchar2(200) not null,
   regi_date varchar2(10) not null,
   exp_date varchar2(10) not null,
   seller_id varchar2(20),
   
   constraint product_seller_id_fk foreign key(seller_id) references seller(seller_id) ON DELETE CASCADE
);

create table center(
	board_no number primary key,
	title varchar2(20) not null,
	content varchar2(2000) not null,
	id varchar2(20) not null
);

create table recipient(
	recipient_id number primary key,
	name varchar2(20) not null,
	address varchar2(100) not null,
	phone varchar2(13) not null,
	detail varchar2(200) not null
	
);

create table cart(
   buyer_id varchar2(20),
   product_id number,
   amount number,
   
   constraint cart_buyer_id_fk foreign key(buyer_id) references buyer(buyer_id) ON DELETE CASCADE,
   constraint cart_product_id_fk foreign key(product_id) references product(product_id) ON DELETE CASCADE
);

create table orders(
   order_id number primary key,
   product_id number,
   amount number,
   status varchar2(20),
   buyer_id varchar2(20),
   recipient_id number,
   
   constraint order_product_id_fk foreign key(product_id) references product(product_id) ON DELETE CASCADE,
   constraint order_buyer_id_fk foreign key(buyer_id) references buyer(buyer_id) ON DELETE CASCADE,
   constraint recipient_id_fk foreign key (recipient_id) references recipient(recipient_id) ON DELETE CASCADE
);

create table pboard(
	board_no number primary key,
	title varchar2(200) not null,
	content varchar2(2000) not null,
	product_id number not null,
	buyer_id varchar2(20) not null,
	
	constraint pboard_product_id_pk foreign key(product_id) references product(product_id) ON DELETE CASCADE,
	constraint pboard_buyer_id_fk foreign key(buyer_id) references buyer(buyer_id) ON DELETE CASCADE

);

create table note(
   note_no number primary key,
   title varchar2(50) not null,
   content varchar2(2000) not null,
   send_id varchar2(20) not null,
   receive_id varchar2(20) not null,
   send_date varchar2(20) not null,
   read varchar2(10),
   store varchar2(10)
);




create sequence c_note_no;
create sequence recipient_no_seq;
create sequence c_product_id;
create sequence c_board_id;
create sequence order_no;
create sequence c_note_no;
select * from buyer
select * from orders
delete from orders
where amount between 1 and 20 
alter table recipient add (postcode varchar2(10) not null)
alter table orders add (regi_date varchar2(10) not null)
/*
 * 세팅용 sql문 끝
 */




/*
 * 각 DB selelt
 */

select * from seller;
select * from buyer;
select * from product;
select * from RECIPIENT;
select * from cart;
select * from orders;
select * from pboard;
select * from center;
select * from note;
select * from rnote;




/*
 * 참조 무결성 
 */
SELECT CONSTRAINT_NAME, TABLE_NAME, R_CONSTRAINT_NAME FROM USER_CONSTRAINTS
WHERE CONSTRAINT_NAME = 'table명'

insert into seller (seller_id,password,name,gender,address,email,phone,auth,admin,corporate_number,postcode)
values('admin','admin','콩콩콩','콩','콩콩','admin@taommall.co.kr','010-2222-2222','true','true','2222-22222','222-222');


select count(*)from product

/*
 * rownum 개수만큼 랜덤으로 뽑아옴.
 */
select product_id,product_name,product_price,category,product_info,image_path,regi_date,exp_date,seller_id
from (
	select product_id,product_name,product_price,category,product_info,image_path,regi_date,exp_date,seller_id
		from product where category = 'fruit'
	order by DBMS_RANDOM.VALUE
	)
where (rownum <= 5)




/*
 * test
 */
	select * from rnote
	delete from rnote where receive_id=123456 and note_no in(33,32)
