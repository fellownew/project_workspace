select * from buyer


insert into seller 
(seller_id,password,name,gender,address,email,phone,auth,admin,corporate_number)
values
('seller-1','1111','홍길동','남','서울','df@df.com','010-1234-1234','true','false','1234-23125');

insert into seller 
(seller_id,password,name,gender,address,email,phone,auth,admin,corporate_number)
values
('admin','admin','홍길동','남','서울','df@df.com','010-1234-1234','true','true','1111-11111');

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
		
		
			<id column="oa" property="orderId"/>
	<result column="ob" property="productId"/>
	<result column="oc" property="buyerId"/>
	<result column="oh" property="sellerId"/>
	<result column="og" property="recipientId"/>
	<result column="od" property="amount"/>
	<result column="oe" property="status"/>
	<result column="oi" property="regiDate"/>
	<association property="product" javaType="kr.co.taommall.product.vo.Product">
		<id column="pa" property="productId"/>
		<result column="pb" property="productName"/>
		<result column="pc" property="productPrice"/>
		<result column="pd" property="category"/>
		<result column="pe" property="productInfo"/>
		<result column="pf" property="imagePath"/>
		<result column="pg" property="regiDate"/>
		<result column="ph" property="expDate"/>
		<result column="pi" property="sellerId"/>
	</association>
	<association property="buyer" javaType="kr.co.taommall.account.vo.Buyer">
	<id column="ba" property="buyerId"/>	
	<result column="bb" property="password"/>
	<result column="bc" property="name"/>
	<result column="bd" property="email"/>
	<result column="be" property="phone"/>
	</association>
	<association property="seller" javaType="kr.co.taommall.account.vo.Seller" >
	<id column="sa" property="sellerId"/>	
	<result column="sb" property="password"/>
	<result column="sc" property="name"/>
	<result column="sd" property="gender"/>
	<result column="se" property="email"/>
	<result column="sf" property="phone"/>
	<result column="sg" property="auth"/>
	<result column="sh" property="admin"/>
	<result column="si" property="corporateNumber"/>
	</association>
	<association property="recipient" javaType="kr.co.taommall.recipient.vo.Recipient" >
	<id column="ra" property="recipientId"/>
	<result column="rb" property="name"/>
	<result column="rc" property="phone"/>
	<result column="rd" property="detail"/>
		
		
		
		
		
		
		