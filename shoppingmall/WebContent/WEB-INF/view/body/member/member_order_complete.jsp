<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/order.css">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	history.pushState(null, null, location.href);
	window.onpopstate = function(event) {
		history.go(1);
	};

	//뒤로가기 & F5 누르면 alert 창 띄움
	//window.onbeforeunload = function() { return "이동하시겠습니까?"; };
	$(document).keydown(function(){
		 if (event.keyCode == 8 || event.keyCode == 116) {
		  event.keyCode==0;
		  event.cancelBubble = true;
		  event.returnValue = false;
		  return false;
		}
	});

});
history.navigationMode = 'compatible';
function cfHistoryNoBack(){
    if (window.history) {
    //모든 브라우저에서 호출
    //window.history.forward(1);
    window.history.forward(1);
    }
}

	function home(){
		location = "/taommall";
	}	
</script>

</head>
<body>

<hr>

	<table class="center">
		<caption style="text-align: left; font-weight: bold; font-size: 20px">결제 정보</caption><br>

			<tr>
				<td style="width:120px">주문 금액</td>
				<td style="text-align:right; width:800px" id="orderPrice"><fmt:formatNumber value="${requestScope.price}"/>원</td>
			</tr>
			<tr>
				<td>할인 금액</td>
				<td align="right">- 0 원</td>
			</tr>
			<tr>
				<td>총 결제금액</td>
				<td align="right" id="sumPrice"><fmt:formatNumber value="${requestScope.price}"/>원</td>
			</tr>

	</table>

	<table class="center">
		<colgroup>
				<col width="30%"> 
				<col width="10%">
				<col width="15%"> 
				<col width="15%">
				<col width="20%"> 
		</colgroup>
		<caption style="text-align: left; font-weight: bold; font-size: 20px">주문 상품 정보</caption><br>
			<tr>
				<th style="width:120px; text-align:center">상품/옵션 정보</th>
				<th style="width:100px; text-align:center">수량</th>
				<th style="width:150px; text-align:center">상품 금액</th>
				<th style="width:100px; text-align:center">배송비</th>
				<th style="width:200px; text-align:center">주문/배송 상태</th>
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
				<td style="text-align:right"><fmt:formatNumber value="${order.product.productPrice}"/>원</td>
				<td style="text-align:right">무료</td>
				<td style="text-align:right"  collspan="3">${order.status}</td>
			</tr>
			</c:forEach>
		</table>
		<div>
		<table class="center">
		<colgroup>
		<col width="30%"> 
		<col width="70%">
		</colgroup>
		<caption style="text-align: left; font-weight: bold; font-size: 20px">배송지 정보</caption><br>
			<tr>
				<th style="width:120px; text-align:center" rowspan="1">받는 사람</th>
				<th style="text-align:left">
					<div class="productName">이름 : ${sessionScope.loginInfo.name}</div>
					<div class="productName">연락처 : ${sessionScope.loginInfo.phone }</div>
					<div class="productName">주소 : (${sessionScope.loginInfo.address.postcode }) ${sessionScope.loginInfo.address.addressDetails }</div>
				</th>
			</tr>
			<tr>
				<th style="width:120px; text-align:center">배송시 유의사항</th>
				<td>
				<div class="productName">배송시 유의사항 : ${requestScope.list[0].recipient.detail }</div>
				</td>
			</tr>
		</table><br>
		</div>
			<button onClick="home()" style="position:relative;left: 1050px;margin-bottom: 10px; ">메인으로</button>
</body>
</html>

