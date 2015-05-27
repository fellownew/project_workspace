<%@ page contentType="text/html;charset=UTF-8"%>
<style type="text/css">
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
<body>
	<button class="myButton">버튼1</button>
	<button class="myButton">버튼2</button>
	<button class="myButton">버튼3</button>
	<button class="myButton">버튼4</button>
	
</body>