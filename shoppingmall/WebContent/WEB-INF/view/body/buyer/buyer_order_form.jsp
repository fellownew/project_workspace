<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
 <script type="text/javascript"> 
 
 $(document).ready(function(){
	 
	list = '${param.cart_list}';
	var varList = list.split(",");
	var list = new Array();
	for(var idx =0;idx<varList.length;idx++){
		list.push(varList[idx]);
	}
 
 });


 </script>
<script type="text/javascript">

</script>
</head>
<body>

</body>
</html>