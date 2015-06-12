<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/table.css">
<script type="text/javascript" src="<%=request.getContextPath() %>/script/jquery.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#tbody").on("mouseover","tr",function(){
		$("#tbody tr").css("background-color","white");
		$(this).css("background-color","#FFF1F1");
	});
	
});

function info(idx){
	location="productInfo.do?productId="+idx;
}
</script>
	
<style>
h2{
	text-align: center;
	margin-top: 10px;
	margin-bottom: 10px
}
</style>


<div>



<c:choose>
	<c:when test="${fn:length(requestScope.productList) != 0 }">
		<%-- 제목 --%>
		<c:choose>
			<c:when test="${param.search =='food'}">
				<h2>농/수/축산물</h2>
			</c:when>
			<c:when test="${param.search =='fruit'}">
				<h2>과일/채소</h2>
			</c:when>
			<c:when test="${param.search =='health'}">
				<h2>건강식품</h2>
			</c:when>
			<c:when test="${param.search =='snack'}">
				<h2>간식</h2>
			</c:when>
			<c:otherwise>
				<h2>모든 상품</h2>
			</c:otherwise>
		</c:choose>
	<div>
		<%--테이블 --%>
		<table style="width:800px;margin: 0 auto;text-align: center;border:1px;border-collapse:collapse;">
			<thead style="background-color: #FAFAFA">
				<tr style="height:40px;border-bottom-style: solid;">
					<td style="width:500px;" colspan="2">상품</td>
					<td style="width:140px">가격</td>
					<td style="width:140px">유통기한</td>
					<td style="width:120px">판매자</td>
				</tr>
			</thead>
			<tbody id="tbody">
				<c:forEach items="${requestScope.productList }" var="product">
					<tr onclick="info(${product.productId})" style="border: 1px; border-bottom-style: solid;">
						<td style="width:120px"><img src="${product.imagePath }" width="120px" height="120px"/></td>
						<td style="text-align: left;text-indent: 3px;">${product.productName}</td>
						<td style="text-align: right; "><fmt:formatNumber value="${product.productPrice}"/>원</td>
						<td>${product.expDate}</td>
						<td>${product.sellerId}</td>
					</tr> 
				</c:forEach>
			</tbody>
		</table>
	</div>
		<div style="text-align: center;">
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