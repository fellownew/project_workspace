<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css" >

body{
	margin:50px;
	padding:0auto;
}

#header{
	background-color:white;
}

#nav{
	background-color:tomato;
	text-align:center;
	float:none;
	padding: 5px;
	overflow:auto;
}

#section{

	padding: 15px;
	float:none;
}
#footer{
	background-color:tomato;
	color:white;
	padding-top:20px;
	text-align:center;
	height:50px;
	clear:both;
}

.center{
	margin-left:auto;
	margin-right:auto;
	width:30%
}

</style>
</head>
<body>
	<div id="header" style="text-align: right;">
		<tiles:insertAttribute name="header"/>
	</div>
	
	<div id="nav">
		<tiles:insertAttribute name="nav"/>
	</div>
	
	<div id="section" class="center">
		<tiles:insertAttribute name="body"/>
	</div>
	
	<div id="footer">
		<tiles:insertAttribute name="footer"/>
	</div>
	
</body>
</html>


