create table buyer(
   buyer_id varchar2(20) primary key,
   password varchar2(50) not null,
   name varchar2(12) not null,
   address varchar2(100) not null,
   email varchar2(20) not null
);

create table seller(
   seller_id varchar2(20) primary key,
   password varchar2(50) not null,
   name varchar2(12) not null,
   gender varchar2(6) not null,
   address varchar2(100) not null,
   email varchar2(20) not null,
   phone varchar2(30) not null
);

create table cart(
   buyer_id varchar2(20),
   product_id varchar2(20),
   
   constraint cart_buyer_id_fk foreign key(buyer_id) references buyer(buyer_id),
   constraint cart_product_id_fk foreign key(product_id) references product(product_id)
);

create table product(
   product_id varchar2(20) primary key,
   product_name varchar2(20) not null,
   product_price number not null,
   category varchar2(20) not null,
   product_info varchar2(2000) not null,
   image_path varchar2(100) not null,
   regi_date varchar2(20) not null,
   exp_date varchar2(20) not null,
   seller_id varchar2(20),
   constraint product_seller_id_fk foreign key(seller_id) references seller(seller_id)
);

create table orders(
   order_id varchar2(10) primary key,
   product_id varchar2(20),
   amount number,
   status varchar2(10),
   buyer_id varchar2(20),
   
   constraint order_order_id_pk foreign key(product_id) references product(product_id),
   constraint order_buyer_id_fk foreign key(buyer_id) references buyer(buyer_id)
);

create sequence c_product_id;

select *
from buyer;

select *
from product;

select *
from cart;

select * 
from seller;

select *
from orders;

drop table buyer;
drop table seller;
drop table cart;
drop table product;
drop table orders;

