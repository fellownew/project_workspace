<%@ page contentType="text/html; charset=UTF-8"%>
<meta charset="UTF-8">
<img src="http://gumchim.co.kr/images/imgs/err.gif">
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript">
alert(('잘못된 접근입니다. 메인페이지로 이동합니다.500'));
	var url ='/taommall/mainPage.do';
	$(location).attr('href',url);
</script>