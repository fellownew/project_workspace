<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
#remoCon {
	position: fixed;
	width: 200px;
	height: 50px;
	right: 200px;
	bottom: 520px;
 } 
</style>
<title>Insert title here</title>
	
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.js"></script>
<script>

$("#remoCon").click(function(){	
	$("html, body").animate({scrollTop: 0}, 1000);
});
</script>
</head>
<body>
<img src="<%=request.getContextPath()%>/image/melon2.jpg">
 <div id="remoCon" style=" background-color: yellow;" >
     <div style="text-align: center;">오늘 본 상품</div>
 </div> 
</body>
</html>