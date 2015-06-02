<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<meta charset="UTF-8">
	private int productId;
	private String productName;
	private int productPrice;
	private String category;
	private String productInfo;
	private String imagePath;
	private String regiDate;
	private String expDate;
	private String SellerId;
<body>
	<table width="700" border='1'>
		<thead>
			<tr>
				<td>이미지</td>
				<td>주문번호</td>
				<td>상품명</td>
				<td>가격</td>
				<td>분류</td>
				<td>상품정보</td>
				<td>등록일자</td>
				<td>유통기한</td>
				<td>판매자</td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><img src="${requestScope.product.filename }"/></td>
				<td>${product.productId}</td>
				<td>${product.productName}</td>
				<td>${product.price}</td>
				<td>${product.category}</td>
				<td>${product.productInfo}</td>
				<td>${product.productregiDate}</td>
				<td>${product.productexpDate}</td>
				<td>${product.sellerId}</td>
			</tr> 
		</tbody>
	</table>
</body>
