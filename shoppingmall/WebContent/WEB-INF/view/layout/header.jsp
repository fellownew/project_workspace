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
	width: 300px;
	margin-top: 20px;
	margin-bottom: 20px;
}
#search{
	float: left;
	width:600px;
	margin:0 auto;
	margin-top: 60px;
	
}
.right{
	float: left;
	width:350px;
	margin-top:80px;
	text-align: right;
}
</style>
<body>
	<div class="left">
		<img src="<%=request.getContextPath() %>/image/logo.jpg" alt="Taom" onclick="home()">
	</div>
	<form id="search" action="list.do" method="POST">
		<input type="text" name="search" autofocus="autofocus" style="width:500px;height: 30px" >
		<input type="submit" value="검색">
	</form>
	<div class="right">
		<c:choose>
			<%-- 판매자 확인 --%>
			<c:when test="${sessionScope.user=='seller'}">
				<c:choose>
					<c:when test="${sessionScope.loginInfo.admin=='true' }">
						<a href="<%=request.getContextPath() %>/seller/auth/memberList.do">회원관리</a> |
						<a href="#">고객센터 관리</a> |
						<a href="<%=request.getContextPath() %>/auth/logout.do">로그아웃</a>	
					</c:when>
					<c:otherwise>
						${sessionScope.loginInfo.sellerId }님 환영합니다. <br>
						<a href="<%=request.getContextPath() %>/auth/sellerInfoForm.do">회원정보</a> |
						<a href="<%=request.getContextPath() %>/auth/productManager.do?sellerId=${sessionScope.loginInfo.sellerId}">상품관리</a> |
						<a href="#">고객센터</a> |
						<a href="<%=request.getContextPath() %>/auth/logout.do">로그아웃</a>	
					</c:otherwise>
				</c:choose>	
			</c:when>
			<%-- 구매자 확인 --%>
			<c:when test="${sessionScope.user=='buyer'}">
				${sessionScope.loginInfo.buyerId }님 환영합니다. <br>
				<a href="<%=request.getContextPath() %>/auth/buyerInfoForm.do">회원정보</a> |
				<a href="#">장바구니</a> |
				<a href="#">고객센터</a> |
				<a href="<%=request.getContextPath() %>/auth/logout.do">로그아웃</a>	
			</c:when>
			<%-- 비로그인 --%>
			<c:otherwise>
					<a href="<%=request.getContextPath() %>/memberJoinForm.do">회원가입</a> |
					<a href="<%=request.getContextPath() %>/memberLoginForm.do">로그인</a>
			</c:otherwise>	
		</c:choose>
	</div>
</body>
