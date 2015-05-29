<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BUYER JOIN</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/buyer.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/buyerjoin.js" ></script>
</head>
<body>
	<h2>바이어 회원가입</h2>
	<form id="buyer_form"
		action="<%=request.getContextPath()%>/buyer/buyerJoin.do" method="post">
		<table>
			<tr>
				<td><input type="text" id="buyerId" name="buyerId"
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
			<tr>
				<td><input type="text" id="address" name="address"
					placeholder="주소" class="int">
					<div id="addressErr" class="error"  style="display: none">필수 정보입니다.</div></td>
			</tr>
			<tr>
				<td><input type="text" id="phone" name="phone" maxlength="12"
					placeholder="핸드폰 번호" class="int">
					<div id="phoneErr" class="error"  style="display: none">필수 정보입니다.</div></td>
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

</body>
</html>