<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">

</style>
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript">
var regex = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/;
var idCheck = false;
$(document).ready(function(){
	$("#next").on("click",function(){
		if(codeCheck){
			location = "/taommall/seller/idConfirm.do?id="+$("#sellerId").val()+"&email="+$("#email").val();
		}
	});
	$("#sellerId").blur(function(){						
		if($("#sellerId").val().trim()==''){					
			$("#idErr").show().html("필수 정보입니다").attr('style', "color:red");
			$("#sellerId").val('');
			return false;
		}
	});
	//이메일
	$("#email").keydown(function(){
		$("#emailErr").hide();
	});
	
	$("#email").blur(function(){
		
		
		if(regex.test($("#email").val()) === false) {
			$("#emailErr").show().html("email 형식에 맞게 입력하세요.").attr('style', "color:red");
			 return false;
		}
		if($("#email").val().trim()==''){
			$("#emailErr").show().html("필수 정보입니다").attr('style', "color:red");
			$("#email").val('');
			return false;
		}else{
			$("#emailErr").html('').hide();
		}
	});
	
	
	//인증번호
	$("#code").keydown(function(){
		$("#codeErr").hide();
	});
	$("#code").blur(function(){		
		if($("#code").val().trim()==''){
			$("#codeErr").show().html("필수 정보입니다").attr('style', "color:red");
			$("#code").val('');
			return false;
		}else{
			$("#codeErr").html('').hide();
		}
	});
	
	
	
	//인증번호 전송
	$("#emailBtn").on("click",function(){
		$.ajax({
			url:"/taommall/seller/identifyEmail.do",
			type:"POST",
			data:{"email":$("#email").val()},
			dataType:"text",
			beforeSend:function(){
				if($("#email").val().trim()==''){
					$("#emailErr").html('email을 다시확인해 주세요.').attr('style', "color:red");
					return false;
				}
				$("#emailErr").html('인증번호가 발송되었습니다.').attr('style', "color:blue");
			},
			success:function(res){
				if(res.trim()!='' ){
					msg = res;
				}else{
					$("#emailErr").html('이메일을 확인해주세요.').attr('style', "color:red");
				}
				
			},
			error:function(a,s,b){
				alert(a+":"+s+":"+b);
			}
		});
	});
	
	//인증번호 확인
	$("#codeBtn").on("click",function(){
		if(msg == $("#code").val()){
			codeCheck = true;
			$("#codeErr").html('인증이 성공했습니다.').attr('style', "color:blue");
			
			if(idCheck && codeCheck && passwordCheck){
				$("#joinErr").hide().html('');
			}
		}else{
			$("#codeErr").html('인증번호를 다시 확인해주세요').attr('style', "color:red");
		}
	});	

});
</script>
</head>
<body>
<div>
<input class="int" id="sellerId" name="sellerId" type="text" placeholder="이름">
<div id="idErr" class="error" style="display:none">필수 정보입니다.</div>
</div>
<div>
<input id="email" type="text" placeholder="이메일 입력"><button id="emailBtn" >인증번호 받기</button>
<div id="emailErr" class="error" style="display: none">필수 정보입니다.</div>
<div>
<input type="text" id="code" name="code" maxlength="12"
					placeholder="인증번호" class="int2">
					<button type="button" id="codeBtn">확인</button>
					<div id="codeErr" class="error" style="display: none">인증이
						필요합니다.</div>
</div>
<div><button id="next">다음</button></div>
</div>
</body>
</html>