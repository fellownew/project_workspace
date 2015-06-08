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
	font-size : 12px;
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
	
	$("select").change(function(){
		var id =$(this).attr("id");
		var status = $("#"+id+" option:selected").val();
		location="<%=request.getContextPath()%>/auth/orderStatusUpdate.do?id="+id+"&status="+status;
	});
});
</script>
</head>
<body>
<table class="tbl_model">
<colgroup>
<col width="10%">
<col width="10%">
<col width="25%">
<col width="5%">
<col width="20%">
<col width="20%">
<col width="10%">
</colgroup>


<tr>	
<th>결제일(주문번호)</th>
<th>	</th>
<th>상품정보</th>
<th>상품금액(수량)</th>
<th colspan="2">배송 상세 정보</th>
<th>주문상태</th>
</tr>

<c:forEach items="${requestScope.list}" var="order">
<tr style="text-align: center">
<td >${order.regiDate}(${order.recipientId})</td>
<td>${order.buyer.buyerId}(${order.buyer.name})</td>
<td>
	<div style="float: left;" > <img src='<%=request.getContextPath()%>/${order.product.imagePath}' style="width: 80px;height: 80px; "> </div> 	
	<div class="title">${order.product.productName }</div>
	<div class="info">${order.product.productInfo }</div>
</td>
<td>${order.product.productPrice * order.amount }원<br> (${order.amount})</td>
<td> 이름 : ${order.recipient.name }<br>
	 phone : ${order.recipient.phone}<br>
	 유의사항 :<br> ${order.recipient.detail }</td>
<td align="left">(${order.recipient.address.postcode}) <br>	${order.recipient.address.addressDetails }</td>
<td >${order.status}<br>
	<select id='${order.recipientId}'>
	<optgroup>
	<option id='op0' selected="selected" disabled="disabled">${order.status}</option>
	<option id='op1'>결제완료</option>
	<option id='op2'>배송준비</option>
	<option id='op3'>배송중</option>
	<option id='op4'>배송완료</option>
	</optgroup>
	</select>

</td>
</tr>
</c:forEach>
</table>	
</body>
</html>