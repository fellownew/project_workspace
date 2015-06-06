drop table cart;
drop table orders;
drop table center;
drop table pboard;
drop table product;
drop table seller;
drop table buyer;

select * from seller
select * from orders
select * from buyer
select * from product
select * from RECIPIENT

alter table  
insert into orders (order_id,product_id,amount,status,buyer_id,seller_id)
values('7',62,6,'배송중','buyer-3','seller-1');

delete from orders
where seller_id='seller-1'

create table buyer(
   buyer_id varchar2(20) primary key,
   password varchar2(50) not null,
   name varchar2(12) not null,
   address varchar2(100) not null,
   email varchar2(20) not null,
   phone varchar2(30) not null
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
   corporate_number varchar2(12) not null
);

select * from recipient
create table product(
   product_id number primary key,
   product_name varchar2(50) not null,
   product_price number not null,
   category varchar2(20) not null,
   product_info varchar2(2000) not null,
   image_path varchar2(200) not null,
   regi_date varchar2(10) not null,
   exp_date varchar2(10) not null,
   seller_id varchar2(20),
   
   constraint product_seller_id_fk foreign key(seller_id) references seller(seller_id) ON DELETE CASCADE
);



create table cart(
   buyer_id varchar2(20),
   product_id number,
   amount number,
   
   constraint cart_buyer_id_fk foreign key(buyer_id) references buyer(buyer_id) ON DELETE CASCADE,
   constraint cart_product_id_fk foreign key(product_id) references product(product_id) ON DELETE CASCADE
);

select * from orders
update ORDERS
set RECIPIENT_ID = 1
where buyer_id = 'secret88'

select * from orders
create table orders(
   order_id varchar2(10) primary key,
   product_id number,
   amount number,
   status varchar2(10),
   buyer_id varchar2(20),
   
   constraint order_product_id_fk foreign key(product_id) references product(product_id) ON DELETE CASCADE,
   constraint order_buyer_id_fk foreign key(buyer_id) references buyer(buyer_id) ON DELETE CASCADE
   alter table orders add(recipient_id number)
   alter table orders add constraint recipient_id_fk foreign key (recipient_id) references recipient(recipient_id);
);

create table center(
	board_no number primary key,
	title varchar2(20) not null,
	content varchar2(2000) not null,
	id varchar2(20) not null
);

create table pboard(
	board_no number primary key,
	title varchar2(20) not null,
	content varchar2(2000) not null,
	product_id number not null,
	buyer_id varchar2(20) not null,
	
	constraint pboard_product_id_pk foreign key(product_id) references product(product_id) ON DELETE CASCADE,
	constraint pboard_buyer_id_fk foreign key(buyer_id) references buyer(buyer_id) ON DELETE CASCADE

);

create table recipient(
	recipient_id number primary key,
	name varchar2(20) not null,
	address varchar2(100) not null,
	phone varchar2(13) not null,
	detail varchar2(200) not null
);

select * from RECIPIENT
create sequence recipient_no_seq

insert into recipient values(recipient_no_seq.nextval,'최지우','성남시 분당구','010-9687-3539','조심좀;;;');


insert into seller (seller_id,password,name,gender,address,email,phone,auth,admin,corporate_number)
values('seller-1','1111','홍길동','남','서울','df@df.com','010-1234-1234','true','false','1234-23125');

insert into seller (seller_id,password,name,gender,address,email,phone,auth,admin,corporate_number)
values('admin','admin','홍길동','남','서울','df@df.com','010-1234-1234','true','true','1111-11111');


insert into seller (seller_id,password,name,gender,address,email,phone,auth,admin,corporate_number)
values('seller-15','1111','홍길동','남','서울','df@df.com','010-1234-1234','true','false','1234-23125');

insert into seller (seller_id,password,name,gender,address,email,phone,auth,admin,corporate_number)
values('seller-16','1111','홍길동','남','서울','df@df.com','010-1234-1234','true','false','1234-23125');

insert into seller (seller_id,password,name,gender,address,email,phone,auth,admin,corporate_number)
values('seller-17','1111','홍길동','남','서울','df@df.com','010-1234-1234','true','false','1234-23125');

insert into seller (seller_id,password,name,gender,address,email,phone,auth,admin,corporate_number)
values('seller-18','1111','홍길동','남','서울','df@df.com','010-1234-1234','true','false','1234-23125');

insert into seller (seller_id,password,name,gender,address,email,phone,auth,admin,corporate_number)
values('seller-19','1111','홍길동','남','서울','df@df.com','010-1234-1234','true','false','1234-23125');

insert into seller (seller_id,password,name,gender,address,email,phone,auth,admin,corporate_number)
values('seller-20','1111','홍길동','남','서울','df@df.com','010-1234-1234','true','false','1234-23125');

insert into seller (seller_id,password,name,gender,address,email,phone,auth,admin,corporate_number)
values('seller-21','1111','홍길동','남','서울','df@df.com','010-1234-1234','true','false','1234-23125');
insert into seller (seller_id,password,name,gender,address,email,phone,auth,admin,corporate_number)
values('seller-22','1111','홍길동','남','서울','df@df.com','010-1234-1234','true','false','1234-23125');


select c_product_id.nextval from dual

select * from seller
select * from product
select * from buyer

select * from cart

insert into cart values('123456',61,2);
insert into cart values('123456',62,4);
insert into cart values('123456',63,15);
insert into cart values('123456',65,1);

select count(*)from product


select product_id,product_name,product_price,category,product_info,image_path,regi_date,exp_date,seller_id
from (
	select product_id,product_name,product_price,category,product_info,image_path,regi_date,exp_date,seller_id
		from product where category = 'fruit'
	order by DBMS_RANDOM.VALUE
	)
where (rownum <= 5)


