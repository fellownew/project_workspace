<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<script type="text/javascript" src="<%=request.getContextPath() %>/script/jquery.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/script/date_picker.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#registerBtn").on("click",function(){
			if($("#productId").val().trim()=='' ||
					$("#productPrice").val().trim()=='' ||
					$("#productInfo").val().trim()=='' ||
					$("#upfile").val().trim()=='' ||
					$("#expDate").val().trim()=='' ){
					alert("입력정보를 확인하세요");
					return false;
				}
		});
	});
</script>

<body>
<h2> 상 품 등 록 </h2>

<form action="auth/insertProduct.do" method="POST" enctype="multipart/form-data">
	<input type="text" id="productName" name="productName" placeholder="상품이름" required="required"/><br>
	<input type="number" id="productPrice" name="productPrice" placeholder="상품가격" required="required"/><br>
	상품 분류 : 
	<select name="category" id="category">
		<option value="food" selected="selected">농/수/축산물</option>
		<option value="fruit">과일/채소</option>
		<option value="health">건강식품</option>
		<option value="snack">간식</option>
	</select><br>
	<textarea id="productInfo" name="productInfo" rows="30" cols="100" placeholder="상품 정보" required="required"></textarea><br>
	<input type="file" id="upfile" name="upfile"/><br>
	<input type="text" id="expDate" name="expDate" required="required">
	<input type="button" value="유통기한" onClick="datePicker(event,'expDate')"><br>
	<input type="hidden" name="SellerId" value="${sessionScope.loginInfo.sellerId }"/>
	<input type="submit" id="registerBtn" value="상품등록">
</form>

</body>
