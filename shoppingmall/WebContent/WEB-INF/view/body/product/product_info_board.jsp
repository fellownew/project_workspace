<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<style>
tbody tr td{
	text-align: center;
}


tbody div{
	overflow:auto;
	width: 1000px;
	height:150px;
	text-align: left;
}
</style>
<script type="text/javascript" src="<%=request.getContextPath() %>/script/jquery.js"></script>

<script type="text/javascript">
var boardList;

function getBoardList(){
	alert(boardList);
	return boardList;
}
<!--

//-->
$(document).ready(function(){
	
	$.ajax({
		url:"/taommall/board/selectBoardByProductId.do",
		type:"POST",
		data:{"productId":"${product.productId}"},
		dataType:"JSON",
		success:function(jdata){
			boardList = jdata;			
			$("#tbody").empty();
			for(var i = 0;i<jdata.length;i++){
				$("#tbody").append(
						$("<tr>").append($("<td>").text(i+1)).append($("</td>"))
						.append($("<td>").text(jdata[i].title)).append($("</td>"))
						.append($("<td>").text(jdata[i].buyerId)).append($("</td>")).append($("</tr>")))
						.append($("<tr id="+(i+1)+">").append($("<td colspan='3'>").append($("<div>").text(jdata[i].content)
								.append($("</div>"))).append($("</td>"))).append($("</tr>")))
									
			}
			$("#tbody tr:odd").hide();

		},
		error:function(a,b,c){
			alert(a+"-"+b+"-"+c);
		}
	});
	
	
	
	$("#registerBtn").on("click",function(){
		window.open("writeBoard.do","글쓰기",'width=500,height=500,toolbar=no,location=no,status=no,menubar=no,scrollbars=no,resizable=no,left=150,top=100');
	});
	$("#tbody").on("mouseover","tr",function(){
		$("#tbody tr").css("background-color","white");
		$(this).css("background-color","#E2B4A9");
	});
	
	$("#tbody").on("click","tr",function(){
		var idx = $(this).find(":first").text();
		var eIdx = "#"+idx;
		$("#tbody tr:odd").hide();
		$("#tbody").find(eIdx).show();
		
	});
	
	
});

function registerBoard(title,content,buyerId){
	location = "board/auth/insertBoard.do?title="+title+"&content="+content+"&productId=${product.productId}&buyerId="+buyerId;
}

</script>

<div style="width:1000px;margin: 0 auto;">
		<table border='1'  style=" width:1000px;margin: 0 auto">
				<thead>
					<tr style="text-align: center">
						<td width="100px">No.</td>
						<td width="750px">제목</td>
						<td width="150px">작성자</td>
					</tr>
				</thead>
				<tbody id="tbody">
				</tbody>
			</table>
		<c:if test="${sessionScope.user =='buyer' }">
			<button id="registerBtn">글쓰기</button>
		</c:if>	
</div>