<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/address.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/seller.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript" src="http://dmaps.daum.net/map_js_init/postcode.v2.js" ></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/address.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/seller_join.js" ></script>
<div>
	<h2 style="text-align: center">셀러 회원가입</h2>
	<form id="seller_form" action="<%=request.getContextPath()%>/seller/sellerJoin.do" method="post" style="margin-bottom: 20px">
		<table>
			<tr>
				<td><input type="text" id="sellerId" name="sellerId"
					maxlength="12" placeholder="아이디" class="int">
					<div id="idErr" class="error"  style="display: none">필수 정보입니다.</div></td>
			</tr>
			<tr>
				<td><input type="password" id="password" name="password"
					maxlength="16" placeholder="비밀번호" class="int">
					<div id="passwordErr" class="error" style="display: none">필수 정보입니다.</div></td>
			</tr>
			<tr>
				<td><input type="password" id="passwordConfirm"
					name="passwordConfirm" maxlength="16" placeholder="비밀번호 재확인"
					class="int">
					<div id="pconfirmErr" class="error"  style="display: none">필수 정보입니다.</div></td>
			</tr>
		</table>
		<br>
		<table>
			<tr>
				<td><input type="text" id="name" name="name" maxlength="12"
					placeholder="이름" class="int">
					<div id="nameErr" class="error"  style="display: none">필수 정보입니다.</div></td>
			</tr>
			<tr style="text-align: left">
				<td>성별 : 	
				<label>남성<input type="radio" id="male" name="gender" value="male" checked="checked"></label> <label>여성<input type="radio" id="female" name="gender" value="female"></label>
					<div id="genderErr" class="error"  style="display: none">필수 정보입니다.</div></td>
			</tr>
			<tr style="text-align: left">
				<td><input type="text" id="postcode1" readonly="readonly"
					class="d_form mini" size="4" maxlength="3"> - <input
					type="text" id="postcode2" readonly="readonly" class="d_form mini" size="4"
					maxlength="3"> <input type="button" id="addressBtn" value="우편번호 찾기" class="d_btn"><br>
					<input type="text" id="address" class="d_form std" placeholder="주소" readonly="readonly"> 
					<input type="text" id="addressDetail" class="d_form" placeholder="상세주소">
					<div id="addressErr" class="error" style="display: none">필수 정보입니다.</div>
					<input type="hidden" id="postcode" name="postcode" value="2"> <input type="hidden" name="addressDetails" id="addressDetails" value="3">
				</td>
			</tr>
			<tr>
				<td><input type="text" id="phone" name="phone" maxlength="14"
					placeholder="핸드폰 번호" class="int">
					<div id="phoneErr" class="error"  style="display: none">필수 정보입니다.</div></td>
			</tr>
		</table>
		<br>
		<table>
			<tr>
				<td><input type="text" id="corporateNumber" name="corporateNumber" 
					placeholder="사업자 등록번호" class="int" maxlength="10">
					<div id="corporateErr" class="error" style="display: none">필수 정보입니다.</div></td>
			</tr>
		</table>
		<br>
		<table>
			<tr>
				<td><input type="text" id="email" name="email" 
					placeholder="이메일" class="int2">
					<button type="button" id ="emailBtn">인증</button>
					<div id="emailErr" class="error" style="display: none">필수 정보입니다.</div></td>
			</tr>
			<tr>
				<td><input type="text" id="code" name="code" maxlength="12"
					placeholder="인증번호" class="int2">
					<button type="button" id="codeBtn">확인</button>
					<div id="codeErr" class="error"  style="display: none">인증이 필요합니다.</div></td>
			</tr>
			</table>
			<div id="joinErr" class="error"  style="display: none">입력하신 정보를 확인해주세요.</div>
			<table>
			<tr id="join" >
				<th class="join"><font size="5" color="white">회원가입</font></th>
			</tr>
		</table>
	</form>
</div>