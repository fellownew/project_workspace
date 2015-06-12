<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>따옴몰</title>

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
#aside{
	line-height: 50px;
	background-color:white;
	float:right;
	width:300px;
	text-align:right;
	margin:0 auto;
}
#section{
	text-align:center;
	float:left;
	width: 970px;
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
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript">
//쿠키 생성
function setCookie(cName, cValue, cDay){
       var expire = new Date();
       expire.setDate(expire.getDate() + cDay);
       cookies = cName + '=' + escape(cValue) + '; path=/ '; // 한글 깨짐을 막기위해 escape(cValue)를 합니다.
       if(typeof cDay != 'undefined') cookies += ';expires=' + expire.toGMTString() + ';';
       document.cookie = cookies;
   }

//쿠키 가져오기
function getCookie(cName) {
   cName = cName + '=';
   var cookieData = document.cookie;
   var start = cookieData.indexOf(cName);
   var cValue = '';
   if(start != -1){
       start += cName.length;
       var end = cookieData.indexOf(';', start);
       if(end == -1)end = cookieData.length;
       cValue = cookieData.substring(start, end);
   }
   return unescape(cValue);
}
$("#remoCon").click(function(){	
	$("html, body").animate({scrollTop: 0}, 1000);
});

/* alert(getCookie('productId'+idx));
alert(getCookie('productName'+idx));
alert(getCookie('imagePath'+idx)); */
$(document).ready(function(){
	var str = "";4
	
	/*
	str = str + "<div><a href=/taommall/productInfo.do?productId="+getCookie('productId'+idx)+"><img width='120px' height='120px' src='/taommall/"+getCookie('imagePath'+idx)+"><br><span>"+
				getCookie('productName'+idx)+"</span></a></div>";
	*/
	for(var idx = 4;idx>=0;idx--){
		$("#a"+idx).attr("href","<%=request.getContextPath()%>/productInfo.do?productId="+getCookie('productId'+idx));
		$("#img"+idx).attr("src","<%=request.getContextPath()%>/"+getCookie('imagePath'+idx));
		$("#span"+idx).html(getCookie('productName'+idx));
	}
	
	
	
});
</script>
<body>
	<div id="header">
		<tiles:insertAttribute name="header"/>
	</div>
	
	<div id="nav">
		<tiles:insertAttribute name="nav"/>
	</div>

	<div id="aside">
		<tiles:insertAttribute name="aside"/>
	</div>
	
	<div id="section">
		<tiles:insertAttribute name="body"/>
		
	<div id="remoCon" style="border: thin solid gray;" >
     <div style="text-align: center;" ><b>오늘 본 상품</b></div>
     <div id="remote">
     <c:forEach begin="0" end="<%=(request.getCookies().length-1)/3 -1 %>" var="cnt" >
		  <div>
			  <a id="a${cnt}">
				  	<img style="width: 120px;height: 120px;" id="img${cnt}">
				  	<br>
				  	<span id="span${cnt}"></span>
			  </a>
		  </div>
     </c:forEach>
     </div>    
	</div>	 
	</div>
	
	<div id="footer">
		<tiles:insertAttribute name="footer"/>
	</div>
	
</body>
</html>


