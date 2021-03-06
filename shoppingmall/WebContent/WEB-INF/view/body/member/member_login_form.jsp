<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/buyer.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/member_login.js"></script>

 <div id="container" style="width:300px;margin:0 auto;">
    <ul class="tabs">
        <li class="active" rel="blog">구매자</li>
        <li rel="slog">판매자</li>
    </ul>
    <div class="tab_container">
        <div id="blog" class="tab_content">
            <form action="<%=request.getContextPath()%>/mainPage.do" class="loginForm" id="buyerLogin" method="post">
		<div>
		<input type="text" name="bId" id="bId" placeholder="구매자아이디" class="loginInput">
		<span id="bIdErr" class="error" style="display:none">아이디를 입력해주세요.</span>
		</div>
		<div>
		<input type="password" name="bPassword" id="bPassword" placeholder="비밀번호" class="loginInput">
		<span id="bPasswordErr" class="error" style="display:none">비밀번호를 입력해주세요.</span> 
		</div>
		<div>
		<span id="bLoginError" class="error" style="display:none">아이디 또는 비밀번호를 다시 확인하세요.<br> 등록되지 않은 아이디이거나, 아이디 또는 비밀번호를 잘못 입력하셨습니다.<br></span> 
		<img id="bButton" style="padding-left: 1px;" src="<%=request.getContextPath()%>/image/submit.png">
		<div style="text-align: right;" ><a id="bIdCheck" href="">아이디 찾기</a> <a id="bPasswordCheck" href="">비밀번호 찾기</a></div>
		</div>
	</form>
        </div>
        <!-- #tab1 -->
        <div id="slog" class="tab_content">
        <form action="<%=request.getContextPath()%>/mainPage.do" class="loginForm" id="sellerLogin" method="post">
		<div>
		<input type="text" name="sId" id="sId" placeholder="판매자아이디" class="loginInput">
		<span id="sIdErr" class="error" style="display:none">아이디를 입력해주세요.</span>
		</div>
		<div>
		<input type="password" name="sPassword" id="sPassword" placeholder="비밀번호"class="loginInput">
		<span id="sPasswordErr" class="error" style="display:none">비밀번호를 입력해주세요.</span> 
		</div>
		<div>
		<span id="sLoginError" class="error" style="display:none">아이디 또는 비밀번호를 다시 확인하세요.<br> 등록되지 않은 아이디이거나, 아이디 또는 비밀번호를 잘못 입력하셨습니다.<br></span>
		<img id="sButton"  src="<%=request.getContextPath()%>/image/submit.png">
		<div style="text-align: right;" ><a id="sIdCheck" href="" >아이디 찾기</a> <a id="sPasswordCheck" href="">비밀번호 찾기</a></div>
		</div>
	</form>    
      
       </div>
        <!-- #tab2 -->
    </div>
    <!-- .tab_container -->
</div>
