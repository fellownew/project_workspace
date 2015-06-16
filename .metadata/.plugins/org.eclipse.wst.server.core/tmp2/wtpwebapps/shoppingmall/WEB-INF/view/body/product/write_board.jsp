<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="<%=request.getContextPath() %>/script/jquery.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#registerBtn").on("click",function(){
		opener.registerBoard($("#title").val(),$("#content").val(),$("#buyerId").val());
		window.close();
	});
});

</script>
<div style="width: 550px;margin:0 auto">
<h2 style="text-align: center"> 글 쓰 기 </h2>
	<form method="POST">
		<input type="text" id="title" name="title" placeholder="제목" required="required" style="font-size: 18px;"/><br>
		<textarea id="content" name="content" rows="20" cols="60" placeholder="내용" required="required" style="font-size: 14px;"></textarea><br>
		<input type="hidden" id="buyerId" name="buyerId" value="${sessionScope.loginInfo.buyerId }"/><p>
		<button id="registerBtn">글 등록</button><button onclick="window.close() ">취소</button>
	</form>
</div>