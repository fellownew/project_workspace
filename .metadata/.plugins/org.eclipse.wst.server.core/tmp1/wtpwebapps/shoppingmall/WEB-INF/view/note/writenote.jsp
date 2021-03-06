<%@ page contentType="text/html;charset=UTF-8"%>
<script type="text/javascript" src="<%=request.getContextPath() %>/script/jquery.js"></script>
<script type="text/javascript">
<!--

//-->

$(document).ready(function(){
	$("#cancel").on("click",function(){
		location="note.do?folder=receive";
	});
	$("#sendMessage").on("click",function(){
		var receiveId = $("#receiveId").val();
		var title = $("#title").val();
		var content = $("#content").val();
		$.ajax({
			url:"/taommall/buyer/identifyId.do",
			type:"POST",
			data:{id:$("#receiveId").val()},	
			dataType:"text",
			beforeSend:function(){
				if($("#receiveId").val().trim()==''){
					alert("보낼 아이디를 입력하세요");
					return false;
				}
			},
			success:function(res){
				var flag = false;
				if(res==''){
					flag = false;
				}else{
					flag = true;
				}
				
				if(flag){
					location="sendMessage.do?receiveId="+receiveId+"&title="+title+"&content="+content;
				}else{
					$.ajax({
						url:"/taommall/seller/identifyId.do",
						type:"POST",
						data:{id:$("#receiveId").val()},	
						dataType:"text",
						success:function(res){
							if(res==''){
								flag = false;
							}else{
								flag = true;
							}
							
							if(flag){
								location="sendMessage.do?receiveId="+receiveId+"&title="+title+"&content="+content;
							}else{
								alert("없는 아이디 입니다. 아이디를 확인해주세요");
								return false;
							}
						}
					});
					return false;
				}
			}
		});
	});
});
</script>

<div>
	<form action="sendMessage.do" method="POST">
		<div>
			<table>
				<tr>
					<td>받는사람</td>
					<td><input type="text" id="receiveId" name="receiveId"></td>
				</tr>
				<tr>
					<td>제목</td>
					<td><input type="text" id="title" name="title"></td>
				</tr>
				<tr>
					<td>내용</td>
					<td><textarea id="content" name="content" rows="10" cols="40"></textarea></td>
				</tr>		
			</table>
		</div>
		<div>
			<button id="cancel" type="button">취소</button>
			<button id="sendMessage" type="button">보내기</button>
		</div>
	</form>
</div>