<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#deleteBoard").on("click",function(){
		
	});
});


</script>
<div>
	<table border='1'  style=" width:800px;margin: 0 auto">
		<thead>
			<tr>
				<td>No</td>
				<td>제목</td>
				<td>상품번호</td>
				<td>판매자</td>
			</tr>
		</thead>
		<tbody id="tbody">
			<c:forEach items="${requestScope.boardList }" var="board">
				<tr>
					<td>${board.boardNo }</td>
					<td>${board.title}</td>
					<td><a href="productInfo.do?productId=${board.productId}">${board.productId}</a></td>
					<td>${board.buyerId}</td>
				</tr>
				<tr>
					<td colspan="3">${board.content }</td>
					<td><button id="deleteBoard">삭제</button> </td>
				</tr> 
			</c:forEach>
		</tbody>
	</table>
</div>