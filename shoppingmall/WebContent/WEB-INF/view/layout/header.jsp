<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">

function home(){
	location = "<%=request.getContextPath() %>";
}
</script>
<style type="text/css">
body a {
	width: 150px;
	font-size: 15px;
	font-weight: bold;
	
}
#left{
	float: left;
}
#sleft{
	float: left;
	padding-top: 30px;
}
#right{
	float: left;
	padding-top: 60px;
}
</style>
<body>
	<ul id="left" style="width: 500px"><img src="<%=request.getContextPath() %>/image/logo.jpg" onclick="home()"></ul>
	<form id="sleft" style="width: 700px" action="search.do" method="POST">
		<input type="text" name="search" autofocus="autofocus" style="width:500px;height: 30px" >
		<input type="submit" value="검색">
	</form>
	<ul id="right">
		<c:choose>
			<%-- 판매자 확인 --%>
			<c:when test="${sessionScope.user=='seller'}">
				<c:choose>
					<c:when test="${sessionScope.loginInfo.admin=='true' }">
						<a href="<%=request.getContextPath() %>/seller/auth/memberListPaging.do">회원관리</a>	
						<a href="<%=request.getContextPath() %>/seller/auth/logout.do">로그아웃</a>	
					</c:when>
					<c:otherwise>
						${requestScope.loginInfo.sellerId }님 환영합니다. | 
						<a href="<%=request.getContextPath() %>/auth/productManager.do?sellerId=${sessionScope.loginInfo.sellerId}">상품관리</a> |
						<a href="<%=request.getContextPath() %>/auth/sellerInfoForm.do">회원정보</a> |
						<a href="<%=request.getContextPath() %>/seller/auth/logout.do">로그아웃</a>	
					</c:otherwise>
				</c:choose>	
			</c:when>
			<%-- 구매자 확인 --%>
			<c:when test="${sessionScope.user=='buyer'}">
				${requestScope.loginInfo.buyerId }님 환영합니다. | 
				<a href="<%=request.getContextPath() %>/auth/buyerInfoForm.do">회원정보</a> |
				<a href="<%=request.getContextPath() %>/buyer/auth/logout.do">로그아웃</a>	
			</c:when>
			<%-- 비로그인 --%>
			<c:otherwise>
					<a href="<%=request.getContextPath() %>/memberJoinForm.do">회원가입</a> |
					<a href="<%=request.getContextPath() %>/memberLoginForm.do">로그인</a>
			</c:otherwise>	
		</c:choose>
	</ul>
</body>
