<%@ page contentType="text/html;charset=UTF-8"%>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/topmenu.css">
<script type="text/javascript" src="${initParam.rootPath }/script/jquery.js"></script>


<body>
<div id='cssmenu'>
<ul>
   <li class='active'><a href='list.do?search=allList'><span>모두보기</span></a></li>
   <li><a href='list.do?search=food'><span>농/수/축산물</span></a></li>
   <li><a href='list.do?search=fruit'><span>과일/채소</span></a></li>
   <li><a href='list.do?search=health'><span>건강식품</span></a></li>
   <li class='last'><a href='list.do?search=snack'><span>간식</span></a></li>
</ul>
</div>
</body>