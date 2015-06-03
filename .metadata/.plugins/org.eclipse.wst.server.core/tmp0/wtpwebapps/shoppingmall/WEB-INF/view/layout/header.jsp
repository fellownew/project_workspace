<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">

function home(){
	location = "<%=request.getContextPath() %>";
}
</script>
<style type="text/css">
a{
	width: 150px;
	font-size: 15px;
	font-weight: bold;
}
.left{
	float: left;
	width: 350px;
}
#search{
	float: left;
	width:600px;
	padding-top: 30px;
	margin:0 auto;
	margin-top: 30px;
	
}
.right{
	float: left;
	width:250px;
	padding-top: 60px;
}
</style>
<body>
	<ul class="left"><img src="<%=request.getContextPath() %>/image/logo.jpg" onclick="home()"></ul>
	<form id="search" action="list.do" method="POST">
		<input type="text" name="search" autofocus="autofocus" style="width:500px;height: 30px" >
		<input type="submit" value="검색">
	</form>
	<ul class="right">
		<c:choose>
			<%-- 판매자 확인 --%>
			<c:when test="${sessionScope.user=='seller'}">
				<c:choose>
					<c:when test="${sessionScope.loginInfo.admin=='true' }">
						<a href="<%=request.getContextPath() %>/seller/auth/memberListPaging.do">회원관리</a>
						<a href="<%=request.getContextPath() %>/seller/auth/logout.do">로그아웃</a>	
					</c:when>
					<c:otherwise>
						${sessionScope.loginInfo.sellerId }님 환영합니다. | 
						<a href="<%=request.getContextPath() %>/auth/productManager.do?sellerId=${sessionScope.loginInfo.sellerId}">상품관리</a> |
						<a href="<%=request.getContextPath() %>/auth/sellerInfoForm.do">회원정보</a> |
						<a href="<%=request.getContextPath() %>/seller/auth/logout.do">로그아웃</a>	
					</c:otherwise>
				</c:choose>	
			</c:when>
			<%-- 구매자 확인 --%>
			<c:when test="${sessionScope.user=='buyer'}">
				${sessionScope.loginInfo.buyerId }님 환영합니다. | 
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
