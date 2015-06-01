
var re_id = /^[a-z0-9_-]{6,12}$/; // 아이디 검사식
var re_pw = /^[a-z0-9_-]{6,16}$/; // 비밀번호 검사식
var regex = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/;
var reg_phone = /^(01[016789]{1}|02|0[3-9]{1}[0-9]{1})-?[0-9]{3,4}-?[0-9]{4}$/;
var msg;
var idCheck;
var passwordCheck;
var codeCheck;
	$(document).ready(function() {
		$("#join").on("click", function() {
			if($("#buyerId").val().trim()=='' ||
					$("#password").val().trim()=='' ||
					$("#passwordConfirm").val().trim()=='' ||
					$("#name").val().trim()=='' ||
					$("#address").val().trim()=='' ||
					$("#phone").val().trim()=='' ||
					$("#email").val().trim()=='' ||
					$("#code").val().trim()==''){
				$(".error").show();
				return false;
			}else{	
				if(idCheck && codeCheck && passwordCheck){
				document.getElementById("buyer_form").submit();
				}else if(!codeCheck){
					$("#joinErr").show().html("인증번호를 확인해주세요.").attr('style', "color:red");
					return false;
				}else{
					$("#joinErr").show().html("입력하신 정보를 확인해주세요.").attr('style', "color:red");
					return false;
				}
			
			}


		});
		
		//아이디
		$("#buyerId").blur(function(){
			$.ajax({
				url:"/taommall/buyer/identifyId.do",
				type:"POST",
				data:{id:$("#buyerId").val()},	
				dataType:"text",
				beforeSend:function(){
					if($("#buyerId").val().trim()==''){
						
						$("#idErr").show().html("필수 정보입니다").attr('style', "color:red");
						$("#buyerId").val('');
						return false;
					}
					
					 if(!re_id.test($("#buyerId").val())){
						 $("#idErr").show().html("영어/숫자 6~12자로 입력하세요").attr('style', "color:red");
						 return false;
						}
				
				},
				success:function(res){
					if(res==''){
						idCheck=true;
						$("#idErr").show().html("멋진 아이디네요!").attr('style', "color:blue");
					}else{
						$("#idErr").show().html("이미 사용중인 아이디입니다").attr('style', "color:red");
					}
				}
			});
		});
		
		//비밀번호
		$("#password").focus(function(){
			$("#passwordErr").hide();
		});
		$("#password").blur(function(){		
			if($("#password").val().trim()==''){
				$("#passwordErr").show().html("필수 정보입니다").attr('style', "color:red");
				$("#password").val('');
				return false;
			}
			
			 if(!re_pw.test($("#password").val())){
				 $("#passwordErr").show().html("영어/숫자 6~16자로 입력하세요").attr('style', "color:red");
				 return false;
			}else{
				$("#passwordErr").html('').hide();
			}
		});
		
		
		
		//비밀번호 확인
		$("#passwordConfirm").blur(function(){			
			
			if($("#passwordConfirm").val().trim()==''){
				
				$("#pconfirmErr").show().html("필수 정보입니다").attr('style', "color:red");
				$("#passwordConfirm").val('');
				return false;
			}
			
			 if($("#password").val()!=$("#passwordConfirm").val()){
				 $("#pconfirmErr").show().html("비밀번호가 일치하지 않습니다.").attr('style', "color:red");
				 $("#passwordConfirm").val('');
				 return false;
				}else{
					passwordCheck=true;
					$("#pconfirmErr").html('').hide();
				}
			
		});
		
		
		//이름
		$("#name").keydown(function(){
			$("#nameErr").hide();
		});
		$("#name").blur(function(){		
			if($("#name").val().trim()==''){
				$("#nameErr").show().html("필수 정보입니다").attr('style', "color:red");
				$("#name").val('');
				return false;
			}else{
				$("#nameErr").html('').hide();
			}
	
		});
		
		
		//주소
		$("#address").keydown(function(){
			$("#addressErr").hide();
		});
		$("#address").blur(function(){		
			if($("#address").val().trim()==''){
				$("#addressErr").show().html("필수 정보입니다").attr('style', "color:red");
				$("#address").val('');
				return false;
			}else{
				$("#addressErr").html('').hide();
			}
		});
		
		//핸드폰
		$("#phone").keydown(function(){
			$("#phoneErr").hide();
		});
		$("#phone").blur(function(){	
			
			if(reg_phone.test($("#phone").val())===false){
				$("#phoneErr").show().html("형식에 맞게 입력하세요.").attr('style', "color:red");
				return false;
			}
			if($("#phone").val().trim()==''){
				$("#phoneErr").show().html("필수 정보입니다").attr('style', "color:red");
				$("#phone").val('');
				return false;
			}else{
				$("#phoneErr").html('').hide();
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
				url:"/taommall/buyer/identifyEmail.do",
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
					msg = res;
					
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
		})
		
		
		
	});