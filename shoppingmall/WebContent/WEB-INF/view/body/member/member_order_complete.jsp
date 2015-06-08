<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/order.css">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript">
	var price = 0;
	
	$('#main').on("click",function(){
		alert("test");
		location = "<%=request.getContextPath() %>/mainPage.do"
	});
	
</script>
</head>
<body>

<c:forEach items="${requestScope.list}" var="list">
<script type="text/javascript">
price = price +${list.amount*list.product.productPrice}
</script>
</c:forEach>
<script type="text/javascript">
$(document).ready(function(){
$("#orderPrice").text(price+"원");
$("#sumPrice").text(price+"원");
});
</script>
<hr>

	<table class="center">
		<caption style="text-align: left; font-weight: bold; font-size: 20px">결제 정보</caption><br>
		<thead>
			<tr>
				<td style="width:120px">주문 금액</td>
				<td style="text-align:right; width:800px" id="orderPrice">원</td>
			</tr>
			<tr>
				<td>할인 금액</td>
				<td align="right">- 0 원</td>
			</tr>
			<tr>
				<td>총 결제금액</td>
				<td align="right" id="sumPrice"></td>
			</tr>
	</table>

	<table class="center">
		<caption style="text-align: left; font-weight: bold; font-size: 20px">주문 상품 정보</caption><br>
			<tr>
				<td style="width:120px; text-align:center">상품/옵션 정보</td>
				<td style="width:100px; text-align:center">수량</td>
				<td style="width:150px; text-align:center">상품 금액</td>
				<td style="width:100px; text-align:center">배송비</td>
				<td style="width:200px; text-align:center">주문/배송 상태</td>
			</tr>
			<c:forEach items="${requestScope.list}" var="order">
			<tr>
				<td style="text-align:right">
					<div style="float: left"> 
					<img src="<%=request.getContextPath()%>/${order.product.imagePath}" style="width: 80px;height: 80px; "/>
					</div>
					<div class="productName">${order.product.productName }</div><br>
					<div class="productInfo">${order.product.productInfo }</div>
				</td>
				<td style="text-align:right">${order.amount}</td>
				<td style="text-align:right">${order.product.productPrice}원</td>
				<td style="text-align:right">무료</td>
				<td style="text-align:right"  collspan="3">${order.status}</td>
			</tr>
			</c:forEach>
		</table>
		
		<table class="center">
		<colgroup>
		<col width="30%"> 
		<col width="70%">
		</colgroup>
		<caption style="text-align: left; font-weight: bold; font-size: 20px">배송지 정보</caption><br>
			<tr>
				<td style="width:120px; text-align:center" rowspan="1">받는 사람</td>
				<td style="text-align:left">
					<div class="productName">이름 : ${sessionScope.loginInfo.name}</div>
					<div class="productName">연락처 : ${sessionScope.loginInfo.phone }</div>
					<div class="productName">주소 : (${sessionScope.loginInfo.address.postcode }) ${sessionScope.loginInfo.address.addressDetails }</div>
				</td>
			</tr>
			<tr>
				<td style="width:120px; text-align:center">배송시 유의사항</td>
				<td>
				<div class="productName">배송시 유의사항 : ${requestScope.list[0].recipient.detail }</div>
				</td>
			</tr>
		</table>
	

	
	<button id="main" style=" float: right; ">메인으로</button>

</body>
</html>

