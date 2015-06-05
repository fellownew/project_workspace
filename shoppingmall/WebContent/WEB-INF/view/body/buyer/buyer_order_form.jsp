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
 $(document).ready(function(){
	 
	 $("#payment").on("click",function(){
		
		 location = "<%=request.getContextPath() %>/auth/payment.do?productId="+${requestScope.product.productId}
		 		+"&amount="+ ${requestScope.amount};

	 });
	 
	 
	 
	 
	 
	 
	 //만약에 상품을 구입하면, 장바구니에서 삭제 되게 해야한당.
	list = '${param.cart_list}';
	var varList = list.split(",");
	var list = new Array();
	for(var idx =0;idx<varList.length;idx++){
		list.push(varList[idx]);
	}
 
 });

 </script>
</head>

<script type="text/javascript">
	$(document).ready(function(){

		$("#payment").on("click",function(){
			alert("결제완료");
			location = "<%=request.getContextPath() %>/auth/payment.do?productId="
					+${requestScope.product.productId}
             		+"&amount="+${requestScope.amount}
             		+"&name="+$("#name").val()
             		+"&address="+$("#address").val()
             		+"&phone="+$("#phone").val()
             		+"&detail="+$("#detail").val();
		});
	 
		
		$("#test1").on("click",function(){
			//$("#td1").html($("#text1").val());
			//$("#td2").html($("#text2").val());
			//$("#td3").html($("#text3").val());
 			$("#name").prop("readonly", true).val("${sessionScope.loginInfo.name}");
			$("#address").prop("readonly", true).val("${sessionScope.loginInfo.address}");
			$("#phone").prop("readonly", true).val("${sessionScope.loginInfo.phone}");
		});
	});
	
	$(document).ready(function(){
		$("#test2").on("click",function(){
 			$("#name").prop("readonly", false).val("");
			$("#address").prop("readonly", false).val("");
			$("#phone").prop("readonly", false).val("");
			//$("#td1").html($("<input id='text1' value='" + $("#td1").html() + "'>"));
			//$("#td2").html($("<input id='text2' value='" + $("#td2").html() + "'>"));
			//$("#td3").html($("<input id='text3' value='" + $("#td3").html() + "'>"));
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
					<td><img src="<%=request.getContextPath() %>/${requestScope.product.imagePath }" width="120px" height="120px"/></td>
					<td>${requestScope.amount}</td>
					<td>${requestScope.product.productPrice * requestScope.amount}</td>
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
				<td style="text-align:left">${sessionScope.loginInfo.address}</td>
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
					<input type="radio" name="delivery" id="test1" checked="checked">기본주소
					<input type="radio" name="delivery" id="test2">새로입력
				</td>
			</tr>
			<tr>
				<td>받는분</td>
				<td style="text-align:left"><input type="text" name="name" id="name" readonly="readonly" value="${sessionScope.loginInfo.name}"></td>
				<!-- <td style="text-align:left" id="td1">${sessionScope.loginInfo.name}</td>  -->
			</tr>
			<tr>
				<td>주소</td>
				<td style="text-align:left"><input type="text" size="75" name="address" id="address" readonly="readonly" value="${sessionScope.loginInfo.address}"></td>
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