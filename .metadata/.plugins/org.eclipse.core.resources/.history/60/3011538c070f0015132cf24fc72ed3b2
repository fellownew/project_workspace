<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<script type="text/javascript" src="<%=request.getContextPath() %>/script/jquery.js"></script>
<script type="text/javascript">
<!--

//-->

$(document).ready(function(){
	$("#delete").on("click",function(){
		
	});
	$("#store").on("click",function(){
		var mulpara = [];
        $("input[name='check']:checked").each(function(i) {
        	mulpara.push($(this).val());
        });
       
        $.post("storeNote.do",mulpara);
        
	});
	
	$("#allCheck").on('click',function(){
        var thisChecked = $(this).is(':checked');
        if(thisChecked==true){
            $('input:checkbox[name=check]').prop('checked',true).trigger("change");
        }else{
            $('input:checkbox[name=check]').prop('checked',false).trigger("change");
        }
    });
});

function viewNote(no){
	location = "viewNote.do?noteNo="+no;
}


</script>
<div id="noteList">
	<%-- 제목 --%>
	<button id="delete">삭제</button>
	<c:if test="${param.folder !='store' }">
		<button id="store">보관</button>
	</c:if>
	<div>
		<%--테이블 --%>
		<table style="width:450px;margin: 0 auto;text-align: center;border:1px;border-collapse:collapse;">
			<thead style="background-color: #FAFAFA">
				<tr style="height:40px;border-bottom-style: solid;">
					<td><input type="checkbox" id="allCheck"></td>
					<td style="width:280px">제목</td>
					<c:if test="${param.folder=='receive' or param.folder=='store' }">
						<td style="width:80px">보낸사람</td>
						</c:if>
					<c:if test="${param.folder=='send' }">
						<td style="width:80px">받는사람</td>
					</c:if>
					<td style="width:80px">날짜</td>
				</tr>
			</thead>
			<tbody id="tbody">
				<c:forEach items="${requestScope.noteList }" var="note">
					<tr>
						<td><input type="checkbox" id="check" name="check" class="class" value="${note.noteNo }"></td>
						<td style="text-align: left;text-indent: 3px;" onclick="viewNote(${note.noteNo })">
						<c:if test="${note.read != true}"> <font style="font-weight: bold; "> </c:if>
						${note.title}
						<c:if test="${note.read != true}"> </font> </c:if>
						</td>
						
						<c:if test="${param.folder=='receive' or param.folder=='store' }">
							<td style="text-align: right; ">${note.sendId}</td>
						</c:if>
						<c:if test="${param.folder=='send' }">
							<td style="text-align: right; ">${note.receiveId}</td>
						</c:if>
						<td>${note.sendDate}</td>
					</tr> 
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div style="text-align: center;">
		<c:choose>
			<c:when test="${pagingBean.previousPageGroup }">
				<a href="<%=request.getContextPath()%>/list.do?page=${pagingBean.startPageOfPageGroup-1}&search=${requestScope.search }">◀</a>
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
					<a href="<%=request.getContextPath()%>/list.do?page=${pageNum}&search=${requestScope.search }">
						${pageNum}
					</a>
				</c:otherwise>
			</c:choose>
			&nbsp;&nbsp;
		</c:forEach>
		<!-- 다음 페이지 그룹 -->
		<c:choose>
			<c:when test="${pagingBean.nextPageGroup }">
				<a href="<%=request.getContextPath()%>/list.do?page=${pagingBean.endPageOfPageGroup+1}&search=${requestScope.search }">▶</a>
			</c:when>
			<c:otherwise>
				▶
			</c:otherwise>
		</c:choose>	
	</div>
</div>