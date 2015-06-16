<%@ page import="kr.co.taommall.account.vo.Seller"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/buyer_info.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery.js"></script>
<script type="text/javascript" src="http://dmaps.daum.net/map_js_init/postcode.v2.js" ></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/address.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/script/seller_info.js"></script>
<div>
	<fieldset style="border:none; width:70%;margin: 0 auto">
		<table class="tbl_model">
		<colgroup>
		<col style="width:22%"><col>
		</colgroup>
		<tbody>
		<tr>
			<th scope="row">
				<div class="thcell">
				   사용자 이름
				</div>
			</th>
			<td>
				<div class="tdcell">
					<p class="contxt_tit">${sessionScope.loginInfo.name}</p>
				</div>
			</td>
		</tr>
		<tr>
			<th scope="row">
				<div class="thcell">
				     	 비밀번호
				     </div>
			</th>
			<td>
				<div class="tdcell">
					<p id="password" class="contxt_tit">
						<c:if test="${sessionScope.loginInfo != null }">
						<% int length =((Seller)session.getAttribute("loginInfo")).getPassword().length();%>
					 	<c:forEach begin="1" end="<%=length%>">*</c:forEach>
					 	</c:if>
					 	<span id="notify"> </span>
					</p>
							<p class="btn_area_btm">
								<a href="javascript:password()" class="btn_model"><b>비밀번호 변경</b></a>
							</p>
						<div id="passwordDetail" style="display:none;">
						<div>
							<input type="password" id="currentPassword" placeholder="현재 비밀번호">
							<span id="cpasswordErr" class="error" style="display: none">비밀번호가 틀렸습니다.</span>		
						</div>
						<div>
							<input type="password" id="newPassword" placeholder="새 비밀번호">
							<span id="passwordErr" class="error" style="display: none">비밀번호가 틀렸습니다.</span>
						</div>
						<div>
							<input type="password" id="newPasswordConfirm" placeholder="새 비밀번호 확인">
							<span id="pconfirmErr" class="error" style="display: none">비밀번호가 틀렸습니다.</span>
						</div>
						<p>
						<button id="passwordConfirm">수정</button>
						<button id="passwordCancel">수정취소</button>
						</p>
						</div>
							
					
				</div>
			</td>	
		</tr>
		<tr>
			<th scope="row">
				<div class="thcell">
				     	  휴대전화
				     </div>
			</th>
			<td>
				<div class="tdcell">
					<p id="phoneId" class="contxt_tit">${sessionScope.loginInfo.phone}</p>
							<p class="btn_area_btm">
								<a href="javascript:phone()" class="btn_model"><b>휴대전화 변경</b></a>
							</p>
				<div id="phoneDetail" style="display:none;">
						<div>
							<input type="text" id="phone" placeholder="${sessionScope.loginInfo.phone}">
							<span id="phoneErr" class="error" style="display: none">필수입력 사항입니다.</span>		
						</div>

						<p>
						<button id="phoneConfirm">수정</button>
						<button id="phoneCancel">수정취소</button>
						</p>
				</div>
						
				</div>
			</td>
		</tr>
		<tr>
			<th scope="row">
				<div class="thcell">
				     	  이메일
				     </div>
			</th>
			<td>
				<div class="tdcell">
					<p id="emailId" class="contxt_tit">${sessionScope.loginInfo.email}</p>
							<p class="btn_area_btm">
								<a id="emailBtn" href="javascript:email()" class="btn_model"><b>이메일 변경</b></a>
							</p>
					<div id="emailDetail" style="display:none;">
						<div>
							<input type="text" id="email" placeholder="${sessionScope.loginInfo.email}">
							<span id="emailErr" class="error" style="display: none">필수입력 사항입니다.</span>		
						</div>

						<p>
						<button id="emailConfirm">수정</button>
						<button id="emailCancel">수정취소</button>
						</p>
				</div>
				</div>
			</td>
		</tr>
		<tr>
			<th scope="row">
				<div class="thcell">
				     	  주소
				     </div>
			</th>
			<td>
				<div class="tdcell">

					<p id="postcodeId" class="contxt_tit">${sessionScope.loginInfo.address.postcode}</p>
					<p id="addressId" class="contxt_tit">${sessionScope.loginInfo.address.addressDetails}</p>
							<p class="btn_area_btm">
								<a href="javascript:address()" class="btn_model"><b>주소 변경</b></a>
							</p>
				<div id="addressDetail" style="display:none;">
			<div>
					<input type="text" id="postcode1" readonly="readonly" class="d_form mini" size="4" maxlength="3"> - <input
					type="text" id="postcode2" readonly="readonly" class="d_form mini" size="4"	maxlength="3"> 
					<input type="button" id="addressBtn" value="우편번호 찾기" class="d_btn"><br>
					<input type="text" id="address" class="d_form std" placeholder="주소" readonly="readonly" size="40"> 
					<input type="text" id="addressDetails" class="d_form" placeholder="상세주소" size="30">								
					<span id="addressErr" class="error" style="display: none">필수입력 사항입니다.</span>		
			</div>
						<p>
						<button id="addressConfirm">수정</button>
						<button id="addressCancel">수정취소</button>
						</p>
				</div>
				</div>
			</td>
		</tr>
		<tr>
			<th scope="row">
				<div class="thcell">
				     	  사업자 등록번호
				     </div>
			</th>
			<td>
				<div class="tdcell">
					<p id="corporateNumberId" class="contxt_tit">${sessionScope.loginInfo.corporateNumber}</p>
				</div>
			</td>
		</tr>
		</tbody>
		</table>	
	</fieldset>		
</div>