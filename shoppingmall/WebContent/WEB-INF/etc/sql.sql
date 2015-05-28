drop table cart;
drop table orders;
drop table product;
drop table seller;
drop table buyer;
drop table pboard;
drop table pboard;


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

create table product(
   product_id number primary key,
   product_name varchar2(20) not null,
   product_price number not null,
   category varchar2(20) not null,
   product_info varchar2(2000) not null,
   image_path varchar2(100) not null,
   regi_date varchar2(10) not null,
   exp_date varchar2(10) not null,
   seller_id varchar2(20),
   
   constraint product_seller_id_fk foreign key(seller_id) references seller(seller_id)
);

create table cart(
   buyer_id varchar2(20),
   product_id number,
   
   constraint cart_buyer_id_fk foreign key(buyer_id) references buyer(buyer_id),
   constraint cart_product_id_fk foreign key(product_id) references product(product_id)
);

create table orders(
   order_id varchar2(10) primary key,
   product_id number,
   amount number,
   status varchar2(10),
   buyer_id varchar2(20),
   
   constraint order_product_id_fk foreign key(product_id) references product(product_id),
   constraint order_buyer_id_fk foreign key(buyer_id) references buyer(buyer_id)
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
	
	constraint pboard_product_id_pk foreign key(product_id) references product(product_id),
	constraint pboard_buyer_id_fk foreign key(buyer_id) references buyer(buyer_id)

);










