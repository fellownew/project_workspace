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
	padding-left: 20px;
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
			<font-weigth:bold>고객센터에 원하는 답변이 없어요.</font-weigth:bold>
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
			아이디를 변경할 수 있나요?
		</td>
	<tr id="5_ex" class="explain">
		<td colspan="2" style="text-align: center;">
	<pre>
		Taom 에서는 보안 및 시스템상의 이유로,
		이미 등록하신 개인 및 단체 아이디는 변경하실 수 없습니다.
		
		번거로우시더라도 새로운 아이디로 다시 가입해 주세요.
	</pre>
		</td>
	</tr>
	<tr id="6" value="1">
	<th>6</th>
	<td>
	'잠시 후 다시 가입을 시도해주세요' 라는 메시지가 보이는 경우
	</td>
	</tr>
	<tr id="6_ex" class="explain">
	<td colspan="2" style="text-align: center;">
	<pre>
	Taom 에서는 동일한 IP에서 다수의 아이디가 가입하려고 하는 경우,
	
	극소수 익명 사용자의 대량 가입으로 인한,
	
	선의의 이용자들의 피해를 방지하기 위해 가입을 제한하고 있습니다.
	</pre>
	</td>
	</tr>
	<tr id="7" value="1">
	<th>7</th>
	<td>
	비정상적인 가입으로 제한되었다는 경우
	</td>
	</tr>
	<tr id="7_ex" class="explain">
	<td colspan="2" style="text-align: center;">
	<pre>
	해외에서 가입 시 비정상적인 가입으로 제한되었다고 나타납니다.
	
	해외에서 회원 가입 시 비정상적인 가입이 확인되어 가입이 제한되었다는 현상은
	가입을 시도한 인터넷 환경에서 Taom 으로 대량의 가입을 시도하는 경우 발생합니다.
 
	이러한 경우, 번거로우시더라도 일정 시간 이후 다시 가입을 시도하거나
	장소를 옮기셔서 다른 기기에서 가입을 시도해 주세요.
 
	또한, 이용하시는 PC 기기가 악성코드에 감염되었을 수 있으니,
	사용하시는 백신을 업데이트하셔서 악성코드를 검사/치료해야 합니다.
	</pre>
	</td>
	</tr>
	<tr id="8" value="1">
	<th>8</th>
	<td>
	그 외의 오류로 가입이 안 되는 경우
	</td>
	</tr>
	<tr id="8_ex" class="explain">
	<td colspan="2" style="text-align: center;">
	<pre>
	그 외의 오류로 가입이 안 되는 경우에는 어떻게 하나요?
	
	그 외 오류로 가입이 안 될 경우에는 인터넷 설정을 변경하여 주시기 바랍니다.
 
	1) 브라우저에서 도구 -> 인터넷 옵션 클릭
	2) 인터넷 옵션 창에서 일반 탭에서 '검색 기록' 의 [삭제] 버튼 클릭
	3) 검색 기록 삭제 창에서 전체를 체크한 후, [삭제]버튼 클릭
	4) 다시 일반 탭 '검색 기록'의 [설정] 버튼 클릭
	5) 임시 인터넷 파일 및 열어본 페이지 목록 설정 창에서 
	   '페이지를 열 때마다'를 선택한 후, [확인] 클릭.
	6) 인터넷 옵션 [보안] 탭에서 '신뢰할 수 있는 사이트'를 선택한 후,
  	   [기본 수준] 클릭하고, '제한된 사이트'를 선택한 후, [기본 수준] 클릭
	7) 다시 '신뢰할 수 있는 사이트' 선택한 후, [사이트] 버튼 클릭
	8) 신뢰할 수 있는 사이트 창에서 Taom 관련된 모든 웹사이트는
           [제거]하고, '*.taom.com' 추가하여 등록
	9) 다시 인터넷 옵션 창의 [보안]탭에서 '제한된 사이트' 선택 후, [사이트] 클릭
	10) 제한된 사이트창에서 등록된 웹사이트가 있다면 모두 [제거]
	11) 다시 인터넷 옵션 창의 [개인정보] 탭을 클릭하여, [사이트] 클릭
	12) 사이트별 개인 정보 창에서 관리되는 웹사이트 중,
		 Taom 관련된 사이트가 있다면, 모두 [제거]
	13) 인터넷 옵션 창의 [고급] 탭을 선택한 후, [고급 설정 복원] 클릭
 
	위와 같이 설정하였으나, 지속적으로 로그인이 어려우신 경우,
	  인터넷 옵션 [고급] 탭에서	Internet Explorer의 설정을 
	  기본 상태대로 [원래대로]를 클릭해주시기 바랍니다.
 
	브라우저의 기본 설정을 [원래대로]로 클릭하여 설정하신 이후에도
	지속적으로 로그인이 되지 않으시는 경우,
	사용하시는 브라우저의 업데이트 된 버전을 설치하시는 것을 권해드립니다.
	</pre>
	</td>
	</tr>
	<tr id="9" value="1"><th>9</th><td>6번 내용에 대한 추가 내용</td></tr>
	<tr id="9_ex" class="explain"><td colspan="2" style="text-align: center;"><pre>
	사실 IP체크 안합니다. 인증번호만 잘 쓰신다면 가입은 얼마든지 하실 수 있어요
	</pre></td>
	</tr>
	<tr id="10" value="1"><th>10</th><td>7번 내용에 대한 추가 내용</td></tr>
	<tr id="10_ex" class="explain"><td colspan="2" style="text-align: center;"><pre>
	사실 해외 IP도 체크 못합니다. IP체크따위 개나 주세요.
	근데 별것도 없는 이 게시판에서 이것까지 읽어보시다니 심심하신가봐요...
	</pre></td>
	</tr>  
</tbody>
</table>