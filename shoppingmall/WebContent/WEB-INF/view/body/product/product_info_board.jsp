<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<script type="text/javascript">
<!--

//-->
$(document).ready(function(){
	$("#registerBtn").on("click",function(){
		window.open("white_board.jsp");
	});
});
</script>

<div style="width:1000px;margin: 0 auto;">
	상품별 댓글 게시판 구현 예정
	<button id="registerBtn">글쓰기</button>
</div>