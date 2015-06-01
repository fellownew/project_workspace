
var re_pw = /^[a-z0-9_-]{6,16}$/; // 비밀번호 검사식

$(document).ready(function(){
	var isPassword=false;
	var isNewPassword = false;	
	$("#passwordCancel").on("click",function(){
		$("#passwordDetail").hide();
	});
	
	$("#emailCancel").on("click",function(){
		$("#emailDetail").hide();
	});
	
	$("#phoneCancel").on("click",function(){
		$("#phoneDetail").hide();
	});
	
	$("#addressCancel").on("click",function(){
		$("#addressDetail").hide();
	});
	
	
	
	$("#passwordConfirm").on("click",function(){
		
		$.ajax({
			url:"/taommall/seller/passwordModify.do",
			type:"POST",
			data:{password:$("#newPassword").val(),currPassword:$("#currentPassword").val()},	
			dataType:"text",
			beforeSend:function(){
				 if(!isPassword){
					$("#cpasswordErr").show().html("필수 정보입니다").attr('style', "color:red");
					return false;
				}else if(!isNewPassword){
					$("#pconfirmErr").show().html("비밀번호를 확인해주세요").attr('style', "color:red");
					return false;
				}
			},
			success:function(res){
				if(res=="fail"){
					$("#cpasswordErr").show().html("비밀번호가 틀렸습니다.").attr('style', "color:red");
				}else{
					$("#currentPassword").val('');
					$("#newPasswordConfirm").val('');
					$("#newPassword").val('');
					$("#passwordDetail").hide();
					$("#notify").html("변경완료");
				}
				
			}
		});	
	});
	
	//오!! 대박!! 이렇게 쓸수 있구나 ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ

	
	$("#currentPassword").blur(function(){
		if($("#currentPassword").val().trim()==''){
			$("#cpasswordErr").show().html("필수 정보입니다").attr('style', "color:red");
			$("#currentPassword").val('');
			return false;
		}else{
			$("#cpasswordErr").hide().html("");
			isPassword=true;
		}
	});
		
	
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
				 if(re_pw.test($("#newPassword").val())){
					 isNewPassword=true;
					$("#pconfirmErr").html('').hide();
				 }else{
					 $("#passwordErr").show().html("영어/숫자 6~16자로 입력하세요").attr('style', "color:red");
					 $("#newPasswordConfirm").val('');
				 }
			}
		
	});
	
	
	
	
	//폰번호 변경
	$("#phone").blur(function(){		
		if($("#phone").val().trim()==''){
			$("#phoneErr").show().html("필수 정보입니다").attr('style', "color:red");
			$("#phone").val('');
			return false;
		}
	});
	$("#phoneConfirm").on("click",function(){
		
		$.ajax({
			url:"/taommall/seller/phoneModify.do",
			type:"POST",
			data:{phone:$("#phone").val()},	
			dataType:"text",
			beforeSend:function(){
				if($("#phone").val().trim()==''){
					$("#phoneErr").show().html("필수 정보입니다").attr('style', "color:red");
					$("#phone").val('');
					return false;
				}
			},
			success:function(res){

				$("#phone").val('');
				$("#phoneErr").html('');
				$("#phoneDetail").hide();
				$("#phoneId").html(res);
			}
		});	
	});
	
	//이메일 변경
	$("#email").blur(function(){		
		if($("#email").val().trim()==''){
			$("#emailErr").show().html("필수 정보입니다").attr('style', "color:red");
			$("#email").val('');
			return false;
		}
	});
	$("#emailConfirm").on("click",function(){
		
		$.ajax({
			url:"/taommall/seller/emailModify.do",
			type:"POST",
			data:{email:$("#email").val()},	
			dataType:"text",
			beforeSend:function(){
				if($("#email").val().trim()==''){
					$("#emailErr").show().html("필수 정보입니다").attr('style', "color:red");
					$("#email").val('');
					return false;
				}
			},
			success:function(res){
				
				$("#email").val('');
				$("#emailErr").html('');
				$("#emailDetail").hide();
				$("#emailId").html(res);
			}
		});	
	});	

	//주소 변경
	$("#address").blur(function(){		
		if($("#address").val().trim()==''){
			$("#addressErr").show().html("필수 정보입니다").attr('style', "color:red");
			$("#address").val('');
			return false;
		}
	});
	$("#addressConfirm").on("click",function(){
		
		$.ajax({
			url:"/taommall/seller/addressModify.do",
			type:"POST",
			data:{address:$("#address").val()},	
			dataType:"text",
			beforeSend:function(){
				if($("#address").val().trim()==''){
					$("#addressErr").show().html("필수 정보입니다").attr('style', "color:red");
					$("#address").val('');
					return false;
				}
			},
			success:function(res){

				
				$("#address").val('');
				$("#addressErr").html('');
				$("#addressDetail").hide();
				$("#addressId").html(res);
			}
		});	
	});

});

	function password(){
		$("#passwordDetail").show();
	};
	function email(){
		$("#emailDetail").show();
	};
	function phone(){
		$("#phoneDetail").show();
	};
	function address(){
		$("#addressDetail").show();
	};
	
	function corporateNumber(){
		$("#corporateNumberDetail").show();
	}
	