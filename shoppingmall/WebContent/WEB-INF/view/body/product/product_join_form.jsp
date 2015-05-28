<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<script type="text/javascript" src="${initParam.rootPath }/script/jquery.js"></script>
<script type="text/javascript" src="${initParam.rootPath }/script/date_picker.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$('input').on("focus",function(){
			$(this).Text("");
		});
		$('textarea').on("focus",function(){
			$(this).Text("");
		});
		$("#register").on("click",function(){
			alert("df");
		});
	});
</script>

<body>
<!-- 

	private String productId;
	private String productName;
	private int productPrice;
	private String category;
	private String productInfo;
	private String imagePath;
	private String regiDate;
	private String expDate;
	private String SellerId; -->

<form action="/auth/product/insert.do" method="POST">
	<input type="text" value="상품이름" id="name"/><br>
	<input type="number" value="상품가격" id="price"/><br>
	<select name="category" id="category">
		<option value="food">농/수/축산물</option>
		<option value="fruit">과일/채소</option>
		<option value="health">건강식품</option>
		<option value="snack">간식</option>
	</select><br>
	<textarea id="info" rows="200" cols="200">상품 정보</textarea><br>
	<input type="file" id="imagePath" value="이미지 파일"/><br>
	<input type="text" id="expDate" name="target_date">
	<input type="button" value="유통기한" onClick="datePicker(event,'target_date')"><br>
	
	<input type="hidden" id="command" value="joinProduct"/>
	
	<button id="register">클릭</button>
</form>


</body>
