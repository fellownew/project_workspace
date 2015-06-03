<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>따옴몰</title>

<style type="text/css" >

body{
	width:1300px;
	margin:0 auto;
}

#header{
	
	background-color:white;
	overflow:auto;
}

#nav{
	background-color:tomato;
	text-align:center;
	float:none;
	padding: 5px;
	overflow:auto;
}
#section{
	text-align:center;
	float:left;
	width: 1300px;
	margin:0 auto; 
	
}
#footer{
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
	<div id="header">
		<tiles:insertAttribute name="header"/>
	</div>
	
	<div id="nav">
		<tiles:insertAttribute name="nav"/>
	</div>
	
	<div id="section">
		<tiles:insertAttribute name="body"/>
	</div>
	
	<div id="footer">
		<tiles:insertAttribute name="footer"/>
	</div>
	
</body>
</html>


