<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript">
function deleteBoard(idx){
	if(confirm("정말 삭제하시겠습니까?")){
		location = "deleteBoard.do?boardNo="+idx;
	}else{
		return false;
	}	
}


</script>
<div>
	<table border='1'  style=" width:1000px;margin: 0 auto">
		<thead>
			<tr>
				<td width="100px">No</td>
				<td width="650px">제목</td>
				<td width="100px">상품번호</td>
				<td width="150px">글쓴이</td>
			</tr>
		</thead>
		<tbody id="tbody">
			<c:forEach items="${requestScope.boardList }" var="board">
				<tr>
					<td>${board.boardNo }</td>
					<td>${board.title}</td>
					<td><a href="/taommall/productInfo.do?productId=${board.productId}">${board.productId}</a></td>
					<td>${board.buyerId}</td>
				</tr>
				<tr>
					<td colspan="3">${board.content }</td>
					<td><button onclick="deleteBoard(${board.boardNo })">삭제</button> </td>
				</tr> 
			</c:forEach>
		</tbody>
	</table>
	<c:choose>
		<c:when test="${pagingBean.previousPageGroup }">
			<a href="<%=request.getContextPath()%>/list.do?page=${pagingBean.startPageOfPageGroup-1}">◀</a>
		</c:when>
		<c:otherwise>
			◀
		</c:otherwise>
	</c:choose>	
	<!-- 페이지 번호 -->
	<c:forEach begin="${pagingBean.startPageOfPageGroup }" end="${pagingBean.endPageOfPageGroup}" var="pageNum">
		<c:choose>
			<c:when test="${pageNum == pagingBean.currentPage }">
				<b>[${pageNum}]</b>
			</c:when>
			<c:otherwise>
				<a href="<%=request.getContextPath()%>/list.do?page=${pageNum}&search=${requestScope.search }">
					${pageNum}
				</a>
			</c:otherwise>
		</c:choose>
		&nbsp;&nbsp;
	</c:forEach>
	<!-- 다음 페이지 그룹 -->
	<c:choose>
		<c:when test="${pagingBean.nextPageGroup }">
			<a href="<%=request.getContextPath()%>/list.do?page=${pagingBean.endPageOfPageGroup+1}">▶</a>
		</c:when>
		<c:otherwise>
			▶
		</c:otherwise>
	</c:choose>	
</div>