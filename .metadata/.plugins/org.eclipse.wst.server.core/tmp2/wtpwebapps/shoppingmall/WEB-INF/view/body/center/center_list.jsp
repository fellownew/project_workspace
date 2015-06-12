<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<meta charset="UTF-8">
<style type="text/css">
.explain{
	display: none;
	
}

.explain pre{
	text-align: left;
	padding-left: 40px;
}

pre {
  word-wrap: break-word;
  white-space: -moz-pre-wrap;
  white-space: pre-wrap;
}

#tbody tr{
	height: 30px;
}

</style>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript">

$(document).ready(function(){
	$("tbody tr").on("click",function(){
		
		var count = 0;
		var tr_id = "#"+$(this).attr("id")+"_ex";
		if($(this).attr("value")==1){
				$(tr_id).show();
				$(this).attr({value:2});
		}else{
				$(tr_id).hide();
				$(this).attr({value:1});
		}
	
	});
	$("#tbody").on("mouseover","tr",function(){
		$("#tbody tr").css("background-color","white");
		$(this).css("background-color","#FFF1F1");
	});
		
		
		
		
});
</script>

<table style="width: 600px; table-layout:fixed; margin:0 auto;padding-top: 30px;padding-bottom: 30px;border-collapse: collapse;" border="1">
<colgroup>
				<col style="width: 8px;" />
				<col style="width: 100px;" />
	
</colgroup>
<tr style="background-color: #F1F1F1"><th>No</th><th>글제목</th></tr>
<tbody id="tbody">
	<tr id="1" value="1">
		<th>1</th>
		<td>
			사이트 이용 시 오류가 발생합니다. 어떻게 하나요?
		</td>
	</tr>
	<tr id="1_ex" class="explain">
		<td colspan="2" style="text-align: center;">
			<pre>
			사용 중인 PC의 문제 또는 네트워크연결, 서버 점검 등의 이유로
			일시적인 오류가 발생할 수 있습니다.
			 
			자체적인 해결이 어렵다면 자세한 사유와 해결방안을 알아보실 수 있도록
			따옴몰 고객센터로 문의 주신다면 최선을 다해 상담해드리겠습니다.
			</pre>
		</td>
	</tr>
	<tr id="2" value="1">
	<th>2</th>
		<td>
			개인 구매회원의 회원가입 절차는 어떻게 되나요?
		</td>
	</tr>
	<tr id="2_ex" class="explain">
		<td colspan="2" style="text-align: center;">
			<pre >
			개인 구매회원 : 
			1. id 정보 입력 
				o id 중복확인
				o 비밀번호 입력/확인
			
			2. 개인정보 입력 :
				o 이름 입력
				o 주소 입력
				o 핸드폰번호 입력
			
			3. 인증정보 확인 : 
				o 이메일 입력
				o 인증번호 확인
			</pre>
		</td>
	</tr>
	<tr id="3" value="1" >
		<th>3</th>
		<td>
			사업자 판매회원의 회원가입 절차는 어떻게 되나요?
		</td>
	</tr>
	<tr id="3_ex"  class="explain"><td colspan="2" style="text-align: center;">
		<pre >
			사업자 판매회원 : 
			1. id 정보 입력 
				o id 중복확인
				o 비밀번호 입력/확인
			
			2. 개인정보 입력 :
				o 이름 입력
				o 성별 입력
				o 주소 입력
				o 핸드폰번호 입력
			
			3. 사업자 등록번호 :
				o 사업자 등록번호 입력
				
			4. 인증정보 확인 : 
				o 이메일 입력
				o 인증번호 확인
			5. 승인 대기 :
				o 관리자 인증 대기
			6. 회원가입 완료 :
				o 회원가입
		</pre>
	</td>
	</tr>
	<tr id="4" value="1">
		<th>4</th>
		<td>
			고객센터에 원하는 답변이 없어요.
		</td>
	</tr>
	<tr id="4_ex" class="explain">
		<td colspan="2" style="text-align: center;">
			<pre>
				관리자와의 1:1 문의는 쪽지를 이용하여 문의할 수 있습니다.
				'admin'으로 쪽지 문의해주세요.
			</pre>
		</td>
	</tr>
	<tr id="5" value="1" >
		<th>5</th>
		<td>
			<!-- 제목입력 -->
		</td>
	</tr>
	<tr id="5_ex" class="explain">
		<td colspan="2" style="text-align: center;">
			<pre>
			<!-- 내용 입력 -->
			</pre>
		</td>
	</tr>
	<tr id="6" value="1">
	<th>6</th>
	<td>
	<!-- 제목입력 -->
	</td>
	</tr>
	<tr id="6_ex" class="explain">
	<td colspan="2" style="text-align: center;">
	<pre>
	<!-- 내용 입력 -->
	</pre>
	</td>
	</tr>
	<tr id="7" value="1">
	<th>7</th>
	<td>
	<!-- 제목입력 -->
	</td>
	</tr>
	<tr id="7_ex" class="explain">
	<td colspan="2" style="text-align: center;">
	<pre>
	<!-- 내용 입력 -->
	</pre>
	</td>
	</tr>
	<tr id="8" value="1">
	<th>8</th>
	<td><!-- 제목입력 -->
	</td>
	</tr>
	<tr id="8_ex" class="explain">
	<td colspan="2" style="text-align: center;">
	<pre>
	<!-- 내용 입력 -->
	</pre>
	</td>
	</tr>
	<tr id="9" value="1"><th>9</th><td><!-- 제목입력 --></td></tr>
	<tr id="9_ex" class="explain"><td colspan="2" style="text-align: center;"><pre>
	<!-- 내용 입력 -->
	</pre></td>
	</tr>
	<tr id="10" value="1"><th>10</th><td><!-- 제목입력 --></td></tr>
	<tr id="10_ex" class="explain"><td colspan="2" style="text-align: center;"><pre>
	<!-- 내용 입력 -->
	</pre></td>
	</tr>  
</tbody>
</table>