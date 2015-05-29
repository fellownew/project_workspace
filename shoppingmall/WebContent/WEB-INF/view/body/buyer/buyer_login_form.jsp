<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/buyer.css">
<title>Insert title here</title>

<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	//바이어 와 셀러의 로그인 화면 변경
	$(".login").on("click", function() {
			if ($(this).attr("id") == 'bLogin') {

				$("#slog").hide();
				$("#blog").show();
				$("#sId").val('');
				$("#sPassword").val('');

			} else if ($(this).attr("id") == 'sLogin') {
				$("#blog").hide();
				$("#slog").show();
				$("#bId").val('');
				$("#bPassword").val('');
			}

		});
	$("#sButton").on("click",function(){
		
		if($("#sId").val().trim()==''){
			$("#sIdErr").show();
			$("#sPasswordErr").hide();
			$("#sId").val('');
			$("#sId").focus();	
			return false;
		}
		if($("#sPassword").val().trim()==''){
			$("#sIdErr").hide();
			$("#sPasswordErr").show();
			$("#sPassword").val('');
			$("#sPassword").focus();
			return false;
		}
	});
	
		//셀러 로그인 처리
		$("#bButton").on("click",function(){
			alert('dd');
			$.ajax({
				url:"/taommall/buyer/buyerLogin.do",
				type:"POST",
				data:{bId:$("#bId").val(),bPassword:$("#bPassword").val()},	
				dataType:"text",
				beforeSend:function(){
	
					//바이어 로그인 처리
						if($("#bId").val().trim()==''){
							$("#bIdErr").show();
							$("#bPasswordErr").hide();
							$("#bId").val('');
							$("#bId").focus();
							return false;
						}
						if($("#bPassword").val().trim()==''){
							$("#bIdErr").hide();
							$("#bPasswordErr").show();
							$("#bPassword").val('');
							$("#bPassword").focus();
							return false;
						}
				},
				success:function(res){
					alert('성공?');
					alert(res);
					if(res=='success'){
						document.getElementById("buyerLogin").submit();
					}else{
						alert('dd');
						$("#bLoginError").show();
						return false;
					}
				}
			});
			
		});		
		
		
		
		//셀러 로그인 처리
		$("#sButton").on("click",function(){
			$.ajax({
				url:"/taommall/seller/sellerLogin.do",
				type:"POST",
				data:{sId:$("#sId").val(),sPassword:$("#sPassword").val()},	
				dataType:"text",
				beforeSend:function(){
	
					//바이어 로그인 처리
						if($("#sId").val().trim()==''){
							$("#sIdErr").show();
							$("#sPasswordErr").hide();
							$("#sId").val('');
							$("#sId").focus();
							return false;
						}
						if($("#sPassword").val().trim()==''){
							$("#sIdErr").hide();
							$("#sPasswordErr").show();
							$("#sPassword").val('');
							$("#sPassword").focus();
							return false;
						}
				},
				success:function(res){
					alert('성공?');
					alert(res);
					if(res=='success'){
						document.getElementById("sellerLogin").submit();
					}else{
						alert('dd');
						$("#sLoginError").show();
						return false;
					}
				}
			});
			
		});	
});

</script>
</head>
<body>
<div>
	<label>바이어<input type="radio" id="bLogin"  name="login" class="login" checked="checked"></label>
	<label>셀러<input type="radio" id="sLogin" name="login" class="login" ></label>
	<fieldset style="height:200px;border:none;">
	<div	 id="blog" class="loginForm">
	<form action="<%=request.getContextPath()%>/buyer/buyerInfoForm.do" class="loginForm" id="buyerLogin" method="post">
		<div>
		<input type="text" name="bId" id="bId" placeholder="아이디1" class="loginInput">
		<span id="bIdErr" class="error" style="display:none">아이디를 입력해주세요.</span>
		</div>
		<div>
		<input type="text" name="bPassword" id="bPassword" placeholder="비밀번호"class="loginInput">
		<span id="bPasswordErr" class="error" style="display:none">비밀번호를 입력해주세요.</span> 
		</div>
		<span id="bLoginError" class="error" style="display:none">아이디 또는 비밀번호를 다시 확인하세요.<br> 등록되지 않은 아이디이거나, 아이디 또는 비밀번호를 잘못 입력하셨습니다.<br></span> 
		<input type="button" id="bButton" value="전송">
	</form>
	</div>
	<div id="slog" class="loginForm" style="display:none">
	<form action="<%=request.getContextPath()%>/seller/sellerInfoForm.do" class="loginForm" id="sellerLogin" method="post">
		<div>
		<input type="text" name="sId" id="sId" placeholder="아이디2" class="loginInput">
		<span id="sIdErr" class="error" style="display:none">아이디를 입력해주세요.</span>
		</div>
		<div>
		<input type="text" name="sPassword" id="sPassword" placeholder="비밀번호"class="loginInput">
		<span id="sPasswordErr" class="error" style="display:none">비밀번호를 입력해주세요.</span> 
		</div>
			<span id="sLoginError" class="error" style="display:none">아이디 또는 비밀번호를 다시 확인하세요.<br> 등록되지 않은 아이디이거나, 아이디 또는 비밀번호를 잘못 입력하셨습니다.<br></span>
		<input type="button" id="sButton" value="전송">
	</form>
	</div>
	</fieldset>
</div>
	
</body>
</html>