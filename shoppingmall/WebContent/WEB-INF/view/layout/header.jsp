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
	<c:choose>
	<%-- 관리자 --%>
		<c:when test="${not empty sessionScope.loginInfo.auth}">
			관리자
		</c:when>
	<%-- 판매자 --%>
		<c:when test="${not empty sessionScope.loginInfo.coporateNumber}">
			<a href="<%=request.getContextPath() %>/productInfoForm.do">상품관리</a> |
			<a href="<%=request.getContextPath() %>/sellerInfoForm.do">회원정보</a> |
			<a href="<%=request.getContextPath() %>/logout">로그아웃</a>
		</c:when>
	<%-- 구매자 --%>
		<c:when test="${not empty sessionScope.login}">
			<a href="<%=request.getContextPath() %>/buyerInfoForm.do">회원정보</a> |
			<a href="<%=request.getContextPath() %>/logout">로그아웃</a>
		</c:when>
	<%-- 비로그인 --%>		
		<c:otherwise>
			<a href="<%=request.getContextPath() %>/buyerJoinForm.do">회원가입</a> |
			<a href="<%=request.getContextPath() %>/buyerLoginForm.do">로그인</a>
		</c:otherwise>
	</c:choose>
			

</body>