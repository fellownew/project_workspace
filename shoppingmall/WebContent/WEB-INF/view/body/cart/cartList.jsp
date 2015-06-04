<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
.error {
	margin: 3px 0 3px 1px;
	font-size: 10px;
	color: #f00
}
.info{
font-size: 10px;
	color: #8E8A89
}
</style>
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	
	
	$("#purchase").on("click",function(){
		var list = new Array();
	 	  $('.chk').each(function() {
			  if($(this).is(":checked")){
					 list.push($(this).attr('value'));
			  }
			
		   });
	 	  alert(list);
	 	  
	 	 var url ='<%=request.getContextPath()%>/auth/buyerOrderForm.do?list=list';
			$(location).attr('href',url);
	 	  
	 	  
	});
		if(${requestScope.error != null}){
			alert('${requestScope.error}');
		}
	
	$("#allCheck").on("click",function(){
		if($(this).is(":checked")){
		$(".chk").prop("checked",true);
		}else{
			$(".chk").prop("checked",false);	
		}
	});
	

	
	
	$("input[type='checkbox']").on("click",function(){
 		 var finalValue=0;
 	  $('.chk').each(function() {
		  if($(this).is(":checked")){
			  var text = $(this).attr('value');	
			  var sum = '#'+text+"_sum";

			  var value2 = $(sum).text();
			  finalValue = finalValue*1+value2*1;
		  }else{
			  
		  }
	   });
 		 $("#result").val(finalValue);
 	  
	});

/* 	  
	$("input[type='checkbox']").on("click",function(){
		var text = $(this).attr('value');
		var sum = '#'+text+"_sum";

		var value1 = $("#result").val();
		var value2 = $(sum).text();
		
		alert(result);
		$("#result").val(result);
	}); */
	
	
	$("input[type='text']").blur(function(){
		var amount = $(this).val();
		var id = '#'+$(this).attr('id');
		var err = id+"_span";
		var sum = id+"_sum";
		var price =id+"_price";
		if(isNaN($(id).val())){
			$(err).show();
			$(id).val('1');
			$(id).focus();
			return false;
		}else{
			$(err).hide();
			
			
		}
		$.ajax({
			url:"/taommall/cart/auth/modifyAmount.do",
			type:"POST",
			data:{buyerId : '${buyerId}',productId :$(this).attr('id'), amount:amount},	
			dataType:"text",
			success:function(res){
				if(res=='success'){
					$(sum).text($(price).text()*amount);
				}
			}
		});	
		

	});
});

</script>
</head>
<body>

<hr>
	<div class="cart_list_table">
	
		<table id="">
			<caption>장바구니 리스트</caption>
			<colgroup>
				<col style="width: 4%;" />
				<col style="width: 45%;" />
				<col style="width: 12%;" />
				<col style="width: 14%;" />
				<col style="width: 9%;" />
				<col style="width: 11%;" />
				<col style="width: 5%;" />
			</colgroup>
			<thead>
				<tr>
					<th class="allCheck"><input type="checkbox" id="allCheck"
						name="allCheck" /></th>
					<th><span>상품명</span></th>
					<th><span>수량</span></th>
					<th><span>상품가격</span></th>
					<th><span>합계</span></th>
					<th class="none_line"><span>배송비</span></th>
					<th><span>삭제</span></th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${requestScope.cart_list}" var="cart">
			<tr>
				<td><input type="checkbox" id="${cart.productId}_chk" value="${cart.productId}"
						name="chk" class="chk" ></td>
				<!-- 상품명 임 -->
				<td class="product_td">
					<div style="float: left"> <img src='<%=request.getContextPath()%>/${cart.product.imagePath}' style="width: 80px;height: 80px; "> </div> 	
					<div>${cart.product.productName }</div>
					<div class="info">${cart.product.productInfo }</div>
				</td>	
				<td style="text-align: center;"><span><input type="text" id="${cart.productId}" value="${cart.amount}" size="1"  max="99" maxlength="2"></span><div><span id="${cart.productId}_span" class="error" style="display: none;">숫자를<br>입력하세요.</span></div></td>
				<td style="text-align: center;"><span id="${cart.productId}_price">${cart.product.productPrice}</span>원</td>
				<td style="text-align: center;"><span id="${cart.productId}_sum">${cart.product.productPrice * cart.amount}</span>원</td>
				<td style="text-align: center;"><span >무료</span></td>
				<td style="text-align: center;"><a href="<%=request.getContextPath()%>/cart/auth/deleteCartList.do?productId=${cart.productId}&buyerId=${cart.buyerId}">삭제</a></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
		<input type="text" id="result" > <input type="button" id="purchase" value="구매하기">
	</div>
</body>
</html>