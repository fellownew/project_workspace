<img src="http://www.wisetiger.co.uk/blog/wp-content/uploads/2012/05/404-error-blog1.jpg">
<%@ page contentType="text/html; charset=UTF-8"%>
<meta charset="UTF-8">
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	
	alert(('페이지를 찾을 수 없습니다. 메인페이지로 이동합니다.'));
	var url ='<%=request.getContextPath()%>/mainPage.do';
	$(location).attr('href',url);
});
</script>



