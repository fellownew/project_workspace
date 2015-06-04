<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		</script>	

    <body>
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
        
		<div id="productTable" style="width:900px;margin:0auto">
	
			<div style="width:280px;height:300px ;margin:0auto;float:left;border-style:solid; ;border-color: blue;">상품 1</div>
			<div style="width:280px;height:300px ;margin:0auto;float:left;border-style:solid; ;border-color: blue;">상품 2</div>
			<div style="width:280px;height:300px ;margin:0auto;float:left;border-style:solid; ;border-color: blue;">상품 3</div>
			<div style="width:280px;height:300px ;margin:0auto;float:left;border-style:solid; ;border-color: blue;">상품 4</div>
			<div style="width:280px;height:300px ;margin:0auto;float:left;border-style:solid; ;border-color: blue;">상품 5</div>
			<div style="width:280px;height:300px ;margin:0auto;float:left;border-style:solid; ;border-color: blue;">상품 6</div>
			<div style="width:280px;height:300px ;margin:0auto;float:left;border-style:solid; ;border-color: blue;">상품 7</div>
			<div style="width:280px;height:300px ;margin:0auto;float:left;border-style:solid; ;border-color: blue;">상품 8</div>
			<div style="width:280px;height:300px ;margin:0auto;float:left;border-style:solid; ;border-color: blue;">상품 9</div>
		</div>
		
    </body>