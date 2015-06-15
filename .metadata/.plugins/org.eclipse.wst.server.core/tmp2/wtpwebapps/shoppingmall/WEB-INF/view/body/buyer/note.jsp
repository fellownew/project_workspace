<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
.center {
	background: url(4.png) no-repeat;
	width: 500px;
	height: 400px;
	margin: 0 auto;
	border: 1px solid black;
}

table, td, th {
	border: 1px #000 solid;
	border-collapse: collapse;
}

</style>
<title>결제창</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/sidemenu.css">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#test").on("click", function() {
			opener.parent.payment();
			window.self.close();
		});
	});
</script>
</head>
<body>
	<table>
 		<colgroup>
				<col width="30%"> 
				<col width="70%">
			</colgroup>

		<caption style="text-align:center; font-weight:bold; font-size:20px" >결제정보 확인</caption>
		
		<thead>
<%-- 			<tr><br>
				<th>받는분</th>
				<td style="text-align: left" colspan="2">${sessionScope.loginInfo.name}</td>
			</tr>
			<tr>
				<th>주소</th>
				<td style="text-align: left" id="oiginalAddr" colspan="2">
					(${sessionScope.loginInfo.address.postcode }) ${sessionScope.loginInfo.address.addressDetails }</td>
			</tr>
			<tr>
				<th>연락처</th>
				<td style="text-align: left" colspan="2">${sessionScope.loginInfo.phone}</td>
			</tr> --%>

			<tr>
				<c:if test="${param.addtype=='기본주소' }">
					<tr>
						<th>받는분</th>
						<td style="padding-left:10px">${sessionScope.loginInfo.name}</td>
					</tr>
					<tr>
						<th>연락처</th>
						<td style="padding-left:10px">${sessionScope.loginInfo.phone}</td>
					</tr>
					<tr>
						<th>주소</th>
						<td style="padding-left:10px">(${sessionScope.loginInfo.address.postcode }) ${sessionScope.loginInfo.address.addressDetails }</td>
					</tr>
				</c:if>
				<c:if test="${param.addtype=='새로입력' }">
					<tr>
						<th>받는분</th>
						<td style="padding-left:10px">${param.name}</td>
					</tr>
					<tr>
						<th>연락처</th>
						<td style="padding-left:10px">${param.phone}</td>
					</tr>
					<tr>
						<th>주소</th>
						<td style="padding-left:10px">${param.addressDetails}</td>
					</tr>
				</c:if>
			</tr>
			
						<tr>
				<c:if test="${param.card!='카드선택' }">
					<tr>
						<th>결제방식</th>
						<td style="padding-left:10px">${param.card }</td>
					</tr>
					<tr>
						<th>할부방식</th>
						<td style="padding-left:10px">${param.installment }</td>
					</tr>
				</c:if>
				<c:if test="${param.bank!='은행선택' }">
					<tr>
						<th>무통장 입금</th>
						<td style="padding-left:10px">${param.bank }</td>
					</tr>
					<tr>
						<th>계좌번호</th>
						<td style="padding-left:10px">3562-01-2343</td>
					</tr>
				</c:if>
			</tr>
		<caption style="text-align: right" align="bottom">
			<button id="test">결제</button>
			<button onclick="window.close()">취소</button>
		</caption>
	</table><br>
</body>
</html>