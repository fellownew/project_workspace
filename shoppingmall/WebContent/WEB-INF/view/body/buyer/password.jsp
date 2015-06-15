<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript">
var re_pw = /^[a-z0-9_-]{6,16}$/; // 비밀번호 검사식
$(document).ready(function(){
	isNewPassword =false;
	passwordOk = false;
$("#passwordConfirm").on("click",function(){
	if(isNewPassword && passwordOk){
		document.getElementById("passwordForm").submit();
	}else{
		alert('비밀번호를 확인해주세요');
		return false;
	}
});


var passwordOk=false;
//비밀번호
$("#newPassword").blur(function(){		
	if($("#newPassword").val().trim()==''){
		$("#passwordErr").show().html("필수 정보입니다").attr('style', "color:red");
		$("#password").val('');
		return false;
	}
	
	 if(!re_pw.test($("#newPassword").val())){
		 $("#passwordErr").show().html("영어/숫자 6~16자로 입력하세요").attr('style', "color:red");
		 return false;
	}else{
		passwordOk=true;
		$("#passwordErr").html('').hide();
	}
});



	//비밀번호 확인
	$("#newPasswordConfirm").blur(function(){			
		
		if($("#newPasswordConfirm").val().trim()==''){
			
			$("#pconfirmErr").show().html("필수 정보입니다").attr('style', "color:red");
			$("#newPasswordConfirm").val('');
			return false;
		}
		
		 if($("#newPassword").val()!=$("#newPasswordConfirm").val()){
			 $("#pconfirmErr").show().html("비밀번호가 일치하지 않습니다.").attr('style', "color:red");
			 $("#newPasswordConfirm").val('');
			 return false;
			}else{
				 if(passwordOk && re_pw.test($("#newPassword").val())){
					 isNewPassword=true;
					$("#pconfirmErr").html('').hide();
				 }else if(!re_pw.test($("#newPassword").val())){
					 $("#passwordErr").show().html("영어/숫자 6~16자로 입력하세요").attr('style', "color:red");
					 $("#newPasswordConfirm").val('');
				 }else{
					 $("#passwordErr").show().html("비밀번호를 확인해주세요.").attr('style', "color:red");
					 $("#newPasswordConfirm").val('');
				 }
			}
		
	});
});
</script>
</head>
<body>
<form id="passwordForm" action="<%=request.getContextPath()%>/buyer/passwordCheck.do" method="post">
	<input type="text" id="id" name="id" value="${param.id}" readonly="readonly" >
	<div>
		<input type="password" id="newPassword" name="newPassword" placeholder="새 비밀번호">
		<span id="passwordErr" class="error" style="display: none">비밀번호가
			틀렸습니다.</span>
	</div>
	<div>
		<input type="password" id="newPasswordConfirm" placeholder="새 비밀번호 확인">
		<span id="pconfirmErr" class="error" style="display: none">비밀번호가
			틀렸습니다.</span>
	</div>
	<p>
		<button id="passwordConfirm">변경</button>
</form>
</body>
</html>