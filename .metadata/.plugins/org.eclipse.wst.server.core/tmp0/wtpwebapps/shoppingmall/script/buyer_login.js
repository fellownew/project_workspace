$(document).ready(function(){
	//바이어 와 셀러의 로그인 화면 변경
	$(".login").on("click", function() {
			//바이어
			if ($(this).attr("id") == 'bLogin') {

				$("#slog").hide();
				$("#blog").show();
				$("#sId").val('');
				$("#sPassword").val('');
			//셀러
			} else if ($(this).attr("id") == 'sLogin') {
				$("#blog").hide();
				$("#slog").show();
				$("#bId").val('');
				$("#bPassword").val('');
			}

		});

	
		//바이어 로그인 처리
		$("#bButton").on("click",function(){
			alert('dd');
			$.ajax({
				url:"/taommall/buyer/buyerLogin.do",
				type:"POST",
				data:{bId:$("#bId").val(),bPassword:$("#bPassword").val()},	
				dataType:"text",
				beforeSend:function(){
	
						//바이어 아이디 비면 에러
						if($("#bId").val().trim()==''){
							$("#bIdErr").show();
							$("#bPasswordErr").hide();
							$("#bId").val('');
							$("#bId").focus();
							return false;
						}
						//바이어 패스워드 비면 에러
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
	
						//셀러 아이디 비면에러
						if($("#sId").val().trim()==''){
							$("#sIdErr").show();
							$("#sPasswordErr").hide();
							$("#sId").val('');
							$("#sId").focus();
							return false;
						}
						//셀러 비밀번호 비면 에러
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