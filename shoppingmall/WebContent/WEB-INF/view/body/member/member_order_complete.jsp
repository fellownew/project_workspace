<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<hr>
order Id : ${requestScope.order.orderId }<br><br>
amount : ${requestScope.order.amount}<br><br>
status : ${requestScope.order.status}<br><br>
product : ${requestScope.order.product}<br><br>
${requestScope.order.recipient}<br><br>
${requestScope.order.seller}<br><br>
${requestScope.order.buyer}<br>
</body>
</html>