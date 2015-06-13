<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>따옴몰</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<style type="text/css" >
#remoCon {
	position: fixed;
	width: 200px;
	height: auto;
	right: 40px;
	top: 230px;
 } 
body{
	width:1300px;
	margin:0 auto;
}

table{
		border: 1px none #DCD8D0;
}


button {
  font-family: arial;
  font-weight: bold;
  color: #FFFFFF !important;
  font-size: 14px;
  padding: 9px 11px;
  -moz-border-radius: 15px;
  -webkit-border-radius: 15px;
  border-radius: 15px;
  background: #CD0000;
  background: linear-gradient(top,  #5C5C5C,  #A6A6A6);
  background: -ms-linear-gradient(top,  #5C5C5C,  #A6A6A6);
  background: -webkit-gradient(linear, left top, left bottom, from(#5C5C5C), to(#A6A6A6));
  background: -moz-linear-gradient(top,  #5C5C5C,  #A6A6A6);
}
button:hover {
  color: #000000 !important;
  background: #FFFFFF;
  background: linear-gradient(top,  #A6A6A6,  #5C5C5C);
  background: -ms-linear-gradient(top,  #A6A6A6,  #5C5C5C);
  background: -webkit-gradient(linear, left top, left bottom, from(#A6A6A6), to(#5C5C5C));
  background: -moz-linear-gradient(top,  #A6A6A6,  #5C5C5C);
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
	width: 1270px;
	padding:15px;
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
	<%@ include file="/WEB-INF/view/layout/remote.jsp" %>
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


