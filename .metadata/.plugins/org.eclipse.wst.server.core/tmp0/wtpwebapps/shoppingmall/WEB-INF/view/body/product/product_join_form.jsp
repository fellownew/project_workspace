<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<script type="text/javascript" src="${initParam.rootPath }/script/jquery.js"></script>
<script type="text/javascript" src="${initParam.rootPath }/script/date_picker.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#registerBtn").on("click",function(){
			alert($("form").serialize());
			$.ajax({
				url:"${initParam.rootPath}/auth/product/insert.do",
				type:"POST",
				dataType:"JSON",
				data:$("form").serialize(),
				success:function(txt){
					alert("try");
				}
			})
			alert("3");
		});
	});
</script>

<body>
<h2> 상 품 등 록 </h2>

<form action="${initParam.rootPath}/auth/product/insert.do" method="POST" enctype="multipart/form-data">
	<input type="text" name="productName" placeholder="상품이름" required="required"/><br>
	<input type="number" name="productPrice" placeholder="상품가격" required="required"/><br>
	상품 분류 : 
	<select name="category" id="category">
		<option value="food" selected="selected">농/수/축산물</option>
		<option value="fruit">과일/채소</option>
		<option value="health">건강식품</option>
		<option value="snack">간식</option>
	</select><br>
	<textarea name="productInfo" rows="30" cols="100" placeholder="상품 정보" required="required"></textarea><br>
	<input type="file" name="upfile"/><br>
	<input type="text" name="expDate" required="required">
	<input type="button" value="유통기한" onClick="datePicker(event,'expDate')"><br>
	<input type="hidden" name="SellerId" value="${sessionScope.loginInfo.sellerId }"/>
	<input type="submit" id="registerBtn" value="상품등록">
</form>

</body>