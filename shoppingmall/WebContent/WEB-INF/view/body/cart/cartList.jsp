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
	
	$("input[type='text']").blur(function(){
		var id = '#'+$(this).attr('id');
		var err = id+"_span";
		
		if(isNaN($(id).val())){
			$(err).show();
			$(id).val('1');
			$(id).focus();
			return false;
		}else{
			$(err).hide();
			
			$.ajax({
				url:"/taommall/cart/auth/modifyAmount.do",
				type:"POST",
				data:{password:$("#newPassword").val(),currPassword:$("#currentPassword").val()},	
				dataType:"text",
				beforeSend:function(){
					 if(!isPassword){
						$("#cpasswordErr").show().html("필수 정보입니다").attr('style', "color:red");
						return false;
					}else if(!isNewPassword){
						$("#pconfirmErr").show().html("비밀번호를 확인해주세요").attr('style', "color:red");
						return false;
					}
				},
				success:function(res){
					if(res=="fail"){
						$("#cpasswordErr").show().html("비밀번호가 틀렸습니다.").attr('style', "color:red");
					}else{
						$("#currentPassword").val('');
						$("#newPasswordConfirm").val('');
						$("#newPassword").val('');
						$("#passwordDetail").hide();
						$("#notify").html("변경완료");
					}
					
				}
			});	
		}
		
		

	})
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
				<col style="width: 50%;" />
				<col style="width: 12%;" />
				<col style="width: 14%;" />
				<col style="width: 9%;" />
				<col style="width: 11%;" />
			</colgroup>
			<thead>
				<tr>
					<th class="none_line"><input type="checkbox" id="chk_all_sel1"
						name="chk_all_sel1" onclick="javascript:AllChkItems(1);" /></th>
					<th><span>상품명</span></th>
					<th><span>수량</span></th>
					<th><span>상품가격</span></th>
					<th><span>합계</span></th>
					<th class="none_line"><span>배송비</span></th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${requestScope.cart_list}" var="cart">
			<tr>
				<td><input type="checkbox" id="chk_all_sel1"
						name="chk_all_sel1" onclick="javascript:AllChkItems(1);"></td>
				<!-- 상품명 임 -->
				<td class="product_td">
					<div style="float: left"> <img src='<%=request.getContextPath()%>/${cart.product.imagePath}' style="width: 80px;height: 80px; "> </div> 	
					<div>${cart.product.productName }</div>
					<div class="info">${cart.product.productInfo }</div>
				</td>	
				<td style="text-align: center;"><span><input type="text" id="${cart.productId}" value="${cart.amount}" size="1"  max="99" maxlength="2"></span><div><span id="${cart.productId}_span" class="error" style="display: none;">숫자를<br>입력하세요.</span></div></td>
				<td style="text-align: center;"><span>${cart.product.productPrice}원</span></td>
				<td style="text-align: center;"><span>${cart.product.productPrice * cart.amount}원</span></td>
				<td style="text-align: center;"><span >무료</span></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>