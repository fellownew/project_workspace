<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<meta charset="UTF-8">
<script type="text/javascript">
function order(id){
	location = "order.do?productId"+id;
}
function cart(id){
	var amount = document.getElementById("amount");
	location = "cart.do?productId="+id+"&amount="+amount;
}
</script>
<div>
	<h2>상품정보</h2>
	<table style="width:1000px;margin: 0 auto"  border='1'>
		<thead>
			<tr>
				<td width="300px">이미지</td>
				<td colspan="2">정보</td>
			</tr>
			</thead>
			
		<tbody>
			<tr>
				<td rowspan="6"><img src="<%=request.getContextPath() %>/${requestScope.product.imagePath }"/></td>
				<td width="200px">상품명</td>	
			    <td>${product.productName}</td>	
			</tr>
			<tr>
				<td>상품가격</td>
				<td>${product.productPrice}</td>
			</tr>
			<tr>

				<td>유통기한</td>
				<td>${product.expDate}</td>
			</tr>
			<tr>
				<td>판매자 정보</td>
				<td>${product.sellerId}</td>
			</tr> 
			<tr>
				<td>수량</td>
				<td><input type="number" id="amount"></td>
			</tr> 
			<tr>
				<td colspan="2"><button onclick="order(${product.productId})">주문</button><button onclick="cart(${product.productId})">장바구니</button></td>
				
			</tr> 
		</tbody>
	</table>
	<table>
		<tr>
			<td>${product.productInfo }</td>
		</tr>
	</table>
</div>
