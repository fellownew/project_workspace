<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
	
	$("select").change(function(){
		var id =$(this).attr("id");
		var status = $("#"+id+" option:selected").val();
		location="<%=request.getContextPath()%>/auth/completeList.do?status="+status;
	});
	
$("tbody>tr>td:first-child").on("click",function(){
	//여기서 해줄 것은, orderId로 넘기면, 받아서 출력해 주는 페이지 만들 것.
	location = "<%=request.getContextPath() %>/auth/complete.do?recipientId="+$(this).attr('name');

});
});
</script>
</head>
<body>

<table class="tbl_model" style="width: 1200px;margin: 0 auto">
<caption  style="text-align:right">
	<select id="sel">
			<option id="op0" selected="selected" disabled="disabled">${requestScope.status}</option>
			<option id="op1" >모두보기	</option>
			<option id="op2" >결제완료	</option>
			<option id="op3" >배송준비	</option>
			<option id="op4" >배송중	</option>
			<option id="op5" >배송완료	</option>
	</select>
</caption>
<thead>
	<tr>	
		<th style="width: 200px">결제일(주문번호)</th>
		<th style="width: 400px">상품정보</th>
		<th style="width: 200px">상품금액(수량)</th>
		<th style="width: 150px">배송비(판매자)</th>
		<th style="width: 150px">주문상태</th>
	</tr>
</thead>
<tbody >
	<c:forEach items="${requestScope.list}" var="order">
		<tr style="text-align: center">
			<td name="${order.recipientId}" >${order.regiDate}(${order.recipientId})</td>
			<td>
				<div style="float: left;" > <img src='<%=request.getContextPath()%>/${order.product.imagePath}' style="width: 100px;height: 100px; "> </div> 	
				<div class="title" style="padding-left: 120px">${order.product.productName }</div>
				<div class="info" style="padding-left: 120px">${order.product.productInfo }</div>
			</td>
			<td><fmt:formatNumber value="${order.product.productPrice * order.amount }"/>원 (${order.amount})</td>
			<td>무료 (${order.sellerId})</td>
			<td>${order.status}</td>
		</tr>
	</c:forEach>
</tbody>
</table>
				<!-- 페이징 처리 -->
		<!-- 이전 페이지 그룹 -->
		<c:choose>
			<c:when test="${pagingBean.previousPageGroup }">
				<a href="<%=request.getContextPath()%>/seller/auth/memberList.do?status=${requestScope.status}&page=${pagingBean.startPageOfPageGroup-1}">◀</a>
			</c:when>
			<c:otherwise>
				◀
			</c:otherwise>
		</c:choose>	
		<!-- 페이지 번호 -->
		<c:forEach begin="${pagingBean.startPageOfPageGroup }" end="${pagingBean.endPageOfPageGroup}" var="pageNum">
			<c:choose>
				<c:when test="${pageNum == pagingBean.currentPage }">
					<b>[${pageNum}]</b>
				</c:when>
				<c:otherwise>
					<a href="<%=request.getContextPath()%>/auth/completeList.do?status=${requestScope.status}&page=${pageNum}">
						${pageNum}
					</a>
				</c:otherwise>
			</c:choose>
			&nbsp;&nbsp;
		</c:forEach>
		<!-- 다음 페이지 그룹 -->
		<c:choose>
			<c:when test="${pagingBean.nextPageGroup }">
				<a href="<%=request.getContextPath()%>/auth/completeList.do?status=${requestScope.status}&page=${pagingBean.endPageOfPageGroup+1}">▶</a>
			</c:when>
			<c:otherwise>
				▶
			</c:otherwise>
		</c:choose>
</body>
</html>