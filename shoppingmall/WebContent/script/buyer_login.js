$(document).ready(function(){
	
	$("#bPassword").keydown(function(){
		
		if(event.keyCode == 13)
	     {
	        $("#bButton").on("click",buyerLogin());
	     }
	});
	
	$("#sPassword").keydown(function(){
		if(event.keyCode == 13)
	     {
	         $("#sButton").on("click",sellerLogin());
	     }
	});
	
	
	
	//바이어 로그인 처리
		$("#bButton").on("click",buyerLogin);		
		
		//셀러 로그인 처리
		$("#sButton").on("click",sellerLogin);
		
		
		$(function () {

		    $(".tab_content").hide();
		    $(".tab_content:first").show();

		    $("ul.tabs li").click(function () {
		        $("ul.tabs li").removeClass("active").css("color", "#333");
		        //$(this).addClass("active").css({"color": "darkred","font-weight": "bolder"});
		        $(this).addClass("active").css("color", "darkred");
		        $(".tab_content").hide()
		        var activeTab = $(this).attr("rel");
		        $("#" + activeTab).fadeIn()
		    });
		});
});


function sellerLogin(){
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
					$("#sLoginError").hide();
					$("#sId").focus();
					return false;
				}
				//셀러 비밀번호 비면 에러
				if($("#sPassword").val().trim()==''){
					$("#sIdErr").hide();
					$("#sPasswordErr").show();
					$("#sPassword").val('');
					$("#sLoginError").hide();
					$("#sPassword").focus();
					return false;
				}
		},
		success:function(res){
			if(res=='auth'){
				alert('인증 처리중 입니다.고객센터로 문의하세요.');
				location='/taommall/mainPage.do';
				return false;
			}else if(res=='success'){
				document.getElementById("sellerLogin").submit();
			}else{
				$("#sIdErr").hide();
				$("#sPasswordErr").hide();
				$("#sLoginError").show();
				return false;
			}
		}
	});
	
};
function buyerLogin(){
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
							$("#bLoginError").hide();
							$("#bId").val('');
							$("#bId").focus();
							return false;
						}
						//바이어 패스워드 비면 에러
						if($("#bPassword").val().trim()==''){
							$("#bIdErr").hide();
							$("#bPasswordErr").show();
							$("#bPassword").val('');
							$("#bLoginError").hide();
							$("#bPassword").focus();
							return false;
						}
				},
				success:function(res){
					if(res=='success'){
						document.getElementById("buyerLogin").submit();
					}else{
						$("#bIdErr").hide();
						$("#bPasswordErr").hide();
						$("#bLoginError").show();
						return false;
					}
				}
			});
			
		};

