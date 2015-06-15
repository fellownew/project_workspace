<%@page import="java.util.Date"%>
<%@page import="kr.co.taommall.product.vo.Product"%>.
<%@page import="java.text.NumberFormat"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="java.net.URLDecoder"%>

<!DOCTYPE html>
<meta charset="UTF-8">

<style type="text/css">
.buyButton {
  font-family: arial;
  font-weight: bold;
  color: #FFFFFF !important;
  font-size: 14px;
  padding: 9px 11px;
  background: #CD0000;
  width:100px;
}

.cartButton {
  font-family: arial;
  font-weight: bold;
  color: #000000 !important;
  font-size: 14px;
  padding: 9px 11px;
  border: 1px solid #000000;
  background: #FFFFFF;
  width:100px;
}

</style>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript">

// 쿠키 생성
 function setCookie(cName, cValue, cDay){
        var expire = new Date();
        expire.setDate(expire.getDate() + cDay);
        cookies = cName + '=' + escape(cValue) + '; path=/ '; // 한글 깨짐을 막기위해 escape(cValue)를 합니다.
        if(typeof cDay != 'undefined') cookies += ';expires=' + expire.toGMTString() + ';';
        document.cookie = cookies;
    }

// 쿠키 가져오기
function getCookie(cName) {
   cName = cName + '=';
   var cookieData = document.cookie;
   var start = cookieData.indexOf(cName);
   var cValue = '';
   if(start != -1){
       start += cName.length;
       var end = cookieData.indexOf(';', start);
       if(end == -1)end = cookieData.length;
       cValue = cookieData.substring(start, end);
   }
   return unescape(cValue);
}

$(document).ready(function(){
	var id = '${product.productId}';
	var name = '${product.productName}';
	var image = '${product.imagePath}';
	var i=0;
	var flag = false;
	while(true){
		//쿠키중에서 value가 같은 쿠키 찾는다.
		<%Cookie[] list = request.getCookies();
		for(Cookie c : list){%>
			//찾으면 break;
			if(id == '<%=c.getValue()%>'){
				 flag = true;
				break;
			}
		<%}%>
		//value 같은거 있으면 바로 빠져나온다.
		if(flag){
			break;
		}
		if(i==5){
			for(var idx = 3; idx>=0;idx--){
				setCookie('productId'+(idx*1+1*1),getCookie('productId'+idx),1);
				setCookie('productName'+(idx*1+1*1),getCookie('productName'+idx),1);
				setCookie('imagePath'+(idx*1+1*1),getCookie('imagePath'+idx),1);
			}
			setCookie('productId0',id,1);
			setCookie('productName0',name,1);
			setCookie('imagePath0',image,1);
			break;
		}else if(getCookie('imagePath'+i).trim().length!=0){
			i++;
		}else{
			setCookie('productId'+i,id,1);
			setCookie('productName'+i,name,1);
			setCookie('imagePath'+i,image,1); 
			break;
		}
	}
});

function order(id){
	location = "<%=request.getContextPath()%>/auth/memberOrderForm.do?productId="+id+"&amount="+$("#amount").val();
}
function cart(id){
	var amount = $("#amount").val();
	location = "<%=request.getContextPath() %>/cart/auth/cartInput.do?productId="+id+"&amount="+amount;	
}

</script>
<div>
	<h2 style="text-align: center;margin-top:20px">상품정보</h2>
	<table style="width:1000px;margin: 0 auto;border-collapse: collapse;"  border='1'>
		<tbody>

			<tr>
				<td rowspan="6" style="width:490px"><img width="490px" height="490px" src="<%=request.getContextPath() %>/${requestScope.product.imagePath }"/></td>
				<td width="200px">상품명</td>	
			    <td>${product.productName}</td>	
			</tr>
			<tr>
				<td>상품가격</td>
				<td><fmt:formatNumber value="${product.productPrice}"/>원</td>
			</tr>
			<tr>
				<td>유통기한</td>
				<td>
				${product.expDate}
				</td>
			</tr>
			<tr>
				<td>판매자 정보</td>
				<td><a href="#" onclick="note('${product.sellerId }')">${product.sellerId}</a></td>
			</tr> 
			<tr>
				<td>수량</td>
				<td><input type="number" id="amount" value="1" size="1"  max="99" maxlength="2" style="width:50px "></td>
			</tr> 	
			<c:choose>
			<c:when test="${sessionScope.user=='buyer'}">
			<tr>
				<td colspan="2"><button class="buyButton" onclick="order(${product.productId})">주문</button><button class="cartButton" id="cart" onclick="cart(${product.productId})">장바구니</button></td>			
			</tr>
			</c:when>
			<c:otherwise>
				<tr></tr>	
			</c:otherwise>
			</c:choose>
			<c:if test="${requestScope.product.infoImagePath != null}">			
			<tr>
				<td colspan="3" style="height: 300px;position: relative;"><img src="<%=request.getContextPath() %>/${requestScope.product.infoImagePath }"/></td>
			</tr>
			</c:if>
			
		</tbody>
	</table>
	<jsp:include page="product_info_board.jsp"></jsp:include>	
	<a href="#" onclick="javascript:$j(window).scrollTop(0);void(0);" style="text-align: right;">top</a>
	
</div>
