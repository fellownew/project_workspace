<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<script type="text/javascript" src="${initParam.rootPath }/script/jquery.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		
		$("#test").on("click",function(){
			alert("df");
		});
	});
</script>

<body>
<button id="test">클릭</button>

<form action="/auth/product/insert.do" method="POST">
	<input type="text" value="홍길동"/>
	

</form>


</body>
