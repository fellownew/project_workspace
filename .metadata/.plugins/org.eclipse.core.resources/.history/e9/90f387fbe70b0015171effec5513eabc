<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/order.css">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript" src="http://dmaps.daum.net/map_js_init/postcode.v2.js" ></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/address.js"></script>
 <script type="text/javascript"> 
 
 /*   
 private String orderId;
 private int productId;
 private int amount;
 private String status;
 private String buyerId;
 private String sellerId;
 
     OrderController에 들어감 @RequestMapping("payment.do") public String payment(){};
        taommall/auth/payment.do
     
        1. orderId - 자동으로 생성되게 seq써서 만들것.
        2. productId는 내가 ${reqeustScope.product.productId}
        3. amount는 ${requestScope.amount}
        4. status default="배송준비";
        5. buyerId <--sessionScope.loginInfo //Controller HttpSession  Buyer buyer = session.getAttribute("loginInfo");
                 buyer.getbuyerId();
        6.          Product product = productService.selectProductNoPaging(productId,null); 
           String sellerId = product.getSellerId();

          Order order = new Order(orderId,productId,amount,status,buyerId,sellerId);
          
          int count = serivce.insertOrder(order);
       System.out.Println(count);
       
       
       */


 </script>
</head>

<script type="text/javascript">
	$(document).ready(function(){

		$("#payment").on("click",function(){
			alert("결제완료");
			
		 	if($("#test1").is(":checked")){
		 		$("#postcode").val('${sessionScope.loginInfo.address.postcode}');
				$("#addressDetail").val('${sessionScope.loginInfo.address.addressDetails}');
		 	}else{
		 		$("#postcode").val($("#postcode1").val()+"-"+$("#postcode2").val());
				$("#addressDetail").val($("#address").val()+" "+$("#addressDetails").val());
		 	}
		 	alert($("#postcode").val()+":"+$("#addressDetail").val());
			
			location = "<%=request.getContextPath() %>/auth/payment.do?productId="
					+${requestScope.product.productId}
             		+"&amount="+${requestScope.amount}
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
	
	<table class="center">
		<caption style="text-align:left; font-weight:bold; font-size:20px" >주문상품 확인</caption>
		<thead>
			<tr>
				<td>상품 정보</td>
				<td>수량</td>
				<td>상품 금액</td>
				<td>판매자</td>
			</tr>
		</thead>

		<tbody>
				<tr>
					<td><img src="<%=request.getContextPath()%>/${requestScope.product.imagePath }" width="120px" height="120px"/></td>
					<td>${requestScope.amount}</td>
					<td>${requestScope.product.productPrice}</td>
					<td>${requestScope.product.sellerId}</td>
				</tr> 
		</tbody>
	</table>
	<br>

	<table class="center">
	<caption style="text-align:left; font-weight:bold; font-size:20px">구매자 정보</caption>
		<thead>
			<tr>
				<td style="width:80px; text-align:left">보내는분</td>
				<td style="text-align:left">${sessionScope.loginInfo.name}</td>
			</tr>
			<tr>
				<td>주소</td>
				<td style="text-align:left" id="oiginalAddr">
				${sessionScope.loginInfo.address.postcode}
				${sessionScope.loginInfo.address.addressDetails}</td>
			</tr>	
			<tr>
				<td>연락처</td>
				<td style="text-align:left">${sessionScope.loginInfo.phone}</td>
			</tr>							
	</table><br>

	<table class="center">
	<caption style="text-align:left; font-weight:bold; font-size:20px">받는사람 정보</caption>
			<tr>
				<td style="width:80px">배송지</td>
				<td style="text-align:left">
					<label><input type="radio" name="delivery" id="test1" checked="checked">기본주소</label>
					<label><input type="radio" name="delivery" id="test2">새로입력</label>
				</td>
			</tr>
			<tr>
				<td>받는분</td>
				<td style="text-align:left"><input type="text" name="name" id="name" readonly="readonly" value="${sessionScope.loginInfo.name}"></td>
				<!-- <td style="text-align:left" id="td1">${sessionScope.loginInfo.name}</td>  -->
			</tr>
			<tr>
				<td>주소</td>
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
				<td>연락처</td>
				<td style="text-align:left"><input type="text" name="phone" id="phone" readonly="readonly" value="${sessionScope.loginInfo.phone }"></td>
				<!-- <td style="text-align:left" id="td3">${sessionScope.loginInfo.phone}</td>-->
			</tr>
			<tr>
				<td>배송 시<br>요구사항</td>
				<td style="text-align:left">
					<input type="text" id="detail" name="detail" size="75">
<!-- 					<select>
						<option>옥상 문 앞에 보관해주세요. 감사합니다.</option>
						<option>부재시 경비실에 맡겨주세요.</option>
						<option>빠른 배송 부탁드립니다.</option>
						<option>부재시 핸드폰으로 연락바랍니다.</option>
						<option>배송 전 연락바랍니다.</option>
						
					</select> -->
				</td>
			</tr>
	</table><br>
				<button id="payment">결제하기</button>
		</thead>
	</table><br>
	<button id="payment">결제하기</button>
</body>
</html>