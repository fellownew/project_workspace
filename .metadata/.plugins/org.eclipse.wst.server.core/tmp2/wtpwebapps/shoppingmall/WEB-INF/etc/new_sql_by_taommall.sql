create table buyer(
   buyer_id varchar2(20) primary key,
   password varchar2(50) not null,
   name varchar2(12) not null,
   address varchar2(100) not null,
   email varchar2(20) not null,
   phone varchar2(30) not null,
   postcode varchar2(10) not null
);
select * from buyer
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
   detail varchar2(200) not null,
   postcode varchar2(10) not null
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
   amount number not null,
   status varchar2(20),
   buyer_id varchar2(20),
   recipient_id number,
   seller_id varchar2(20),
   regi_date varchar2(10) not null,
   constraint orders_seller_id_fk foreign key(seller_id) references seller(seller_id) ON DELETE CASCADE,
   constraint orders_product_id_fk foreign key(product_id) references product(product_id) ON DELETE CASCADE,
   constraint orders_buyer_id_fk foreign key(buyer_id) references buyer(buyer_id) ON DELETE CASCADE,
   constraint orders_recipient_id_fk foreign key (recipient_id) references recipient(recipient_id) ON DELETE CASCADE
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

insert into seller (seller_id,password,name,gender,address,email,phone,auth,admin,corporate_number,postcode)
values('admin','admin','������','��','����','admin@taommall.co.kr','010-2222-2222','true','true','2222-22222','222-222');

create sequence recipient_no_seq;
create sequence c_product_id;
create sequence c_board_id;
create sequence order_no;


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