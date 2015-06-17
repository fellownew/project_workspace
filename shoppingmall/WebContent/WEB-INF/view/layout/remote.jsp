<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style type="text/css">
#remoCon {
	position: fixed;
	width: 100px;
	height: auto;
	right: 3%;
	top: 138px;
	border: thin solid gray;
	background-color : white;
 } 
</style>

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

$(document).ready(function(){
	var str = "";
	
	for(var idx = 4;idx>=0;idx--){
		$("#a"+idx).attr("href","<%=request.getContextPath()%>/productInfo.do?productId="+getCookie('productId'+idx));
		$("#img"+idx).attr("src","<%=request.getContextPath()%>/"+getCookie('imagePath'+idx));
		$("#span"+idx).html(getCookie('productName'+idx));
	}
	$("#top").on("click",function(){
		$(document.body).animate({ scrollTop: 0 }); //animation효과로 scollTop=0으로 이동
	})
	
	
	
});
</script>
<div id="remoCon">
	<div style="text-align: center;">
		<b><font size="2px">오늘 본 상품</font></b>
	</div>
	<div id="remote">
	<c:if test="<%=request.getCookies() !=null%>">
			<div id="remote" style="text-align: center;">
				<c:forEach begin="1" end="<%=request.getCookies().length/3 %>" var="cnt">
					<div style="border-bottom: 1px solid gray;">
						<a id="a${cnt-1}" style="color: gray; text-decoration: none; "> 
						<img style="width: 80px; height: 80px; margin-top: 2px;" id="img${cnt-1}"/><br> 
						<span  style="font-size:8px; line-height: 0px;" id="span${cnt-1}"></span>
						</a>
					</div>
				</c:forEach>
			</div>
	</c:if>
	</div>
	<div style="text-align: center"><a id="top">top</a></div>
</div>