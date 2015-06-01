<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<meta charset="UTF-8">
<body>
<c:if test="${fn:length(requestScope.productList) != 0 }">
	<table width="700" border='1'>
		<thead>
			<tr>
				<td></td>
				<td>상품명</td>
				<td>가격</td>
				<td>유통기한</td>
				<td>판매자</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${requestScope.productList }" var="product">
				<tr>
					<td><img src="${product.imagePath }"/></td>
					<td>${product.productId}</td>
					<td>${product.price}</td>
					<td>${product.expDate}</td>
					<td>${product.sellerId}</td>
				</tr> 
			</c:forEach>
		</tbody>
	</table>
</c:if>
</body>
