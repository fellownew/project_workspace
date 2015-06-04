<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript">

	$(document).ready(function() {
		$("#selectList").on("change",function(){
			var url ='<%=request.getContextPath()%>/seller/auth/memberList.do?count=' + $(this).val() + '&auth=${requestScope.auth}&page=1';
			$(location).attr('href',url);
		});
		
		$("#updateAuth").on("click",function(){
			var  authId = new Array();
			var unchecked = new Array();
			  $('.auth:checked').each(function() {
			       authId.push($(this).val());
			   });
			  $('.auth').each(function() {
				  if($(this).is(":checked")==false){
			     		unchecked.push($(this).val());			  
				  }
			   });
			  
			  if(authId.length==0){
					authId.push('');
				}
				if(unchecked.length==0){
					unchecked.push('');
				}
				
				
			  jQuery.ajaxSettings.traditional = true;
			  $.ajax({
					url:"/taommall/seller/auth/updateAuth.do",
					type:"POST",
					data:{'auth':authId,'unchecked':unchecked},
					dataType:"text",
					success:function(res){
						if(res=='success'){
							alert('변경완료');
						}else{
							alert('변경실패');
						}
					}
				});	
			  
		});
		
		$("#allcheck").on("click",function(){
			if($(this).is(":checked")){
			$(".auth").prop("checked",true);
			}else{
				$(".auth").prop("checked",false);	
			}
		});
	});
</script>
	
</head>
<body>

<select id="selectList">
<option >게시글 보기</option>
<option value="5">5개</option>
<option value="10">10개</option>
<option value="15">15개</option>
<option value="20">20개</option>
</select>
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
				<a href="<%=request.getContextPath()%>/seller/auth/memberList.do?count=${requestScope.count}&auth=${requestScope.auth}&page=${pagingBean.currentPage}&check=true">판매여부</a></td>
			<tr>
		</thead>
		<tbody>
			<c:forEach items="${requestScope.member_list}" var="test" varStatus="cnt">
				<tr>
					<td>${test.sellerId}</td>
					<td>${test.name}</td>
					<td>${test.gender}</td>
					<td>${test.address}</td>
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
				<a href="<%=request.getContextPath()%>/seller/auth/memberList.do?count=${requestScope.count}&auth=${requestScope.auth}&page=${pagingBean.startPageOfPageGroup-1}">◀</a>
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
					<a href="<%=request.getContextPath()%>/seller/auth/memberList.do?count=${requestScope.count}&auth=${requestScope.auth}&page=${pageNum}">
						${pageNum}
					</a>
				</c:otherwise>
			</c:choose>
			&nbsp;&nbsp;
		</c:forEach>
		<!-- 다음 페이지 그룹 -->
		<c:choose>
			<c:when test="${pagingBean.nextPageGroup }">
				<a href="<%=request.getContextPath()%>/seller/auth/memberList.do?count=${requestScope.count}&auth=${requestScope.auth}&page=${pagingBean.endPageOfPageGroup+1}">▶</a>
			</c:when>
			<c:otherwise>
				▶
			</c:otherwise>
		</c:choose>	
		<input type="button" id="updateAuth" value="변경">
</body>
</html>