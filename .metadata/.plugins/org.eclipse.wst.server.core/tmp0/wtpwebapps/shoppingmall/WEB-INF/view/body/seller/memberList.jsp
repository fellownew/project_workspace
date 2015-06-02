<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#allcheck").on("click",function(){
			if($(this).is(":checked")){
			$(".auth").prop("checked",true);				
			}else{
				$(".auth").prop("checked",false);	
			}
		});
		alert('sss');
		$("#updateAuth").on("click","input",function(){
			alert('ssws');
			  $('.auth:checked').each(function() { 
			        alert($(this).val());
			   });
		});
		 
		
		
	});
	

	
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<td>셀러ID</td>
				<td>셀러이름</td>
				<td>성별</td>
				<td>주소</td>
				<td>이메일</td>
				<td>핸드폰번호</td>
				<td>사업자번호</td>
				<td><input type="checkbox" id="allcheck" >
				<a href="<%=request.getContextPath()%>/seller/memberListPaging.do?auth=${requestScope.auth}&page=${pagingBean.currentPage}&check=true">판매여부</a></td>
			<tr>
		</thead>
		<tbody>
			<c:forEach items="${requestScope.member_list}" var="test" varStatus="cnt">
				<tr>
					<td>${test.sellerId}</td>
					<td>${test.name}</td>
					<td>${test.gender}</td>
					<td>${test.gender}</td>
					<td>${test.email}</td>
					<td>${test.phone}</td>
					<td>${test.corporateNumber}</td>
					<td><input type="checkbox" name='auth' class="auth" value='${test.sellerId}' id="${cnt.count}"></td>
				</tr>
				
			<c:choose>
				<c:when test="${test.auth == 'true'}">			
					<script type="text/javascript">
						$("#${cnt.count}").prop("checked", true);
					</script>
				</c:when>
				<c:when test="${test.auth == 'false'}">
					<script type="text/javascript">
					$("#${cnt.count}").prop("checked", false);
					</script>
				</c:when>
			</c:choose>	
			</c:forEach>
		</tbody>
	</table>
				<!-- 페이징 처리 -->
		<!-- 이전 페이지 그룹 -->
		<c:choose>
			<c:when test="${pagingBean.previousPageGroup }">
				<a href="<%=request.getContextPath()%>/seller/memberListPaging.do?auth=${requestScope.auth}&page=${pagingBean.startPageOfPageGroup-1}">◀</a>
			</c:when>
			<c:otherwise>
				◀
			</c:otherwise>
		</c:choose>	
		<!-- 페이지 번호 -->
		<c:forEach begin="${pagingBean.startPageOfPageGroup }" end="${pagingBean.endPageOfPageGroup}" var="pageNum">
			<c:choose>
				<c:when test="${pageNum == pagingBean.currentPage }">
					<b>[${pageNum}]</b>
				</c:when>
				<c:otherwise>
					<a href="<%=request.getContextPath()%>/seller/memberListPaging.do?auth=${requestScope.auth}&page=${pageNum}">
						${pageNum}
					</a>
				</c:otherwise>
			</c:choose>
			&nbsp;&nbsp;
		</c:forEach>
		<!-- 다음 페이지 그룹 -->
		<c:choose>
			<c:when test="${pagingBean.nextPageGroup }">
				<a href="<%=request.getContextPath()%>/seller/memberListPaging.do?auth=${requestScope.auth}&page=${pagingBean.endPageOfPageGroup+1}">▶</a>
			</c:when>
			<c:otherwise>
				▶
			</c:otherwise>
		</c:choose>	
		<button id="updateAuth" >변경</button>
</body>
</html>