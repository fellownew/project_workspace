<%@ page contentType="text/html;charset=UTF-8"%>
<style type="text/css">
#d{
	list-style: none;
	color: white;
	background-color: black;
	border: 1px solid black;
	line-height: 30px;
	vertical-align: middle;
	text-align: center;
	width: 150px;
	float: left;
}
#s{
	float: left;
	margin-top: 30px;
}

</style>
<body>
	<ul id="d" style="width: 400px"><a href="<%=request.getContextPath() %>"> Logo</a></ul>
	<form id="s" style="width: 700px" action="search.do" method="POST">
		<input type="text" name="search" autofocus="autofocus" style="width:500px;height: 30px" >
		<input type="submit" value="검색">
	</form>
	<ul id="d" style="width: 400px">banner</ul>
</body>