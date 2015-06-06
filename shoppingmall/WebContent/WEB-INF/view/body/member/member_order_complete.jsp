<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	
<c:forEach items="${requestScope.list}" var="list">
order Id : ${list.orderId }<br><br>
product Id : ${list.productId }<br><br>
buyerId :  ${list.buyerId }<br><br>
sellerId :  ${list.sellerId }<br><br>
recipientId : ${list.recipientId }<br><br>
buyer : ${list.buyer}<br><br>
product : ${list.product}<br><br>
seller : ${list.seller}<br><br>
recipient: ${list.recipient}<br><br>
<hr>
</c:forEach>
</body>
</html>