<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		char[] i = { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z' };
		request.setAttribute("list", i);%>
	<c:set var="a" value="${fn:length(list)}" />
		<c:forEach items="${list}" var="list" varStatus="status">
			<c:if test="${status==0 or status==3 or status==6 }">
				<tr>
			</c:if>
	       			<td>
						<div>
							<a href="productInfo.do?productId=${product.productId }" onmouseover='this.style.filter="alpha(opacity=20)"' onmouseout='this.style.filter=""' class="el-main_list_03"><img src="${product.imagePath }" width="320"></a>
						</div>
						<div style="padding: 5px">
							<a href="productInfo.do?productId=${product.productId }">${product.productName }</a>
						</div>
						<div style="padding-bottom: 3px">
							${product.productPrice }
						</div>			
					</td>
			<c:if test="${status==2 or status==5 or status==8 }">
				</tr>
			</c:if>
		</c:forEach>
</body>
</html>

