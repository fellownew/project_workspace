<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>

        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/demo.css" />
        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/style.css" />
        <style type="text/css">
			.da-slider{
				background: transparent url('<%=request.getContextPath() %>/image/waves.gif') repeat 0% 0%;
				}
			.da-arrows span:after{
				background: transparent url('<%=request.getContextPath() %>/image/arrows.png') no-repeat top left;	
				}
		</style>
		<script type="text/javascript" src="<%=request.getContextPath()%>/script/modernizr.custom.28468.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.cslider.js"></script>
		<script type="text/javascript">
			$(function() {			
				$('#da-slider').cslider();		
			});
			
			$(document).ready(function(){
			i=0;
				window.onunload=function(){
					window.locatiobn.replace(self.location);
				}

			});
		</script>	

<div>
        <div class="container">
			<div id="da-slider" class="da-slider">
			   <c:forEach items="${requestScope.productList }" var="product">
					<div class="da-slide">
						<h2>${product.productName }</h2>
						<p>${product.productInfo }</p>
						<a href="productInfo.do?productId=${product.productId }" class="da-link">상품가기</a>
						<div class="da-img"><img src="${product.imagePath }" alt="image01" width="320px" height="320px"/></div>
					</div>
	  		 	</c:forEach> 
				<nav class="da-arrows">
					<span class="da-arrows-prev"></span>
					<span class="da-arrows-next"></span>
				</nav>
			</div>
        </div>
        
       <table style="width: 33.3%;vertical-align: top;">
       	<tbody id="tbody">
       		<c:forEach items="${requestScope.bottomList }" var="product" varStatus="i">
				<c:if test="${i.index==0 or i.index==3 or i.index==6 }">
					<tr>
				</c:if>
		       			<td  id="${product.productId }" value="${product.productName}" title="">
							<div>
								<a href="productInfo.do?productId=${product.productId }" onmouseover='this.style.filter="alpha(opacity=20)"' onmouseout='this.style.filter=""' class="el-main_list_03"><img id="${product.productName}"  src="${product.imagePath }" width="320"></a>
							</div>
							<div style="padding: 5px">
								<a href="productInfo.do?productId=${product.productId }">${product.productName }</a>
							</div>
							<div style="padding-bottom: 3px">
								<fmt:formatNumber value="${product.productPrice}"/>원
							</div>			
						</td>
				<c:if test="${i.index==2 or i.index==5 or i.index==8 }">
					</tr>
				</c:if>
       	</c:forEach>
       	</tbody>
       </table>        		
	</div>