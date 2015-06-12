<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<script type="text/javascript" src="${initParam.rootPath }/script/jquery.js"></script>
<script type="text/javascript" src="${initParam.rootPath }/script/date_picker.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#modifyBtn").on("click",function(){
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

<div>
<h2> 상 품 정 보 변 경 </h2>
	상품번호 : ${requestScope.product.productId }
<form action="${initParam.rootPath}/auth/modifyProduct.do" method="POST" enctype="multipart/form-data">
	<input type="text" id="productName" name="productName" placeholder="상품이름" value="${requestScope.product.productName }" required="required"/><br>
	<input type="number" id="productPrice" name="productPrice" placeholder="상품가격" value="${requestScope.product.productPrice }" required="required"/><br>
	상품 분류 : 
	<select name="category" id="category">
		<option value="food">농/수/축산물</option>
		<option value="fruit">과일/채소</option>
		<option value="health">건강식품</option>
		<option value="snack">간식</option>
	</select><br>
	<input type="text" id="productInfo" name="productInfo" placeholder="상품 요약 정보" required="required" value="${requestScope.product.productInfo }"><br>
	상품 사진 : <input type="file" id="upfile" name="upfile"/><br>
	상품 정보 : <input type="file" id="infoUpfile" name="infoUpfile"/><br>
	<input type="text" id="expDate" name="expDate" required="required" value="${requestScope.product.expDate }">
	<input type="button" value="유통기한" onClick="datePicker(event,'expDate')"><br>
	<input type="hidden" name="productId" value="${requestScope.product.productId }"/>
	<input type="hidden" name="SellerId" value="${sessionScope.loginInfo.sellerId }"/>
	<input type="submit" id="modifyBtn" value="상품정보 변경">
</form>

</div>
