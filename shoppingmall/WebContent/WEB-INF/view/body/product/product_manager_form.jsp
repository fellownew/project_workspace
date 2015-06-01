<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<meta charset="UTF-8">
<script type="text/javascript" src="<%=request.getContextPath() %>/script/jquery.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#registerProductBtn").on("click",function(){
		location = '../productJoinForm.do';
	});
	$("#modifyProductBtn").on("click",function(){
		
	});
});

function deleteProduct(idx){
	if(confirm("정말 삭제하시겠습니까?")){
		$.ajax({
			url:"deleteProduct.do",
			type:"POST",
			data:{productId:idx},	
			dataType:"json",
			success:function(res){
				location="productManager.do?sellerId=${sessionScope.loginInfo.sellerId}";
				alert(res);
			}
		});			
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

<body>
<h2>상품 관리</h2>
<button id="registerProductBtn" >상품등록</button>
<c:if test="${fn:length(requestScope.productList) != 0 }">
	<table style="width: 700" border='1'>
		<thead>
			<tr>
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
					<img src="<%=request.getContextPath() %>/${product.imagePath}" width="60px" height="60px"/>
					${product.imagePath }
					</td>
					<td>${product.productId }</td>
					<td>${product.productName}</td>
					<td>${product.productPrice}</td>
					<td>${product.expDate}</td>
					<td>${product.sellerId}</td>
					<td><button id="modifyProductBtn" onclick="modifyProduct(${product.productId})">상품수정</button><br>
					<button id="deleteProductBtn" onclick="deleteProduct(${product.productId })">상품 삭제</button> </td>
				</tr> 
			</c:forEach>
		</tbody>
	</table>
</c:if>
</body>
