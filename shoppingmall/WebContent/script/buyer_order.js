var reg_phone = /^(01[016789]{1}|02|0[3-9]{1}[0-9]{1})-?[0-9]{3,4}-?[0-9]{4}$/;
productList = new Array();
amountList = new Array();
	function payment(){
	 	if($("#test1").is(":checked")){
	 		$("#postcode").val('${sessionScope.loginInfo.address.postcode}');
			$("#addressDetail").val('${sessionScope.loginInfo.address.addressDetails}');
	 	}else if($("#test2").is(":checked")){
	 		$("#postcode").val($("#postcode1").val()+"-"+$("#postcode2").val());
			$("#addressDetail").val($("#address").val()+" "+$("#addressDetails").val());
	 	}
	 	 if($(':radio[name="pay"]:checked').val() == "신용카드"){
	 		 context = $("#scard").val();
	 		 result = $("#installment").val();
	 	 }else{
	 		 context = $("#sbank").val();
	 		 result = $("#account").val();
	 	 }
	 	
		location = "/taommall/auth/payment.do?productId="+'${param.productId}'
         		+"&amount="+'${param.amount}' 
         		+"&name="+$("#name").val()
         		+"&postcode="+($("#postcode").val())
         		+"&addressDetails="+$("#addressDetail").val()
         		+"&phone="+$("#phone").val()
         		+"&context="+context
         		+"&result="+result
         		+"&detail="+$("#detail").val();
	}

	$(document).ready(function(){

		
		
		//주소 입력 여부 체크
		$("#address").keydown(function(){
			$("#addressErr").hide();
		});
		$("#address").blur(function(){
			if(($("#address").val() == "")){
				$("#addressErr").show();
			}else{
				$("#addressErr").hide();
			}
		});
		//상세주소 입력 여부 체크
		$("#addressDetails").keydown(function(){
			$("#addressErr").hide();
		});
		$("#addressDetails").blur(function(){
			if(($("#addressDetails").val() == "")){
				$("#addressErr").show();
			}else{
				$("#addressErr").hide();
			}
		});
		//연락처 입력 여부 체크
		$("#phone").keydown(function(){
			$("#phoneErr").hide();
		});
/* 		$("#phone").blur(function(){
			
			if(reg_phone.test($("#phone").val())===false){
				$("#phoneErr").show().html("휴대전화 형식에 맞게 입력하세요.").attr('style', "color:red");
			}
			
			if(($("#phone").val() == "")){
				$("#phoneErr").show();
			}else{
				$("#phoneErr").hide();
			}
		}); */
		
		
		$("#phone").blur(function(){	
			if(reg_phone.test($("#phone").val())===false){
				$("#phoneErr").show().html("휴대전화 형식에 맞게 입력하세요.").attr('style', "color:red");
				$("#phone").val('');
				$("#phone").focus();
				return false;
			}
			if($("#phone").val().trim()==''){
				$("#phoneErr").show().html("필수 정보입니다").attr('style', "color:red");
				$("#phone").val('');
				return false;
			}else{	
				$("#phoneErr").html('').hide();
			}
		});

		
		if(reg_phone.test($("#phone").val())===false){
			$("#phoneErr").show().html("휴대전화 형식에 맞게 입력하세요.").attr('style', "color:red");
			return false;
		}
		
		
		
		$("select").change(function(){
		
			if($("select option:selected").attr("id")!="op1"){				
				$("#detail").val($("select option:selected").val());
			}else{
				$("#detail").val('');
				$("#detail").focus();
			}
		});

		
		//결제시 결제팝업창 추가
		$("#orderpopup").on("click",function(){
			
		 	if($("#test1").is(":checked")){
		 		$("#postcode").val('${sessionScope.loginInfo.address.postcode}');
				$("#addressDetail").val('${sessionScope.loginInfo.address.addressDetails}');
		 	}else if($("#test2").is(":checked")){
		 		$("#postcode").val($("#postcode1").val()+"-"+$("#postcode2").val());
				$("#addressDetail").val($("#address").val()+" "+$("#addressDetails").val());
				
				// 결제시 필수 입력 필드 체크
				//받는분 이름
				if($("#name").val().trim() == ""){
					$("#name").focus();
					return false;
				}
				//받는분 주소
				if($("#address").val().trim() == ""){
					$("#address").prop("readonly", true);
					$("#addressErr").show();
					return false;
				}
				//받는분 상세주소
				if($("#addressDetails").val().trim() == ""){
					$("#addressDetails").focus();
					$("#addressErr").show();
					return false;
				}
				//받는분 연락처
				if($("#phone").val().trim() == ""){
					$("#phone").focus();
					$("#phoneErr").show();
					return false;
				}
		 	}
			
		 	//팝업start
		 	  cw=screen.availWidth;     //화면 넓이
	          ch=screen.availHeight;    //화면 높이
	          
	          card = $("#scard").val();
	          bank = $("#sbank").val();
	          installment = $("#installment").val();
	          
	          sw=700;    //띄울 창의 넓이
	          sh=450;    //띄울 창의 높이

	          ml=(cw-sw)/2;        //가운데 띄우기위한 창의 x위치
	          mt=(ch-sh)/2;         //가운데 띄우기위한 창의 y위치
	          
	          
	          addtype = $(':radio[name="delivery"]:checked').val();	//배송지 선택여부(기본주소 or 새로입력)
	          name = $("#name").val();		//받는사람 이름!
	          phone = $("#phone").val();	//연락처
	          
	          //alert($(':radio[name="delivery"]:checked').val());
	          //alert($(':radio[name="pay"]:checked').val());
	          
	          
	          //결제방식 [신용카드] 선택한 경우 카드선택을 했는지 체크 후 팝업창 open!!
	          if($(':radio[name="pay"]:checked').val() == "신용카드"){
	 	          if($("#scard").val() == "카드선택"){
		        	  alert("카드를 선택하세요");
		        	  return false;       
	 	          }else{
	 	        	 window.open('/taommall/auth/orderInfo.do?card='+card+
	 	        			 		'&bank='+bank+
	 	        			 		'&addtype='+addtype+
	 	        			 		'&installment='+installment+
	 	        			 		'&name='+$("#name").val()+
	 	        			 		'&phone='+$("#phone").val()+
	 	        			 		'&postcode='+($("#postcode").val())+
	 	        			 		'&productId='+'${param.productId}'+
	 	        			 		'&amount='+'${param.amount}'+
	 	        			 		'&addressDetails='+$("#addressDetail").val(),'tst','width='+sw+',height='+sh+',top='+mt+',left='+ml+',resizable=no,scrollbars=yes');
	 	          }
			  }
	          
	        //결제방식 [무통장입금] 선택한 경우 은행선택을 했는지 체크 후 팝업창 open!!
	          if($(':radio[name="pay"]:checked').val() == "무통장입금"){
	 	          if($("#sbank").val() == "은행선택"){
		        	  alert("은행 선택하세요");
		        	  return false;       
	 	          }else{
		 	        	 window.open('/taommall/auth/orderInfo.do?card='+card+
									 '&bank='+bank+
									 '&addtype='+addtype+
									 '&installment='+installment+
									 '&name='+$("#name").val()+
									 '&phone='+$("#phone").val()+
									 '&postcode='+($("#postcode").val())+
		 	        			 	 '&productId='+'${param.productId}'+
		 	        			 	 '&amount='+'${param.productId}'+
									 '&accountName='+($("#accountName").attr("value"))+
									 '&addressDetails='+$("#addressDetail").val(),'tst','width='+sw+',height='+sh+',top='+mt+',left='+ml+',resizable=no,scrollbars=yes');
	 	    	   }
			  }
		});		
		
		//받는사람 정보 배송지 [기본주소] 선택시
		$("#test1").on("click",function(){

 			$("#nameErr").hide();
			$("#postcode").val();
			$("#addressDetail").val($("#address").val()+" "+$("#addressDetails").val());
			$("#addr1").html($("#oiginalAddr").text());
			$("#addr1").show();
			$("#addr2").hide();
			$("#name").prop("readonly", true).val('${sessionScope.loginInfo.name}');
			$("#phone").prop("readonly", true).val('${sessionScope.loginInfo.phone}');
			$("#postcode1").val('');
			
		});
		
		//주문 상세내역 페이지 열릴때 onload()
		$(window).load(function(){
			$("#payType1").show();
			$("#payType2").hide();
			$("#nameErr").hide();
		});
		
		//결제방식 : 신용카드
		$(':radio[name="pay"]').on("click",function(){
			if($(this).val()=="신용카드"){
				$("#payType1").show();
				$("#payType2").hide();
				$("#sbank").val('은행선택');
			}else if($(this).val()=="무통장입금"){
				$("#payType2").show();
				$("#payType1").hide();
				$("#scard").val('카드선택');
			}
		});
	});
	
	//받는사람 정보 배송지 [새로입력] 선택시
	$(document).ready(function(){
		$("#test2").on("click",function(){

			$("#addr2").show();
			$("#addr1").hide();
 			$("#name").prop("readonly", false).val("");
 			
 			$("#name").focus();
 				$("#name").keydown(function(){
 					$("#nameErr").hide();
 				});
 				
 				$("#name").blur(function(){		
 					if($("#name").val().trim()==''){
 						$("#nameErr").show().html("필수 정보입니다").attr('style', "color:red");
 						$("#name").val('');
 					return false;
 				}else{
 					$("#nameErr").html('').hide();
 				}
 			});
			$("#address").prop("readonly", false).val("");
			$("#phone").prop("readonly", false).val("");
			$("#postcode1").val('');
			$("#postcode2").val('');
			$("#addressDetails").val('');
		});
	});
	
	