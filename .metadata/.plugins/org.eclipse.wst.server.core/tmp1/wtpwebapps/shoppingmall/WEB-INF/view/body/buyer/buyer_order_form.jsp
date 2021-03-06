<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/order.css">
<style type="text/css">


</style>	
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript" src="http://dmaps.daum.net/map_js_init/postcode.v2.js" ></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/address.js"></script>

</head>

<script type="text/javascript">
	$(document).ready(function(){

		$("select").change(function(){
			if($("select option:selected").attr("id")!="op1"){				
			$("#detail").val($("select option:selected").val());
			}else{
				$("#detail").val('');
				$("#detail").focus();
			}
		});
		
		
		
		$("#payment").on("click",function(){
			
		 	if($("#test1").is(":checked")){
		 		$("#postcode").val('${sessionScope.loginInfo.address.postcode}');
				$("#addressDetail").val('${sessionScope.loginInfo.address.addressDetails}');
		 	}else{
		 		$("#postcode").val($("#postcode1").val()+"-"+$("#postcode2").val());
				$("#addressDetail").val($("#address").val()+" "+$("#addressDetails").val());
		 	}
		 	

		 	
			location = "<%=request.getContextPath() %>/auth/payment.do?productId="+'${param.productId}'
             		+"&amount="+'${param.amount}'
             		+"&name="+$("#name").val()
             		+"&postcode="+($("#postcode").val())
             		+"&addressDetails="+$("#addressDetail").val()
             		+"&phone="+$("#phone").val()
             		+"&detail="+$("#detail").val();
		});
		
		
		$("#test1").on("click",function(){

			$("#postcode").val();
			$("#addressDetail").val($("#address").val()+" "+$("#addressDetails").val());
			$("#addr1").html($("#oiginalAddr").text());
			$("#addr1").show();
			$("#addr2").hide();
			$("")
			$("#name").prop("readonly", true).val('${sessionScope.loginInfo.name}');
			$("#phone").prop("readonly", true).val('${sessionScope.loginInfo.phone}');
			$("#postcode1").val('');
			
		});
	});
	
	$(document).ready(function(){
		$("#test2").on("click",function(){

			$("#addr2").show();
			$("#addr1").hide();
 			$("#name").prop("readonly", false).val("");
			$("#address").prop("readonly", false).val("");
			$("#phone").prop("readonly", false).val("");
			$("#postcode1").val('');
			$("#postcode2").val('');
			$("#addressDetails").val('');
		});
	});
	
	
</script>



