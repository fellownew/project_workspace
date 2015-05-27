<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${initParam.rootPath }/script/jquery.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		
		$("#test").on("click",function(){
			alert("df");
		});

	});
</script>
</head>
<body>
<button id="test">클릭</button>
</body>
</html>