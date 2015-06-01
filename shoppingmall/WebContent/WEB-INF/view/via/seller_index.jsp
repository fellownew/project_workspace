<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>셀러</h2>
<a href="<%=request.getContextPath()%>/seller/sellerJoinForm.do">회원가입</a> | 
<a href="<%=request.getContextPath()%>/seller/sellerModifyForm.do">정보수정</a> | 
<a href="<%=request.getContextPath()%>/seller/sellerInfoForm.do">정보조회</a> | 
<a href="<%=request.getContextPath()%>/seller/sellerLoginForm.do">로그인</a><br>
<a href="<%=request.getContextPath()%>/seller/sellerList.do">셀러 리스트</a><br>
</body>
</html>