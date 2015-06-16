select 	o.order_id, o.product_id, o.buyer_id, o.amount, o.status, o.recipient_id, o.seller_id, o.regi_date,
		p.product_id, p.product_name, p.product_price, p.category, p.product_info,p.image_path, p.regi_date,p.exp_date, p.seller_id,
		b.buyer_id, b.password, b.name, b.address, b.email, b.phone,
		s.seller_id, s.password, s.name, s.gender, s.address, s.email, s.phone, s.auth, s.admin, s.corporate_number,
		r.recipient_id, r.name, r.address, r.phone, r.detail,r.postcode
from orders o,product p, buyer b, recipient r,seller s
where o.seller_id = s.seller_id and o.product_id = p.product_id and o.buyer_id = b.buyer_id and o.recipient_id = r.recipient_id and o.seller_id = 'close852' and status='배송완료'
order by o.recipient_id desc


delete from recipient
select * from recipient

alter table recipient add (context varchar2(40) not null);
alter table recipient add (result varchar2(40) not null);

from product
select * from buyer

/*
 * 관리자 ID 등록.
 */

insert into seller 
(seller_id,password,name,gender,address,email,phone,auth,admin,corporate_number,postcode)
values
('admin','admin','홍길동','male','서울','admin@df.com','010-1234-1234','true','true','1111-11111','123-123');

