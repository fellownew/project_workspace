<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결제창</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/sidemenu.css">
<script type="text/javascript" src="<%=request.getContextPath() %>/script/jquery.js"></script>
<script type="text/javascript">

$(document).ready(function(){
	$("#test").on("click",function(){
		opener.parent.payment();
		window.self.close();
	});
});


</script>
</head>
<body>

	<button id="test">결제</button><button onclick="window.close()">취소</button>
</body>
</html>