<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>우편함</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/sidemenu.css">
<script type="text/javascript" src="<%=request.getContextPath() %>/script/jquery.js"></script>
</head>
<body>
	<div id="noteWrap">
		<div id="cssmenu" style="float:left" >
			<ul>
			   <li><a href='note.do?folder=write'><span>쪽지 보내기</span></a></li>
			   <li><a href='<%=request.getContextPath() %>/auth/receiveNoteList.do'><span>받은 쪽지함</span></a></li>
			   <li><a href='<%=request.getContextPath() %>/auth/sendNoteList.do'><span>보낸 쪽지함</span></a></li>
			   <li class='last'><a href='<%=request.getContextPath() %>/auth/storeNoteList.do'><span>보관 쪽지함</span></a></li>
			</ul>
		</div>
		<div id="noteMain" style="float: left">
			<c:choose>
				<c:when test="${param.folder == 'view' }">
					<jsp:include page="viewnote.jsp"></jsp:include>
				</c:when>
				<c:when test="${param.folder == 'write' }">
					<jsp:include page="writenote.jsp"></jsp:include>
				</c:when>
				<c:otherwise>
					<jsp:include page="noteList.jsp"></jsp:include>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
</body>
</html>