<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.title{
font-weight: bold;
font-size: 20px;
}
.info{
 font-size: 12px;
}
.tbl_model{
	position:relative;
	width:1300px;
	border:0;
	border-bottom:1px solid #e5e5e5;
	border-spacing:0;
	border-collapse:collapse;
	table-layout:fixed;
	word-break:keep-all;
	word-wrap:break-word;
}
.tbl_model tr{
	border-top:1px solid #e5e5e5;
	border-bottom:1px solid #d4d4d4;
}
.tbl_model th{
	background-color:#e7e7e7;
	border-right:1px solid #e5e5e5;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	
$("tbody>tr>td:first-child").on("click",function(){
	//여기서 해줄 것은, orderId로 넘기면, 받아서 출력해 주는 페이지 만들 것.
	location = "<%=request.getContextPath() %>/auth/complete.do?recipientId="+$(this).attr('name');

});
});
</script>
</head>
<body>
<table class="tbl_model" >
<thead>
<tr>	
<th>결제일(주문번호)</th>
<th>상품정보</th>
<th>상품금액(수량)</th>
<th>배송비(판매자)</th>
<th>주문상태</th>
</tr>
</thead>
<tbody >
<c:forEach items="${requestScope.list}" var="order">
<tr style="text-align: center">
<td name="${order.recipientId}" >${order.regiDate}(${order.recipientId})</td>
<td>
	<div style="float: left;" > <img src='<%=request.getContextPath()%>/${order.product.imagePath}' style="width: 80px;height: 80px; "> </div> 	
	<div class="title">${order.product.productName }</div>
	<div class="info">${order.product.productInfo }</div>
</td>
<td>${order.product.productPrice * order.amount }원 (${order.amount})</td>
<td>무료 (${order.sellerId})</td>
<td>${order.status}</td>
</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>