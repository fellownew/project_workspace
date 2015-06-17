/*
 * 가상 데이터 입력용.
 */

insert into seller (seller_id,password,name,gender,address,email,phone,auth,admin,corporate_number,postcode)
values('seller01','123456','홍길동','male','서울','seller@taommall.co.kr','010-1234-1234','true','false','1111-11111','123-123');
insert into seller (seller_id,password,name,gender,address,email,phone,auth,admin,corporate_number,postcode)
values('seller02','123456','홍길동','male','서울','seller@taommall.co.kr','010-1234-1234','true','false','1111-11111','123-123');
insert into seller (seller_id,password,name,gender,address,email,phone,auth,admin,corporate_number,postcode)
values('seller03','123456','홍길동','male','서울','seller@taommall.co.kr','010-1234-1234','true','false','1111-11111','123-123');
insert into seller (seller_id,password,name,gender,address,email,phone,auth,admin,corporate_number,postcode)
values('seller04','123456','홍길동','male','서울','seller@taommall.co.kr','010-1234-1234','true','false','1111-11111','123-123');
insert into seller (seller_id,password,name,gender,address,email,phone,auth,admin,corporate_number,postcode)
values('seller05','123456','홍길동','male','서울','seller@taommall.co.kr','010-1234-1234','true','false','1111-11111','123-123');
insert into seller (seller_id,password,name,gender,address,email,phone,auth,admin,corporate_number,postcode)
values('seller06','123456','홍길동','male','서울','seller@taommall.co.kr','010-1234-1234','true','false','1111-11111','123-123');
insert into seller (seller_id,password,name,gender,address,email,phone,auth,admin,corporate_number,postcode)
values('seller07','123456','홍길동','male','서울','seller@taommall.co.kr','010-1234-1234','true','false','1111-11111','123-123');

insert into buyer (buyer_id,password,name,address,email,phone,postcode)
values('buyer01','123456','홍길동','서울','buyer@taommall.co.kr','010-1234-1234','123-123');
insert into buyer (buyer_id,password,name,address,email,phone,postcode)
values('buyer02','123456','홍길동','서울','buyer@taommall.co.kr','010-1234-1234','123-123');
insert into buyer (buyer_id,password,name,address,email,phone,postcode)
values('buyer03','123456','홍길동','서울','buyer@taommall.co.kr','010-1234-1234','123-123');
insert into buyer (buyer_id,password,name,address,email,phone,postcode)
values('buyer04','123456','홍길동','서울','buyer@taommall.co.kr','010-1234-1234','123-123');
insert into buyer (buyer_id,password,name,address,email,phone,postcode)
values('buyer05','123456','홍길동','서울','buyer@taommall.co.kr','010-1234-1234','123-123');
insert into buyer (buyer_id,password,name,address,email,phone,postcode)
values('buyer06','123456','홍길동','서울','buyer@taommall.co.kr','010-1234-1234','123-123');
insert into buyer (buyer_id,password,name,address,email,phone,postcode)
values('buyer07','123456','홍길동','서울','buyer@taommall.co.kr','010-1234-1234','123-123');

<<<<<<< HEAD
 insert into orders values(#{orderId},#{productId},#{amount},#{status},#{buyerId},#{recipientId},#{sellerId}, to_char(sysdate, 'yyyy-mm-dd'))
from product
select * from buyer
select * from orders

alter table orders add(regi_date varchar2(10) not null)
/*
 * 관리자 ID 등록.
 */
=======

insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'food1', 18000, 'food', 'food-내용', '','' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-07-20', 'seller01',0);
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'food2', 18000, 'food', 'food-내용', 'upimage/food.jpg','upimage/foodi.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-07-20', 'seller01',0);
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'food3', 18000, 'food', 'food-내용', 'upimage/food.jpg','upimage/foodi.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-07-20', 'seller01',0);
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'food4', 18000, 'food', 'food-내용', 'upimage/food.jpg','upimage/foodi.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-07-20', 'seller01',0);
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'food5', 18000, 'food', 'food-내용', 'upimage/food.jpg','upimage/foodi.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-07-20', 'seller01',0);
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'food6', 18000, 'food', 'food-내용', 'upimage/food.jpg','upimage/foodi.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-07-20', 'seller01',0);
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'food7', 18000, 'food', 'food-내용', 'upimage/food.jpg','upimage/foodi.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-07-20', 'seller01',0);
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'food8', 18000, 'food', 'food-내용', 'upimage/food.jpg','upimage/foodi.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-07-20', 'seller01',0);
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'food9', 18000, 'food', 'food-내용', 'upimage/food.jpg','upimage/foodi.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-07-20', 'seller01',0);
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'food10', 18000, 'food', 'food-내용', 'upimage/food.jpg','upimage/foodi.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-07-20', 'seller01',0);
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'food11', 18000, 'food', 'food-내용', 'upimage/food.jpg','upimage/foodi.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-07-20', 'seller01',0);
>>>>>>> 8c5258eecae0bcb3e6971b659f976d533b34fecf

insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'fruit1', 24000, 'fruit', 'fruit-내용', 'upimage/fruit.jpg','upimage/fruiti.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-07-18', 'seller02',0);
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'fruit2', 24000, 'fruit', 'fruit-내용', 'upimage/fruit.jpg','upimage/fruiti.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-07-18', 'seller02',0);
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'fruit3', 24000, 'fruit', 'fruit-내용', 'upimage/fruit.jpg','upimage/fruiti.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-07-18', 'seller02',0);
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'fruit4', 24000, 'fruit', 'fruit-내용', 'upimage/fruit.jpg','upimage/fruiti.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-07-18', 'seller02',0);
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'fruit5', 24000, 'fruit', 'fruit-내용', 'upimage/fruit.jpg','upimage/fruiti.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-07-18', 'seller02',0);
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'fruit6', 24000, 'fruit', 'fruit-내용', 'upimage/fruit.jpg','upimage/fruiti.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-07-18', 'seller02',0);
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'fruit7', 24000, 'fruit', 'fruit-내용', 'upimage/fruit.jpg','upimage/fruiti.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-07-18', 'seller02',0);
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'fruit8', 24000, 'fruit', 'fruit-내용', 'upimage/fruit.jpg','upimage/fruiti.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-07-18', 'seller02',0);
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'fruit9', 24000, 'fruit', 'fruit-내용', 'upimage/fruit.jpg','upimage/fruiti.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-07-18', 'seller02',0);
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'fruit10', 24000, 'fruit', 'fruit-내용', 'upimage/fruit.jpg','upimage/fruiti.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-07-18', 'seller02',0);
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'fruit11', 24000, 'fruit', 'fruit-내용', 'upimage/fruit.jpg','upimage/fruiti.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-07-18', 'seller02',0);

insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'health1', 24000, 'health', 'health-내용', 'upimage/health.jpg','upimage/healthi.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-08-20', 'seller03',0);		
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'health2', 24000, 'health', 'health-내용', 'upimage/health.jpg','upimage/healthi.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-08-20', 'seller03',0);	
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'health3', 24000, 'health', 'health-내용', 'upimage/health.jpg','upimage/healthi.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-08-20', 'seller03',0);	
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'health4', 24000, 'health', 'health-내용', 'upimage/health.jpg','upimage/healthi.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-08-20', 'seller03',0);	
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'health5', 24000, 'health', 'health-내용', 'upimage/health.jpg','upimage/healthi.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-08-20', 'seller03',0);	
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'health6', 24000, 'health', 'health-내용', 'upimage/health.jpg','upimage/healthi.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-08-20', 'seller03',0);	
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'health7', 24000, 'health', 'health-내용', 'upimage/health.jpg','upimage/healthi.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-08-20', 'seller03',0);	
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'health8', 24000, 'health', 'health-내용', 'upimage/health.jpg','upimage/healthi.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-08-20', 'seller03',0);	
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'health9', 24000, 'health', 'health-내용', 'upimage/health.jpg','upimage/healthi.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-08-20', 'seller03',0);	
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'health10', 24000, 'health', 'health-내용', 'upimage/health.jpg','upimage/healthi.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-08-20', 'seller03',0);	
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'health11', 24000, 'health', 'health-내용', 'upimage/health.jpg','upimage/healthi.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-08-20', 'seller03',0);	
		
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'snack1', 24000, 'snack', 'snack-내용', 'upimage/snack.jpg','upimage/snacki.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-08-10', 'seller04',0);	
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'snack2', 24000, 'snack', 'snack-내용', 'upimage/snack.jpg','upimage/snacki.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-08-10', 'seller04',0);	
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'snack3', 24000, 'snack', 'snack-내용', 'upimage/snack.jpg','upimage/snacki.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-08-10', 'seller04',0);	
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'snack4', 24000, 'snack', 'snack-내용', 'upimage/snack.jpg','upimage/snacki.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-08-10', 'seller04',0);	
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'snack5', 24000, 'snack', 'snack-내용', 'upimage/snack.jpg','upimage/snacki.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-08-10', 'seller04',0);	
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'snack6', 24000, 'snack', 'snack-내용', 'upimage/snack.jpg','upimage/snacki.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-08-10', 'seller04',0);	
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'snack7', 24000, 'snack', 'snack-내용', 'upimage/snack.jpg','upimage/snacki.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-08-10', 'seller04',0);	
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'snack8', 24000, 'snack', 'snack-내용', 'upimage/snack.jpg','upimage/snacki.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-08-10', 'seller04',0);	
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'snack9', 24000, 'snack', 'snack-내용', 'upimage/snack.jpg','upimage/snacki.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-08-10', 'seller04',0);	
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'snack10', 24000, 'snack', 'snack-내용', 'upimage/snack.jpg','upimage/snacki.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-08-10', 'seller04',0);	
insert into product (product_id,product_name,product_price,category,product_info,image_path,info_image_path,regi_date,exp_date,seller_id,volume_order)
values ((select c_product_id.nextval from dual), 'snack11', 24000, 'snack', 'snack-내용', 'upimage/snack.jpg','upimage/snacki.jpg' ,to_char(sysdate, 'yyyy-mm-dd'),'2015-08-10', 'seller04',0);	
		
