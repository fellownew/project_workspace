select 	o.order_id, o.product_id, o.buyer_id, o.amount, o.status, o.recipient_id, o.seller_id, o.regi_date,
		p.product_id, p.product_name, p.product_price, p.category, p.product_info,p.image_path, p.regi_date,p.exp_date, p.seller_id,
		b.buyer_id, b.password, b.name, b.address, b.email, b.phone,
		s.seller_id, s.password, s.name, s.gender, s.address, s.email, s.phone, s.auth, s.admin, s.corporate_number,
		r.recipient_id, r.name, r.address, r.phone, r.detail,r.postcode
from orders o,product p, buyer b, recipient r,seller s
where o.seller_id = s.seller_id and o.product_id = p.product_id and o.buyer_id = b.buyer_id and o.recipient_id = r.recipient_id and o.seller_id = 'close852' and status='배송완료'
order by o.recipient_id desc


delete from product
select *
from product
select * from buyer


insert into seller 
(seller_id,password,name,gender,address,email,phone,auth,admin,corporate_number)
values
('seller-1','1111','홍길동','남','서울','df@df.com','010-1234-1234','true','false','1234-23125');

insert into seller 
(seller_id,password,name,gender,address,email,phone,auth,admin,corporate_number,postcode)
values
('admin','admin','홍길동','male','서울','df@df.com','010-1234-1234','true','true','1111-11111','123-123');

select  * from orders 

select  order_id, product_id, buyer_id, amount, status, recipient_id, seller_id, regi_date   
from (     
	select ceil(rownum/10) page, order_id, product_id, buyer_id, amount, status, recipient_id, seller_id, regi_date    
	from (        
		select  o.order_id, product_id, buyer_id, amount, status, recipient_id, seller_id, regi_date  
				
		from 	orders o
				where status='배송대기'
				order by  recipient_id desc     
		)   
	)   
	
where page = 1

		select   oa,ob,oc,od,oe,og,oh,oi,
				 pa,pb,pc,pd,pe,pf,pg,ph,pi
				 ba,bb,bc,bd,be,bf,
				 sa,sb,sc,sd,se,sf,sg,sh,si,sj,
				 ra,rb,rc,rd,re,rf
		from (
				select ceil(rownum/10) page,  
				 oid oa,  opid ob,  obid oc,  oa od,  os oe, orid og, osid oh, ord oi,
				 pid pa ,pn pb, ppp pc, pc pd ,ppi pe, pip pf,  prd pg, ped ph,  psid pi,    
 				 bbid ba,  bp bb , bn bc,  ba bd,  bn be, bph bf,    
 				 ssid sa,  sp sb,  sn sc, sg sd,  sa se,  se sf,  sph sg,  sa sh,  sad si,  scn sj,    
 				 rrid ra,  rn rb,  ra rc,  rph rd,  rd re, rp rf
 				 
				from (
					select 	o.order_id oid , o.product_id opid, o.buyer_id obid, o.amount oa, o.status os, o.recipient_id orid, o.seller_id osid, o.regi_date ord,
						p.product_id pid,p.product_name pn, p.product_price ppp, p.category pc, p.product_info ppi,p.image_path pip, p.regi_date prd,p.exp_date ped, p.seller_id psid,
						b.buyer_id bbid, b.password bp, b.name bn, b.address ba, b.email be, b.phone bph,
						s.seller_id ssid, s.password sp, s.name sn, s.gender sg, s.address sa, s.email se, s.phone sph, s.auth sau, s.admin sad, s.corporate_number scn,
						r.recipient_id rrid, r.name rn, r.address ra, r.phone rph, r.detail rd,r.postcode rp
					from orders o,product p, buyer b, recipient r,seller s
					where o.seller_id = s.seller_id and o.product_id = p.product_id and o.buyer_id = b.buyer_id and o.recipient_id = r.recipient_id 
					and o.status = '결제완료'
					order by o.recipient_id desc
				) 
		) 
		where page = 2

		
		
		
		
		
		
select   oa,ob,oc,od,oe,og,oh,oi,
		 pa,pb,pc,pd,pe,pf,pg,ph,pi,
		 ba,bb,bc,bd,be,bf,
		 sa,sb,sc,sd,se,sf,sg,sh,si,sj,
		 ra,rb,rc,rd,re,rf   
from (     
		select ceil(rownum/10) page,
			   oid oa,  opid ob,  obid oc,  oa od,  os oe, orid og, osid oh, ord oi,
			   pid pa ,pn pb, ppp pc, pc pd ,ppi pe, pip pf,  prd pg, ped ph,  psid pi,
			   bbid ba,  bp bb , bn bc,  ba bd,  bn be, bph bf,
			   ssid sa,  sp sb,  sn sc, sg sd,  sa se,  se sf,  sph sg,  sa sh,  sad si,  scn sj,
			   rrid ra,  rn rb,  ra rc,  rph rd,  rd re, rp rf
		from (
				select  o.order_id oid , o.product_id opid, o.buyer_id obid, o.amount oa, o.status os, o.recipient_id orid, o.seller_id osid, o.regi_date ord,
						p.product_id pid,p.product_name pn, p.product_price ppp, p.category pc, p.product_info ppi,p.image_path pip, p.regi_date prd,p.exp_date ped, p.seller_id psid,
						b.buyer_id bbid, b.password bp, b.name bn, b.address ba, b.email be, b.phone bph,
						s.seller_id ssid, s.password sp, s.name sn, s.gender sg, s.address sa, s.email se, s.phone sph, s.auth sau, s.admin sad, s.corporate_number scn,
						r.recipient_id rrid, r.name rn, r.address ra, r.phone rph, r.detail rd,r.postcode rp
				from orders o,product p, buyer b, recipient r,seller s       
				where o.seller_id = s.seller_id and o.product_id = p.product_id and o.buyer_id = b.buyer_id and o.recipient_id = r.recipient_id and status='결제완료'               
				order by o.recipient_id desc     
			)    
	)    
where page = 2
		
		
		
		
		
		