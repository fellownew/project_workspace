<%@ page contentType="text/html; charset=UTF-8"%>
<meta charset="UTF-8">
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	alert(('${requestScope.errorMessage}'));
	window.close();
});
</script>
