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
		
		$("#upfile").on("change",function(){
			var path = $(this).val();			
			var leng = path.length;
			var txt = path.substr(leng-3,3);
			document.e
			if((txt != "jpg") && (txt != "peg") && (txt != "png") && (txt != "gif") && (txt != "bmp")){
				alert("jpg, jpeg, png, gif 파일만 등록 가능합니다.");
				return false;
			}
					
			
		});
		$("#infoUpfile").on("change",function(){
			var path = $(this).val();			
			var leng = path.length;
			var txt = path.substr(leng-3,3);
			if((txt != "jpg") && (txt != "peg") && (txt != "png") && (txt != "gif") && (txt != "bmp")){
				alert("jpg, jpeg, png, gif 파일만 등록 가능합니다.");
				return false;
			}
		});
	});
</script>
<style>
input{
	margin-top: 2px;
	margin-bottom: 2px;
}
</style>
<div style="width: 700px;margin:0 auto">
<h2 style="text-align: center"> 상 품 등 록 </h2>

	<form action="insertProduct.do" method="POST" enctype="multipart/form-data">
		<input type="text" id="productName" name="productName" placeholder="상품이름" maxlength="50" required="required"/><br>
		<input type="number" id="productPrice" name="productPrice" placeholder="상품가격" required="required"/><br>
		상품 분류 : 
		<select name="category" id="category">
			<option value="food" selected="selected">농/수/축산물</option>
			<option value="fruit">과일/채소</option>
			<option value="health">건강식품</option>
			<option value="snack">간식</option>
		</select><br>
		<input type="text" id="productInfo" name="productInfo" placeholder="상품 요약 정보" required="required"><br>
		상품 사진 : <input type="file" id="upfile" name="upfile"/><br>
		상품 정보 : <input type="file" id="infoUpfile" name="infoUpfile"/><br>
		<input type="text" id="expDate" name="expDate" readonly="readonly" required="required">
		<input type="button" value="유통기한" onClick="datePicker(event,'expDate')"><br>
		<input type="hidden" name="SellerId" value="${sessionScope.loginInfo.sellerId }"/><p>
		<input type="submit" id="registerBtn" value="상품등록">
	</form>
</div>