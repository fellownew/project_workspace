<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<meta charset="UTF-8">
<script type="text/javascript" src="<%=request.getContextPath() %>/script/jquery.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#registerProductBtn").on("click",function(){
		location = 'productJoinForm.do';
	});
	$("#modifyProductBtn").on("click",function(){
		
	});
});

function deleteProduct(idx){
	if(confirm("정말 삭제하시겠습니까?")){
		location = "deleteProduct.do?productId="+idx;
	}else{
		return false;
	}	
}

function modifyProduct(idx){
	if(confirm("정말 수정하시겠습니까?")){
		location = 'productModifyForm.do?productId='+idx;		
	}else{
		return false;
	}
}

</script>
<style type="text/css">
button{
	width: 100px;
}
</style>
<div style="text-align: center;">
<h2>상품 관리</h2>
	<div>
	<button id="registerProductBtn" style="position:relative;left: 450px;margin-bottom: 10px; ">상품등록</button>
	<c:if test="${fn:length(requestScope.productList) != 0 }">
		<table style="width: 1000px;margin:0 auto;border-collapse: collapse;" border='1'>
			<thead>
				<tr style="background-color: #F1F1F1">
					<td></td>
					<td>상품번호</td>
					<td>상품명</td>
					<td>가격</td>
					<td>유통기한</td>
					<td>판매자</td>
					<td>비고</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${requestScope.productList }" var="product" >
					<tr>
						<td>
						<img src="<%=request.getContextPath()%>/${product.imagePath}" width="60px" height="60px"/> 
						</td>
						<td>${product.productId }</td>
						<td>${product.productName}</td>
						<td><fmt:formatNumber value="${product.productPrice}"/>원</td>
						<td>${product.expDate}</td>
						<td>${product.sellerId}</td>
						<td><button id="modifyProductBtn" onclick="modifyProduct(${product.productId})">상품수정</button><br>
						<button id="deleteProductBtn" onclick="deleteProduct(${product.productId })">상품 삭제</button> </td>
					</tr> 
				</c:forEach>
			</tbody>
		</table>
	</c:if>
	</div>
</div>