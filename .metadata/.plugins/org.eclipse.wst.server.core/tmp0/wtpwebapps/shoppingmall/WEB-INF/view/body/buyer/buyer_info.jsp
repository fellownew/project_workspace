<%@page import="kr.co.taommall.account.vo.Buyer"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css" >
.tbl_model .thcell{
	
	padding:10px 10px 10px
}
.tbl_model .tdcell{
	/*위, 오른쪽, 아래, 왼쪽 */
	padding:10px 0px 10px 20px
}
.tbl_model tr{
	border-top:1px solid #e5e5e5;
	border-bottom:1px solid #e5e5e5;
}
.tbl_model th{
	background-color:#f7f7f7;
	border-right:1px solid #e5e5e5;
}
.tbl_model .contxt_tit{
	font-size:14px;
	line-height:16px;
	color:#333
}
.tbl_model{

	position:relative;
	width:100%;
	border:0;
	border-bottom:1px solid #e5e5e5;
	border-spacing:0;
	border-collapse:collapse;
	table-layout:fixed;
	word-break:keep-all;
	word-wrap:break-word
}
.btn_model .btn2{
	border:1px solid #bfbfbf;
	background:#fff
} 
.tbl_model .btn_area_btm{
	overflow:hidden;
	margin-left:-8px;
	padding-top:27px;
	text-align:left
}
.tbl_model .btn_area_btm a{
	float:left;
	margin-left:8px;
	color:black;
	text-decoration:none
}
.word_br{
	display:inline-block
}
.error {
	margin: 3px 0 3px 1px;
	font-size: 12px;
	color: #f00
}
</style>
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript">

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
			url:"/taommall/buyer/passwordModify.do",
			type:"POST",
			data:{password:$("#newPassword").val()},	
			dataType:"text",
			beforeSend:function(){
				if(isPassword && isNewPassword){
					
				}else if(!isPassword){
					$("#cpasswordErr").show().html("필수 정보입니다").attr('style', "color:red");
					return false;
				}else{
					$("#pconfirmErr").show().html("비밀번호를 확인해주세요").attr('style', "color:red");
					return false;
				}
			},
			success:function(res){
				$("#currentPassword").val('');
				$("#newPasswordConfirm").val('');
				$("#newPassword").val('');
				$("#passwordDetail").hide();
				$("#notify").html("변경완료");
			}
		});	
	});
	
	//오!! 대박!! 이렇게 쓸수 있구나 ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
	<c:set var="message" value="${sessionScope.loginInfo.password}"/> 
	var pword = '<c:out value="${message}"/>';
	
	$("#currentPassword").blur(function(){
		if($("#currentPassword").val().trim()==''){
			$("#cpasswordErr").show().html("필수 정보입니다").attr('style', "color:red");
			$("#currentPassword").val('');
			return false;
		}
		if(pword==$("#currentPassword").val()){
			$("#cpasswordErr").hide();
			isPassword=true;
		}else{
			//비밀번호가 틀렸습니다.
			isPassword=false;
			$("#cpasswordErr").show();
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
			url:"/taommall/buyer/phoneModify.do",
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
				
			
				<c:set var="message" value="${sessionScope.loginInfo.phone}"/> 
				var phoneNum = '<c:out value="${message}"/>';
				
				$("#phone").val('');
				$("#phoneErr").html('');
				$("#phoneDetail").hide();
				$("#phoneId").html(phoneNum);
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
			url:"/taommall/buyer/emailModify.do",
			type:"POST",
			data:{phone:$("#email").val()},	
			dataType:"text",
			beforeSend:function(){
				if($("#email").val().trim()==''){
					$("#emailErr").show().html("필수 정보입니다").attr('style', "color:red");
					$("#email").val('');
					return false;
				}
			},
			success:function(res){
				
			
				<c:set var="message" value="${sessionScope.loginInfo.phone}"/> 
				var phoneNum = '<c:out value="${message}"/>';
				
				$("#email").val('');
				$("#emailErr").html('');
				$("#emailDetail").hide();
				$("#emailId").html(phoneNum);
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
			url:"/taommall/buyer/addressModify.do",
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
				
			
				<c:set var="message" value="${sessionScope.loginInfo.phone}"/> 
				var phoneNum = '<c:out value="${message}"/>';
				
				$("#address").val('');
				$("#addressErr").html('');
				$("#addressDetail").hide();
				$("#addressId").html(phoneNum);
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

</script>
<script type="text/javascript">

</script>
</head>
<body>
바이어 정보<br>
${sessionScope.loginInfo.name}<br>
${sessionScope.loginInfo.address}<br>
${sessionScope.loginInfo.email}<br>
${sessionScope.loginInfo.phone}<br>
<hr>

		<fieldset style="border:none; width:70%">
				<table border="0" class="tbl_model">
				<colgroup>
				<col style="width:22%"><col>
				</colgroup>
				<tbody>
				<tr>
					<th scope="row">
						<div class="thcell">
						     	  사용자 이름
						     </div>
					</th>
					<td>
						<div class="tdcell">
							<p class="contxt_tit">${sessionScope.loginInfo.name}</p>
						</div>
					</td>
				</tr>
				<tr>
					<th scope="row">
						<div class="thcell">
						     	 비밀번호
						     </div>
					</th>
					<td>
						<div class="tdcell">
							<p id="password" class="contxt_tit">
								<% int length =((Buyer)session.getAttribute("loginInfo")).getPassword().length();%>
							 	<c:forEach begin="1" end="<%=length%>">*</c:forEach>
							 	<span id="notify"> </span>
							</p>
									<p class="btn_area_btm">
										<a href="javascript:password()" class="btn_model"><b>비밀번호 변경</b></a>
									</p>
								<div id="passwordDetail" style="display:none;">
								<div>
									<input type="password" id="currentPassword" placeholder="현재 비밀번호">
									<span id="cpasswordErr" class="error" style="display: none">비밀번호가 틀렸습니다.</span>		
								</div>
								<div>
									<input type="password" id="newPassword" placeholder="새 비밀번호">
									<span id="passwordErr" class="error" style="display: none">비밀번호가 틀렸습니다.</span>
								</div>
								<div>
									<input type="password" id="newPasswordConfirm" placeholder="새 비밀번호 확인">
									<span id="pconfirmErr" class="error" style="display: none">비밀번호가 틀렸습니다.</span>
								</div>
								<p>
								<button id="passwordConfirm">수정</button>
								<button id="passwordCancel">수정취소</button>
								</p>
								</div>
									
							
						</div>
					</td>	
				</tr>
				<tr>
					<th scope="row">
						<div class="thcell">
						     	  휴대전화
						     </div>
					</th>
					<td>
						<div class="tdcell">
							<p id="phoneId" class="contxt_tit">${sessionScope.loginInfo.phone}</p>
									<p class="btn_area_btm">
										<a href="javascript:phone()" class="btn_model"><b>휴대전화 변경</b></a>
									</p>
						<div id="phoneDetail" style="display:none;">
								<div>
									<input type="text" id="phone" placeholder="${sessionScope.loginInfo.phone}">
									<span id="phoneErr" class="error" style="display: none">필수입력 사항입니다.</span>		
								</div>

								<p>
								<button id="phoneConfirm">수정</button>
								<button id="phoneCancel">수정취소</button>
								</p>
						</div>
								
						</div>
					</td>
				</tr>
				<tr>
					<th scope="row">
						<div class="thcell">
						     	  이메일
						     </div>
					</th>
					<td>
						<div class="tdcell">
							<p id="emailId" class="contxt_tit">${sessionScope.loginInfo.email}</p>
									<p class="btn_area_btm">
										<a id="emailBtn" href="javascript:email()" class="btn_model"><b>이메일 변경</b></a>
									</p>
							<div id="emailDetail" style="display:none;">
								<div>
									<input type="text" id="email" placeholder="${sessionScope.loginInfo.email}">
									<span id="emailErr" class="error" style="display: none">필수입력 사항입니다.</span>		
								</div>

								<p>
								<button id="emailConfirm">수정</button>
								<button id="emailCancel">수정취소</button>
								</p>
						</div>
						</div>
					</td>
				</tr>
				<tr>
					<th scope="row">
						<div class="thcell">
						     	  주소
						     </div>
					</th>
					<td>
						<div class="tdcell">
							<p id="addressId" class="contxt_tit">${sessionScope.loginInfo.address}</p>
									<p class="btn_area_btm">
										<a href="javascript:address()" class="btn_model"><b>주소 변경</b></a>
									</p>
						<div id="addressDetail" style="display:none;">
								<div>
									<input type="text" id="address" placeholder="${sessionScope.loginInfo.address}">
									<span id="addressErr" class="error" style="display: none">필수입력 사항입니다.</span>		
								</div>

								<p>
								<button id="addressConfirm">수정</button>
								<button id="addressCancel">수정취소</button>
								</p>
						</div>
						</div>
					</td>
				</tr>
				</tbody>
				</table>
				
		</fieldset>		
</body>
</html>