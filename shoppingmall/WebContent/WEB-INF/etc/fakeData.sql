insert into seller 
(seller_id,password,name,gender,address,email,phone,auth,admin,corporate_number)
values
('seller-1','1111','홍길동','남','서울','df@df.com','010-1234-1234','true','false','1234-23125');

insert into seller 
(seller_id,password,name,gender,address,email,phone,auth,admin,corporate_number)
values
('admin','admin','홍길동','남','서울','df@df.com','010-1234-1234','true','true','1111-11111');

select  * from orders 