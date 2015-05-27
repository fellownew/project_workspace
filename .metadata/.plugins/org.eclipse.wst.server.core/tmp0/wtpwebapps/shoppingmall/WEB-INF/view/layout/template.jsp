<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css" >

body{
	margin:100px;
	padding:0auto;
}

.topmenu{
	background-color:white;
	
}

.midmenu{
	background-color:tomato;
	color:white;
	text-align:center;
	padding: 5px;
}
.sidemenu{
	line-height: 50px;
	background-color:#F5F5DC;
	padding: 15px;
	height:400px;
	width:100px;
	float:left;
}
.mainpage{
	
	padding: 15px;
	height:400px;
	float:left;
}
.footer{
	background-color:tomato;
	color:white;
	padding-top:20px;
	text-align:center;
	height:50px;
	clear:both;
}

</style>
</head>
<body>
	<div class="topmenu" style="text-align: right;">
		<tiles:insertAttribute name="topmenu"/>
	</div>
	
	<div class="midmenu">
		<tiles:insertAttribute name="midmenu"/>
	</div>

	<div class="sidemenu">
		<tiles:insertAttribute name="sidemenu"/>
	</div>
	
	<div class="mainpage">
		<tiles:insertAttribute name="body"/>
	</div>
	
	<div class="footer">
		<tiles:insertAttribute name="footer"/>
	</div>
	
</body>
</html>