<body>
<!-- 	<fieldset style="height:500px"> -->
	<table class="center" >
		<colgroup>
				<col width="41%"> 
				<col width="12%">
				<col width="10%"> 
				<col width="12%">
				<col width="15%"> 
		</colgroup>
		<caption style="text-align:left; font-weight:bold; font-size:20px" >주문상품 확인</caption>
		<thead>
			<tr>
				<th style=" width=150px">상품 정보</th>
				<th>상품 금액</th>
				<th>수량</th>
				<th>합계</th>
				<th>판매자</th>
			</tr>
		</thead>

		<tbody>
		<c:forEach items="${requestScope.list}" var="cart">
				<tr>
					<td style="text-align:left">
					<div style="float: left"> 
					<img src="<%=request.getContextPath()%>/${cart.product.imagePath}" style="width: 100px;height: 100px; "/>
					</div>
					<div class="productName" style="padding-left: 120px"><font size="3">${cart.product.productName }</font></div><br>
					<div class="productInfo" style="padding-left: 120px"><font size="2">${cart.product.productInfo }</font></div>
					</td>
					<td style="text-align:right"><fmt:formatNumber value="${cart.product.productPrice}"/>원</td>
					<td style="text-align:right">${cart.amount}</td>
					<td style="text-align:right"><fmt:formatNumber value="${cart.product.productPrice*cart.amount}"/>원</td>
					<td style="text-align:right">${cart.product.sellerId}</td>
				</tr> 
		</c:forEach>
		</tbody>
	</table>
	<br>

	<table class="center">
	<caption style="text-align:left; font-weight:bold; font-size:20px">구매자 정보</caption>
		<thead>
			<tr>
				<th style="width:80px; text-align:left">보내는분</th>
				<td style="text-align:left">${sessionScope.loginInfo.name}</td>
			</tr>
			<tr>
				<th>주소</th>
				<td style="text-align:left" id="oiginalAddr">
				${sessionScope.loginInfo.address.postcode}
				${sessionScope.loginInfo.address.addressDetails}</td>
			</tr>	
			<tr>
				<th>연락처</th>
				<td style="text-align:left">${sessionScope.loginInfo.phone}</td>
			</tr>							
	</table><br>
		
	<div>
	<table class="center">
		<colgroup>
				<col width="20%"> 
				<col width="80%">
		</colgroup>
	<caption style="text-align:left; font-weight:bold; font-size:20px">받는사람 정보</caption>
			<tr>
				<th style="width:80px">배송지</th>
				<td style="text-align:left">
					<label><input type="radio" name="delivery" id="test1" checked="checked">기본주소</label>
					<label><input type="radio" name="delivery" id="test2">새로입력</label>
				</td>
			</tr>
			<tr>
				<th>받는분</th>
				<td style="text-align:left"><input type="text" name="name" id="name" readonly="readonly" value="${sessionScope.loginInfo.name}"></td>
				<!-- <td style="text-align:left" id="td1">${sessionScope.loginInfo.name}</td>  -->
			</tr>
			<tr>
				<th>주소</th>
				<td style="text-align:left">
				<div id="addr1">${sessionScope.loginInfo.address.postcode} ${sessionScope.loginInfo.address.addressDetails}</div>
				<div id="addr2" style="display: none">
						<input type="text" id="postcode1" readonly="readonly" class="d_form mini" size="4" maxlength="3"> - <input
							type="text" id="postcode2" readonly="readonly" class="d_form mini" size="4"	maxlength="3"> 
							<input type="button" id="addressBtn" value="우편번호 찾기" class="d_btn"><br>
							<input type="text" id="address" class="d_form std" placeholder="주소" readonly="readonly" size="40"> 
							<input type="text" id="addressDetails" class="d_form" placeholder="상세주소" size="30">	
							<input type="hidden" id="postcode" name="postcode"><input type="hidden" id="addressDetail" name="addressDetail">							
							<span id="addressErr" class="error" style="display: none">필수입력 사항입니다.</span>
				</div>
				</td>
				<!-- <td style="text-align:left" id="td2">${sessionScope.loginInfo.address}</td>-->
			</tr>
			<tr>
				<th>연락처</th>
				<td style="text-align:left"><input type="text" name="phone" id="phone" readonly="readonly" value="${sessionScope.loginInfo.phone }"></td>
				<!-- <td style="text-align:left" id="td3">${sessionScope.loginInfo.phone}</td>-->
			</tr>
			<tr>
				<th>배송 시 요구사항</th>
				<td style="text-align:left">
					<input type="text" id="detail" name="detail" value="빠른 배송 부탁드립니다." size="55">
 					<select>
	 					<option id="op1">직접입력</option>
						<option id="op2">옥상 문 앞에 보관해주세요. 감사합니다.</option>
						<option id="op3">부재시 경비실에 맡겨주세요.</option>
						<option id="op4" selected="selected">빠른 배송 부탁드립니다.</option>
						<option id="op5" >부재시 핸드폰으로 연락바랍니다.</option>
						<option id="op6">배송 전 연락바랍니다.</option>
					</select> 
				</td>
			</tr>
			<tr>
				<td colspan="2" >
					
				</td>
			</tr>
		</table><br>
		</div>
		<button id="payment" style="position:relative;left: 1055px;margin-bottom: 10px; ">결제하기</button>
		
</body>
</html>