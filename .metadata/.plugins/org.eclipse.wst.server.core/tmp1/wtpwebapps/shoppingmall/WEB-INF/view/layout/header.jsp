<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="<%=request.getContextPath() %>/script/jquery.js"></script>
<script type="text/javascript">

function home(){
	location = "<%=request.getContextPath()%>"
	
}

function note(){
	window.open("auth/note.do?folder=receive","쪽지",'width=700,height=500,toolbar=no,location=no,status=no,menubar=no,scrollbars=no,resizable=no,left=150,top=100');
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
	width: 250px;
	margin-top: 32px;
	margin-bottom: 20px;
}
#search{
	float: left;
	width:550px;
	margin:0 auto;
	margin-top: 65px;
	
}
.right{
	float: left;
	width:400px;
	height:60px;
	margin-top:65px;
	text-align: right;
	vertical-align: text-bottom;
}
</style>


<body>
	<div class="left">
		<img src="<%=request.getContextPath() %>/image/logo.jpg" alt="Taom" onclick="home()">
	</div>
	<form id="search" action="list.do" method="POST">
		<input type="text" name="search" autofocus="autofocus" style="width:480px;height: 40px" >
		<input type="submit" value="검색">
	</form>
	<div class="right">
		<c:choose>
			<%-- 판매자 확인 --%>
			<c:when test="${sessionScope.user=='seller'}">
				<c:choose>
					<%-- 관리자 --%>
					<c:when test="${sessionScope.loginInfo.admin=='true' }">
						<a href="<%=request.getContextPath() %>/seller/auth/memberList.do">회원관리</a> |
						<a href="<%=request.getContextPath() %>/board/auth/boardList.do">후기관리</a> |
						<a href="<%=request.getContextPath() %>/auth/centerList.do">고객센터 관리</a> |
						<a href="#" onclick="note()">쪽지관리</a> |
						<a href="<%=request.getContextPath() %>/auth/logout.do">로그아웃</a>	
					</c:when>
					<c:otherwise>
						${sessionScope.loginInfo.sellerId }님 환영합니다. <br>
						<a href="<%=request.getContextPath() %>/auth/sellerInfoForm.do">회원정보</a> |
						<a href="<%=request.getContextPath() %>/auth/orderManager.do">주문관리</a> |
						<a href="<%=request.getContextPath() %>/auth/productManager.do?sellerId=${sessionScope.loginInfo.sellerId}">상품관리</a><br>
						<a href="<%=request.getContextPath() %>/auth/centerList.do">고객센터</a> |
						<a href="#" onclick="note()">쪽지관리</a> |
						<a href="<%=request.getContextPath() %>/auth/logout.do">로그아웃</a>	
					</c:otherwise>
				</c:choose>	
			</c:when>
			<%-- 구매자 확인 --%>
			<c:when test="${sessionScope.user=='buyer'}">
				${sessionScope.loginInfo.buyerId }님 환영합니다. <br>
				<a href="<%=request.getContextPath()%>/auth/buyerInfoForm.do">회원정보</a> |
				<a href="<%=request.getContextPath()%>/cart/auth/cartList.do">장바구니</a> |
				<a href="<%=request.getContextPath()%>/auth/completeList.do">주문내역</a><br> |
				<a href="<%=request.getContextPath() %>/auth/centerList.do">고객센터</a> |
				<a href="#" onclick="note()">쪽지관리</a> |
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