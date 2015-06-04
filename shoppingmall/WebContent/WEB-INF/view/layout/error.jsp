<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	
	alert(('${requestScope.errorMessage}'));
	var url ='<%=request.getContextPath()%>/mainPage.do';
	$(location).attr('href',url);
});
</script>
</head>
<body>

</body>
</html>