<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<div>
	<div>
<c:choose>
	<c:when test="${fn:length(requestScope.productList) != 0 }">
		<table border='1'  style=" width:800px;margin: 0 auto">
			<thead>
				<tr>
					<td></td>
					<td>상품명</td>
					<td>가격</td>
					<td>유통기한</td>
					<td>판매자</td>
				</tr>
			</thead>
			<tbody id="tbody">
				<c:forEach items="${requestScope.productList }" var="product">
					<tr onclick="info(${product.productId})">
						<td><img src="${product.imagePath }" width="120px" height="120px"/></td>
						<td>${product.productName}</td>
						<td>${product.productPrice}</td>
						<td>${product.expDate}</td>
						<td>${product.sellerId}</td>
					</tr> 
				</c:forEach>
			</tbody>
		</table>
			<c:choose>
				<c:when test="${pagingBean.previousPageGroup }">
					<a href="<%=request.getContextPath()%>/list.do?page=${pagingBean.startPageOfPageGroup-1}&search=${requestScope.search }">◀</a>
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
					<a href="<%=request.getContextPath()%>/list.do?page=${pagingBean.endPageOfPageGroup+1}&search=${requestScope.search }">▶</a>
				</c:when>
				<c:otherwise>
					▶
				</c:otherwise>
			</c:choose>	
	</c:when>
	<c:otherwise>
		검색 결과가 없습니다.
	</c:otherwise>
</c:choose>

</div>
</div>