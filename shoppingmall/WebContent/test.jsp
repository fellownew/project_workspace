<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css" >

body{
	margin-left:200px;
	margin-right:200px;
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

#topmenu li {
	list-style: none;
	color: white;
	background-color: black;
	border: 1px solid black;
	float: left;
	line-height: 30px;
	vertical-align: middle;
	text-align: center;
	width: 150px;
}
.topmenu a {
	text-decoration: none;
	color: white;
	display: block;
	width: 150px;
	font-size: 12px;
	font-weight: bold;
}

.myButton {
	-moz-box-shadow:inset 0px 1px 0px 0px #cf866c;
	-webkit-box-shadow:inset 0px 1px 0px 0px #cf866c;
	box-shadow:inset 0px 1px 0px 0px #cf866c;
	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #d0451b), color-stop(1, #c7624d));
	background:-moz-linear-gradient(top, #d0451b 5%, #c7624d 100%);
	background:-webkit-linear-gradient(top, #d0451b 5%, #c7624d 100%);
	background:-o-linear-gradient(top, #d0451b 5%, #c7624d 100%);
	background:-ms-linear-gradient(top, #d0451b 5%, #c7624d 100%);
	background:linear-gradient(to bottom, #d0451b 5%, #c7624d 100%);
	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#d0451b', endColorstr='#c7624d',GradientType=0);
	background-color:#d0451b;
	-moz-border-radius:3px;
	-webkit-border-radius:3px;
	border-radius:3px;
	border:1px solid #942911;
	display:inline-block;
	cursor:pointer;
	color:#ffffff;
	font-family:Arial;
	font-size:13px;
	padding:6px 24px;
	text-decoration:none;
	text-shadow:0px 1px 0px #854629;
}
.myButton:hover {
	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #c7624d), color-stop(1, #d0451b));
	background:-moz-linear-gradient(top, #c7624d 5%, #d0451b 100%);
	background:-webkit-linear-gradient(top, #c7624d 5%, #d0451b 100%);
	background:-o-linear-gradient(top, #c7624d 5%, #d0451b 100%);
	background:-ms-linear-gradient(top, #c7624d 5%, #d0451b 100%);
	background:linear-gradient(to bottom, #c7624d 5%, #d0451b 100%);
	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#c7624d', endColorstr='#d0451b',GradientType=0);
	background-color:#c7624d;
}
.myButton:active {
	position:relative;
	top:1px;
}



</style>
</head>
<body>
	<div class="topmenu" style="text-align: right;">
		<a href="http://daum.net">다음</a>|
		<a href="http://naver.com">네이버</a>|
		<a href="http://google.com">구글</a>
	</div>
	
	<div class="midmenu">
		midmenu
	</div>

	<div class="sidemenu">
		<button class="myButton">버튼1</button><br>
		<button class="myButton">버튼2</button><br>
		<button class="myButton">버튼3</button><br>
	</div>
	
	<div class="mainpage">
		메인
	</div>
	
	<div class="footer">
		바닥
	</div>
	
</body>
</html>


