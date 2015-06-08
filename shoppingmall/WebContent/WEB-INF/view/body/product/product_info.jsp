<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<meta charset="UTF-8">
<style type="text/css">
.buyButton {
  font-family: arial;
  font-weight: bold;
  color: #FFFFFF !important;
  font-size: 14px;
  padding: 9px 11px;
  background: #CD0000;
  width:100px;
}

.cartButton {
  font-family: arial;
  font-weight: bold;
  color: #000000 !important;
  font-size: 14px;
  padding: 9px 11px;
  border: 1px solid #000000;
  background: #FFFFFF;
  width:100px;
}

</style>
<script type="text/javascript" src="<%=request.getContextPath() %>/script/jquery.js"></script>
<script type="text/javascript">
function order(id){
		location = "<%=request.getContextPath() %>/auth/memberOrderForm.do?productId="+id+"&amount="+$("#amount").val();
}
function cart(id){
	var amount = $("#amount").val();
	location = "<%=request.getContextPath() %>/cart/auth/cartInput.do?productId="+id+"&amount="+amount;	
}
</script>
<div>
	<h2 style="text-align: center;margin-top:20px">상품정보</h2>
	<table style="width:1000px;margin: 0 auto;border-collapse: collapse;"  border='1'>
		<tbody>

			<tr>
				<td rowspan="6" style="width:490px"><img src="<%=request.getContextPath() %>/${requestScope.product.imagePath }"/></td>
				<td width="200px">상품명</td>	
			    <td>${product.productName}</td>	
			</tr>
			<tr>
				<td>상품가격</td>
				<td>${product.productPrice}원</td>
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
				<td><input type="number" id="amount" value="1" size="1"  max="99" maxlength="2"></td>
			</tr> 	
			<c:choose>
			<c:when test="${sessionScope.user=='buyer'}">
			<tr>
				<td colspan="2"><button class="buyButton" onclick="order(${product.productId})">주문</button><button class="cartButton" id="cart" onclick="cart(${product.productId})">장바구니</button></td>			
			</tr>
			</c:when>
			<c:when test="${sessionScope.user!='buyer'}">
			<tr></tr>	
			</c:when>
			</c:choose>
			
			

			<tr>
				<td colspan="3" style="height: 300px;position: relative;"><img src="<%=request.getContextPath() %>/${requestScope.product.infoImagePath }"/></td>
			</tr>
			
		</tbody>
	</table>
	<jsp:include page="product_info_board.jsp"></jsp:include>	
	<a href="#" onclick="javascript:$j(window).scrollTop(0);void(0);" style="text-align: right;">top</a>
	
</div>
