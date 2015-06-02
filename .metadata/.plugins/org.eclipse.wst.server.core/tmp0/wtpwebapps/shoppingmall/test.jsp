<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style type="text/css">
body a {
	width: 150px;
	font-size: 15px;
	font-weight: bold;
	
}
</style>
<body>
	<c:if test="${not empty sessionScope.loginInfo.admin }">
		<c:if test="${sessionScope.loginInfo.admin=='true' }">
			관리자
		
		</c:if>
	</c:if>
	
	



	<c:choose>
	<%-- 관리자 --%>
		<c:when test="${sessionScope.loginInfo.admin=='true'}">
			관리자
		</c:when>
	<%-- 판매자 --%>
		<c:when test="${sessionScope.loginInfo.auth=='true'}">
			<a href="<%=request.getContextPath() %>/productManagerForm.do">상품관리</a> |
			<a href="<%=request.getContextPath() %>/sellerInfoForm.do">회원정보</a> |
			<a href="<%=request.getContextPath() %>/seller/logout.do">로그아웃</a>
		</c:when>
	<%-- 구매자 --%>
		<c:when test="${not empty sessionScope.login}">
		
			<a href="<%=request.getContextPath() %>/buyerInfoForm.do">회원정보</a> |
			<a href="<%=request.getContextPath() %>/buyer/logout.do">로그아웃</a>
		</c:when>
	<%-- 비로그인 --%>		
		<c:otherwise>
			<a href="<%=request.getContextPath() %>/buyerJoinForm.do">회원가입</a> |
			<a href="<%=request.getContextPath() %>/buyerLoginForm.do">로그인</a>
		</c:otherwise>
	</c:choose>
			

</body>
