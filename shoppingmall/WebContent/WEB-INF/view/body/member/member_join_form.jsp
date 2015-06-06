<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<meta charset="UTF-8">
<style type="text/css">
p {
	text-align: center;
}

.img {
	width: 300px;
	height: 300px;
}

#buyer {
	margin-left: 0px;
}

#seller {
	margin-right: 0px;
}
</style>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript">

</script>
<div style="width:600px;margin: 0 auto">
<a href="<%=request.getContextPath()%>/buyerJoinForm.do" ><img class="img" id="buyer" src="<%=request.getContextPath()%>/image/buyer.png"></a><a href="<%=request.getContextPath()%>/sellerJoinForm.do"><img class="img" id="seller" src="<%=request.getContextPath()%>/image/seller.png"></a>
</div>