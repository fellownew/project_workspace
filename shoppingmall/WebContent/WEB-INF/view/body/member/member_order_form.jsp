<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/order.css">
<title>Insert title here</title>
</head>
<body>
	<fieldset style="height:500px">
	<table style="width:700px">
		<h3>주문상품 확인</h3>
		<thead>
			<tr>
				<td>상품 정보</td>
				<td>수량</td>
				<td>상품 금액</td>
				<td>판매자</td>
			</tr>
		</thead>

		<tbody>
			<tr>
				<td><img src="upimage/1433207674224.jpg" width="120px" height="120px"/></td>
				<td>1개</td>
				<td>5000</td>
				<td>박영훈</td>
			</tr>
		</tbody>
	</table>
	</fieldset>
	<br>

	<fieldset>
	<table style="width:700px">
		<thead>
			<h3>배송비 정보 입력</h3>
			<tr>
				<td>보내는분</td>
				<td>${sessionScope.loginInfo.name}</td>
			</tr>
			<tr>
				<td>주소</td>
				<td>${sessionScope.loginInfo.address}</td>
			</tr>
			<tr>
				<td>연락처</td>
				<td>${sessionScope.loginInfo.phone}</td>
			</tr>
			<tr>
				<td>배송시 요구사항</td>
				<td><input type="text" name="" id=""></td>
			</tr>
	</table><br>
	</fieldset>

	<fieldset>
	<table style="width:700px">

			<tr>
				<td style="width:100px">배송지</td>
				<td><input type="radio" name="delivery" id="delivery"
					checked="checked">기본주소 <input type="radio" name="delivery"
					id="delivery">새로입력</td>
			</tr>
			<tr>
				<td>받는분</td>
				<td><input type="text" name="" id="" value="" placeholder="${sessionScope.loginInfo.name}"></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" name="" id="" value="" placeholder="${sessionScope.loginInfo.address}"></td>
			</tr>
			<tr>
				<td>연락처</td>
				<td><input type="text" name="" value="" placeholder="${sessionScope.loginInfo.phone }"></td>
			</tr>
			<tr>
				<td>배송시 요구사항</td>
				<td><input type="text" name="" id=""></td>
			</tr>
		</thead>

	</table>
	</fieldset>
</body>
</html>