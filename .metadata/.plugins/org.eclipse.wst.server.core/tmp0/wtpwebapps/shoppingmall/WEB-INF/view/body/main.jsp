<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<style>
.clsBannerScreen {overflow: hidden;position: relative;height: 150px;width: 600px; border:1px solid #e1e1e1; cursor:pointer; clear:both;}
.clsBannerScreen .images {position:absolute; display:none; }
ul, li {list-style:none; margin:0; padding:0; font-size:10pt; }
.clsBannerButton {width:600px;cursor:pointer;border-bottom:1px solid #e1e1e1;}
.clsBannerButton li {width:100px;float:left;border-right:1px solid #e1e1e1;padding:2px;}
.clsBannerButton li.fir {border-left:1px solid #e1e1e1;}

.clsBannerButton li.labelOverClass {font-weight:bold;}
</style>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.banner.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$.ajax(){

	}
	
})


<!--
$(function() {
	$("#image_list_1").jQBanner({	//롤링을 할 영역의 ID 값
		nWidth:600,					//영역의 width
		nHeight:150,				//영역의 height
		nCount:5,					//돌아갈 이미지 개수
		isActType:"up",				//움직일 방향 (left, right, up, down)
		nOrderNo:1,					//초기 이미지
		nDelay:2000					//롤링 시간 타임 (1000 = 1초)
		}
	);
});
//-->
</script>

</head>
<body>
<div id="image_list_1">
<ul class="clsBannerButton" id="label_1">
	<li><img src="<%=request.getContextPath()%>/image/1on.png" onmouseover="<%=request.getContextPath()%>/image/1on.png" onmouseout="<%=request.getContextPath()%>/image/1.png" /></li>
	<li><img src="<%=request.getContextPath()%>/image/2.png" onmouseover="<%=request.getContextPath()%>/image/2.png" onmouseout="<%=request.getContextPath()%>/image/2.png" /></li>
	<li><img src="<%=request.getContextPath()%>/image/3.png" onmouseover="<%=request.getContextPath()%>/image/3.png" onmouseout="<%=request.getContextPath()%>/image/3.png" /></li>
	<li><img src="<%=request.getContextPath()%>/image/4.png" onmouseover="<%=request.getContextPath()%>/image/4.png" onmouseout="<%=request.getContextPath()%>/image/4.png" /></li>
	<li><img src="<%=request.getContextPath()%>/image/5.png" onmouseover="<%=request.getContextPath()%>/image/5.png" onmouseout="<%=request.getContextPath()%>/image/5.png" /></li>
</ul>

<div class="clsBannerScreen">
	<div class="images" style="display:block"><img src="http://cfs.tistory.com/custom/blog/68/684698/skin/images/google.jpg" /></div>
	<div class="images"><img src="http://cfs.tistory.com/custom/blog/68/684698/skin/images/daum.jpg" /></div>
	<div class="images"><img src="http://cfs.tistory.com/custom/blog/68/684698/skin/images/naver.jpg" /></div>
	<div class="images"><img src="http://cfs.tistory.com/custom/blog/68/684698/skin/images/nate.jpg" /></div>
	<div class="images"><img src="http://cfs.tistory.com/custom/blog/68/684698/skin/images/yahoo.jpg" /></div>
</div>
</div>

<div id="image_list_2">
<ul class="clsBannerButton" id="label_2">
	<li><img src="<%=request.getContextPath()%>/image/1on.png" onmouseover="<%=request.getContextPath()%>/image/1on.png" onmouseout="<%=request.getContextPath()%>/image/1.png" /></li>
	<li><img src="<%=request.getContextPath()%>/image/2.png" onmouseover="<%=request.getContextPath()%>/image/2.png" onmouseout="<%=request.getContextPath()%>/image/2.png" /></li>
	<li><img src="<%=request.getContextPath()%>/image/3.png" onmouseover="<%=request.getContextPath()%>/image/3.png" onmouseout="<%=request.getContextPath()%>/image/3.png" /></li>
	<li><img src="<%=request.getContextPath()%>/image/4.png" onmouseover="<%=request.getContextPath()%>/image/4.png" onmouseout="<%=request.getContextPath()%>/image/4.png" /></li>
	<li><img src="<%=request.getContextPath()%>/image/5.png" onmouseover="<%=request.getContextPath()%>/image/5.png" onmouseout="<%=request.getContextPath()%>/image/5.png" /></li>
	</ul>

<div class="clsBannerScreen">
	<div class="images" style="display:block"><img src="http://cfs.tistory.com/custom/blog/68/684698/skin/images/google.jpg" /></div>
	<div class="images"><img src="http://cfs.tistory.com/custom/blog/68/684698/skin/images/daum.jpg" /></div>
	<div class="images"><img src="http://cfs.tistory.com/custom/blog/68/684698/skin/images/naver.jpg" /></div>
	<div class="images"><img src="http://cfs.tistory.com/custom/blog/68/684698/skin/images/nate.jpg" /></div>
	<div class="images"><img src="http://cfs.tistory.com/custom/blog/68/684698/skin/images/yahoo.jpg" /></div>
</div>
</div>

<div id="image_list_3">
<ul class="clsBannerButton" id="label_3">
	<li><img src="<%=request.getContextPath()%>/image/1on.png" onmouseover="<%=request.getContextPath()%>/image/1on.png" onmouseout="<%=request.getContextPath()%>/image/1.png" /></li>
	<li><img src="<%=request.getContextPath()%>/image/2.png" onmouseover="<%=request.getContextPath()%>/image/2.png" onmouseout="<%=request.getContextPath()%>/image/2.png" /></li>
	<li><img src="<%=request.getContextPath()%>/image/3.png" onmouseover="<%=request.getContextPath()%>/image/3.png" onmouseout="<%=request.getContextPath()%>/image/3.png" /></li>
	<li><img src="<%=request.getContextPath()%>/image/4.png" onmouseover="<%=request.getContextPath()%>/image/4.png" onmouseout="<%=request.getContextPath()%>/image/4.png" /></li>
	<li><img src="<%=request.getContextPath()%>/image/5.png" onmouseover="<%=request.getContextPath()%>/image/5.png" onmouseout="<%=request.getContextPath()%>/image/5.png" /></li>
</ul>

<div class="clsBannerScreen">
	<div class="images" style="display:block"><img src="http://cfs.tistory.com/custom/blog/68/684698/skin/images/google.jpg" /></div>
	<div class="images"><img src="http://cfs.tistory.com/custom/blog/68/684698/skin/images/daum.jpg" /></div>
	<div class="images"><img src="http://cfs.tistory.com/custom/blog/68/684698/skin/images/naver.jpg" /></div>
	<div class="images"><img src="http://cfs.tistory.com/custom/blog/68/684698/skin/images/nate.jpg" /></div>
	<div class="images"><img src="http://cfs.tistory.com/custom/blog/68/684698/skin/images/yahoo.jpg" /></div>
</div>
</div>

<div id="image_list_4">
<ul class="clsBannerButton" id="label_4">
	<li><img src="<%=request.getContextPath()%>/image/1on.png" onmouseover="<%=request.getContextPath()%>/image/1on.png" onmouseout="<%=request.getContextPath()%>/image/1.png" /></li>
	<li><img src="<%=request.getContextPath()%>/image/2.png" onmouseover="<%=request.getContextPath()%>/image/2.png" onmouseout="<%=request.getContextPath()%>/image/2.png" /></li>
	<li><img src="<%=request.getContextPath()%>/image/3.png" onmouseover="<%=request.getContextPath()%>/image/3.png" onmouseout="<%=request.getContextPath()%>/image/3.png" /></li>
	<li><img src="<%=request.getContextPath()%>/image/4.png" onmouseover="<%=request.getContextPath()%>/image/4.png" onmouseout="<%=request.getContextPath()%>/image/4.png" /></li>
	<li><img src="<%=request.getContextPath()%>/image/5.png" onmouseover="<%=request.getContextPath()%>/image/5.png" onmouseout="<%=request.getContextPath()%>/image/5.png" /></li>
	</ul>

<div class="clsBannerScreen">
	<div class="images" style="display:block"><img src="http://cfs.tistory.com/custom/blog/68/684698/skin/images/google.jpg" /></div>
	<div class="images"><img src="http://cfs.tistory.com/custom/blog/68/684698/skin/images/daum.jpg" /></div>
	<div class="images"><img src="http://cfs.tistory.com/custom/blog/68/684698/skin/images/naver.jpg" /></div>
	<div class="images"><img src="http://cfs.tistory.com/custom/blog/68/684698/skin/images/nate.jpg" /></div>
	<div class="images"><img src="http://cfs.tistory.com/custom/blog/68/684698/skin/images/yahoo.jpg" /></div>
</div>
</div>

</body>
</html>