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

<form>
	<input type="text" name="productName" placeholder="상품이름"/><br>
	<input type="number" name="productPrice" placeholder="상품가격"/><br>
	상품 분류 : 
	<select name="category" id="category">
		<option value="food">농/수/축산물</option>
		<option value="fruit">과일/채소</option>
		<option value="health">건강식품</option>
		<option value="snack">간식</option>
	</select><br>
	<textarea name="productInfo" rows="50" cols="200" placeholder="상품 정보"></textarea><br>
	<input type="file" name="imagePath"/><br>
	<input type="text" name="expDate">
	<input type="button" value="유통기한" onClick="datePicker(event,'expDate')"><br>
	
	<input type="hidden" name="command" value="joinProduct"/>
	<input type="hidden" name="SellerId" value="seller-1"/> <!-- 테스트용 임시 파라미터 -->
	
	<button id="registerBtn">상품등록</button>
</form>

</body>
