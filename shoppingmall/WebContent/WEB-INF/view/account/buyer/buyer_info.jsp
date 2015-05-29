<%@ page contentType="text/html; charset=UTF-8"%>
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
</style>
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript">

$(document).ready(function(){
	
	$("#passwordCancel").on("click",function(){
		$("#passwordDetail").hide();
	});
	
	$("#passwordConfirm").on("click",function(){
		$("#password").html("asdasd");
	});

});
	function password(){
		$("#passwordDetail").show();
	};
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
							<p id="password" class="contxt_tit">${sessionScope.loginInfo.password}</p>
									<p class="btn_area_btm">
										<a href="javascript:password()" class="btn_model"><b>비밀번호 변경</b></a>
									</p>
							<div id="passwordDetail" style="display:none;">이것은 디테일
								<button id="passwordConfirm">수정</button>
								<button id="passwordCancel">수정취소</button>
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
							<p class="contxt_tit">${sessionScope.loginInfo.phone}</p>
									<p class="btn_area_btm">
										<a href="" class="btn_model"><b>휴대전화 변경</b></a>
									</p>
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
							<p class="contxt_tit">${sessionScope.loginInfo.email}</p>
									<p class="btn_area_btm">
										<a id="passwordBtn" href="" class="btn_model"><b>이메일 변경</b></a>
									</p>
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
							<p class="contxt_tit">${sessionScope.loginInfo.address}</p>
									<p class="btn_area_btm">
										<a href="" class="btn_model"><b>주소 변경</b></a>
									</p>
						</div>
					</td>
				</tr>
				</tbody>
				</table>
				
		</fieldset>		
</body>
</html>