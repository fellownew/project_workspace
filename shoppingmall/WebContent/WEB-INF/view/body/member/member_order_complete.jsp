<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/order.css">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript">
	
</script>
</head>
<body>

<c:forEach items="${requestScope.list}" var="list">
order Id : ${list.orderId }<br><br>
product Id : ${list.productId }<br><br>
buyerId :  ${list.buyerId }<br><br>
sellerId :  ${list.sellerId }<br><br>
recipientId : ${list.recipientId }<br><br>
buyer : ${list.buyer}<br><br>
product : ${list.product}<br><br>
seller : ${list.seller}<br><br>
recipient: ${list.recipient}<br><br>
<hr>
</c:forEach>
<hr>

	<table class="center2">
		<caption style="text-align: left; font-weight: bold; font-size: 20px"><font color="red">주문/배송</font> 상세</caption><br>
		<thead>
			<tr>
				<td><table border="1">
				결제 정보<br>
						<tr>
							<td style="width:120px">주문 금액</td>
							<td style="text-align:right; width:800px">${requestScope.order.product.productPrice}원</td>
						</tr>
						<tr>
							<td>할인 금액</td>
							<td align="right">- 0 원</td>
						</tr>
						<tr>
							<td>총 결제금액</td>
							<td align="right">${requestScope.order.product.productPrice}원</td>
						</tr>
					</table><br>
				</td>
			</tr>
			<tr>
				<td><table border="0">
				주문 상품 정보<br>
						<tr>
							<td style="width:120px; text-align:center">상품/옵션 정보</td>
							<td style="width:100px; text-align:center">수량</td>
							<td style="width:150px; text-align:center">상품 금액</td>
							<td style="width:100px; text-align:center">배송비</td>
							<td style="width:200px; text-align:center">주문/배송 상태</td>
						</tr>
						<tr>
							<td style="text-align:right">${requestScope.order.product.productPrice}원</td>
							<td style="text-align:right">-0 원</td>
							<td style="text-align:right">${requestScope.order.product.productPrice}원</td>
							<td style="text-align:right">무료</td>
							<td style="text-align:right">무료</td>
						</tr>
					</table><br>
				</td>
			</tr>
		</thead>

<%-- 		<tbody>
			<tr>
				<td><img src="<%=request.getContextPath()%>/${requestScope.product.imagePath }"	width="120px" height="120px" /></td>
				<td>${requestScope.amount}</td>
				<td>${requestScope.product.productPrice}</td>
				<td>${requestScope.product.sellerId}</td>
			</tr>
		</tbody> --%>
	</table>
	<caption></caption>
	</table>

	<hr>
	order Id : ${requestScope.order.orderId }
	<br>
	<br> amount : ${requestScope.order.amount}
	<br>
	<br> status : ${requestScope.order.status}
	<br>
	<br> product : ${requestScope.order.product}
	<br>
	<br> ${requestScope.order.recipient}
	<br>
	<br> ${requestScope.order.seller}
	<br>
	<br> ${requestScope.order.buyer}
	<br>
</body>
</html>