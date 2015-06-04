<%@ page contentType="text/html;charset=UTF-8"%>
<div style="width: 700px;margin:0 auto">
<h2 style="text-align: center"> 글 쓰 기 </h2>
	<form action="insertProduct.do" method="POST" enctype="multipart/form-data">
		<input type="text" id="title" name="title" placeholder="제목" required="required"/><br>
		<textarea id="content" name="content" rows="30" cols="110" placeholder="내용" required="required"></textarea><br>
		<input type="hidden" name="buyerId" value="${sessionScope.loginInfo.buyerId }"/><p>
		<input type="submit" id="registerBtn" value="글 등록">
	</form>
</div>