/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-06-15 07:58:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.body.buyer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class buyer_005forder_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/order.css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write(".error {\r\n");
      out.write("\tmargin: 3px 0 3px 1px;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tcolor: #f00\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\t\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/script/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://dmaps.daum.net/map_js_init/postcode.v2.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/script/address.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\tfunction payment(){\r\n");
      out.write("\t \tif($(\"#test1\").is(\":checked\")){\r\n");
      out.write("\t \t\t$(\"#postcode\").val('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginInfo.address.postcode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("\t\t\t$(\"#addressDetail\").val('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginInfo.address.addressDetails}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("\t \t}else if($(\"#test2\").is(\":checked\")){\r\n");
      out.write("\t \t\t$(\"#postcode\").val($(\"#postcode1\").val()+\"-\"+$(\"#postcode2\").val());\r\n");
      out.write("\t\t\t$(\"#addressDetail\").val($(\"#address\").val()+\" \"+$(\"#addressDetails\").val());\r\n");
      out.write("\t \t}\r\n");
      out.write("\t \t\r\n");
      out.write("\t\tlocation = \"");
      out.print(request.getContextPath() );
      out.write("/auth/payment.do?productId=\"+'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.productId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("'\r\n");
      out.write("         \t\t+\"&amount=\"+'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.amount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("'\r\n");
      out.write("         \t\t+\"&name=\"+$(\"#name\").val()\r\n");
      out.write("         \t\t+\"&postcode=\"+($(\"#postcode\").val())\r\n");
      out.write("         \t\t+\"&addressDetails=\"+$(\"#addressDetail\").val()\r\n");
      out.write("         \t\t+\"&phone=\"+$(\"#phone\").val()\r\n");
      out.write("         \t\t+\"&detail=\"+$(\"#detail\").val();\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\talert('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.list}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"select\").change(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\tif($(\"select option:selected\").attr(\"id\")!=\"op1\"){\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#detail\").val($(\"select option:selected\").val());\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$(\"#detail\").val('');\r\n");
      out.write("\t\t\t\t$(\"#detail\").focus();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\t//결제시 결제팝업창 추가\r\n");
      out.write("\t\t$(\"#orderpopup\").on(\"click\",function(){\r\n");
      out.write("\t\t\t");
 request.setAttribute("abcd", request.getAttribute("list")); 
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t \tif($(\"#test1\").is(\":checked\")){\r\n");
      out.write("\t\t \t\t$(\"#postcode\").val('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginInfo.address.postcode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("\t\t\t\t$(\"#addressDetail\").val('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginInfo.address.addressDetails}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("\t\t \t}else if($(\"#test2\").is(\":checked\")){\r\n");
      out.write("\t\t \t\t$(\"#postcode\").val($(\"#postcode1\").val()+\"-\"+$(\"#postcode2\").val());\r\n");
      out.write("\t\t\t\t$(\"#addressDetail\").val($(\"#address\").val()+\" \"+$(\"#addressDetails\").val());\r\n");
      out.write("\t\t \t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t \t//팝업start\r\n");
      out.write("\t\t \t  cw=screen.availWidth;     //화면 넓이\r\n");
      out.write("\t          ch=screen.availHeight;    //화면 높이\r\n");
      out.write("\t          \r\n");
      out.write("\t          card = $(\"#scard\").val();\r\n");
      out.write("\t          bank = $(\"#sbank\").val();\r\n");
      out.write("\t          installment = $(\"#installment\").val();\r\n");
      out.write("\t          \r\n");
      out.write("\t          sw=500;    //띄울 창의 넓이\r\n");
      out.write("\t          sh=450;    //띄울 창의 높이\r\n");
      out.write("\r\n");
      out.write("\t          ml=(cw-sw)/2;        //가운데 띄우기위한 창의 x위치\r\n");
      out.write("\t          mt=(ch-sh)/2;         //가운데 띄우기위한 창의 y위치\r\n");
      out.write("\t          \r\n");
      out.write("\t          \r\n");
      out.write("\t          addtype = $(':radio[name=\"delivery\"]:checked').val();\t//배송지 선택여부(기본주소 or 새로입력)\r\n");
      out.write("\t          name = $(\"#name\").val();\t\t//받는사람 이름!\r\n");
      out.write("\t          phone = $(\"#phone\").val();\t//연락처\r\n");
      out.write("\t          \r\n");
      out.write("\t          //alert($(':radio[name=\"delivery\"]:checked').val());\r\n");
      out.write("\t          //alert($(':radio[name=\"pay\"]:checked').val());\r\n");
      out.write("\t          \r\n");
      out.write("\t          \r\n");
      out.write("\t          //결제방식 [신용카드] 선택한 경우 카드선택을 했는지 체크 후 팝업창 open!!\r\n");
      out.write("\t          if($(':radio[name=\"pay\"]:checked').val() == \"신용카드\"){\r\n");
      out.write("\t \t          if($(\"#scard\").val() == \"카드선택\"){\r\n");
      out.write("\t\t        \t  alert(\"카드를 선택하세요\");\r\n");
      out.write("\t\t        \t  return false;       \r\n");
      out.write("\t \t          }else{\r\n");
      out.write("\t \t        \t window.open('");
      out.print(request.getContextPath() );
      out.write("/orderPopup.do?card='+card+\r\n");
      out.write("\t \t        \t\t\t \t\t'&bank='+bank+\r\n");
      out.write("\t \t        \t\t\t \t\t'&addtype='+addtype+\r\n");
      out.write("\t \t        \t\t\t \t\t'&installment='+installment+\r\n");
      out.write("\t \t        \t\t\t \t\t'&name='+$(\"#name\").val()+\r\n");
      out.write("\t \t        \t\t\t \t\t'&phone='+$(\"#phone\").val()+\r\n");
      out.write("\t \t        \t\t\t \t\t'&postcode='+($(\"#postcode\").val())+\r\n");
      out.write("\t \t        \t\t\t \t\t'&addressDetails='+$(\"#addressDetail\").val(),'tst','width='+sw+',height='+sh+',top='+mt+',left='+ml+',resizable=no,scrollbars=yes');\r\n");
      out.write("\t \t          }\r\n");
      out.write("\t\t\t  }\r\n");
      out.write("\t          \r\n");
      out.write("\t        //결제방식 [무통장입금] 선택한 경우 은행선택을 했는지 체크 후 팝업창 open!!\r\n");
      out.write("\t          if($(':radio[name=\"pay\"]:checked').val() == \"무통장입금\"){\r\n");
      out.write("\t \t          if($(\"#sbank\").val() == \"은행선택\"){\r\n");
      out.write("\t\t        \t  alert(\"은행 선택하세요\");\r\n");
      out.write("\t\t        \t  return false;       \r\n");
      out.write("\t \t          }else{\r\n");
      out.write("\t\t \t        \t window.open('");
      out.print(request.getContextPath() );
      out.write("/orderPopup.do?card='+card+\r\n");
      out.write("\t\t\t\t\t\t\t\t\t '&bank='+bank+\r\n");
      out.write("\t\t\t\t\t\t\t\t\t '&addtype='+addtype+\r\n");
      out.write("\t\t\t\t\t\t\t\t\t '&installment='+installment+\r\n");
      out.write("\t\t\t\t\t\t\t\t\t '&name='+$(\"#name\").val()+\r\n");
      out.write("\t\t\t\t\t\t\t\t\t '&phone='+$(\"#phone\").val()+\r\n");
      out.write("\t\t\t\t\t\t\t\t\t '&postcode='+($(\"#postcode\").val())+\r\n");
      out.write("\t\t\t\t\t\t\t\t\t '&addressDetails='+$(\"#addressDetail\").val(),'tst','width='+sw+',height='+sh+',top='+mt+',left='+ml+',resizable=no,scrollbars=yes');\r\n");
      out.write("\t \t        \t //window.open('");
      out.print(request.getContextPath() );
      out.write("/orderPopup.do?card='+card+'&bank='+bank+'&installment='+installment,'tst','width='+sw+',height='+sh+',top='+mt+',left='+ml+',resizable=no,scrollbars=yes');\r\n");
      out.write("\t \t          }\r\n");
      out.write("\t\t\t  }\r\n");
      out.write("\t\t});\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#test1\").on(\"click\",function(){\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(\"#postcode\").val();\r\n");
      out.write("\t\t\t$(\"#addressDetail\").val($(\"#address\").val()+\" \"+$(\"#addressDetails\").val());\r\n");
      out.write("\t\t\t$(\"#addr1\").html($(\"#oiginalAddr\").text());\r\n");
      out.write("\t\t\t$(\"#addr1\").show();\r\n");
      out.write("\t\t\t$(\"#addr2\").hide();\r\n");
      out.write("\t\t\t$(\"\")\r\n");
      out.write("\t\t\t$(\"#name\").prop(\"readonly\", true).val('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginInfo.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("\t\t\t$(\"#phone\").prop(\"readonly\", true).val('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginInfo.phone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("\t\t\t$(\"#postcode1\").val('');\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//주문 상세내역 페이지 열릴때 onload()\r\n");
      out.write("\t\t$(window).load(function(){\r\n");
      out.write("\t\t\t$(\"#payType1\").show();\r\n");
      out.write("\t\t\t$(\"#payType2\").hide();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//결제방식 : 신용카드\r\n");
      out.write("\t\t$(':radio[name=\"pay\"]').on(\"click\",function(){\r\n");
      out.write("\t\t\tif($(this).val()==\"신용카드\"){\r\n");
      out.write("\t\t\t\t$(\"#payType1\").show();\r\n");
      out.write("\t\t\t\t$(\"#payType2\").hide();\r\n");
      out.write("\t\t\t\t$(\"#sbank\").val('은행선택');\r\n");
      out.write("\t\t\t}else if($(this).val()==\"무통장입금\"){\r\n");
      out.write("\t\t\t\t$(\"#payType2\").show();\r\n");
      out.write("\t\t\t\t$(\"#payType1\").hide();\r\n");
      out.write("\t\t\t\t$(\"#scard\").val('카드선택');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t$(\"#test2\").on(\"click\",function(){\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(\"#addr2\").show();\r\n");
      out.write("\t\t\t$(\"#addr1\").hide();\r\n");
      out.write(" \t\t\t$(\"#name\").prop(\"readonly\", false).val(\"\");\r\n");
      out.write("\t\t\t$(\"#address\").prop(\"readonly\", false).val(\"\");\r\n");
      out.write("\t\t\t$(\"#phone\").prop(\"readonly\", false).val(\"\");\r\n");
      out.write("\t\t\t$(\"#postcode1\").val('');\r\n");
      out.write("\t\t\t$(\"#postcode2\").val('');\r\n");
      out.write("\t\t\t$(\"#addressDetails\").val('');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!-- \t<fieldset style=\"height:500px\"> -->\r\n");
      out.write("\t<table class=\"center\" >\r\n");
      out.write("\t\t<colgroup>\r\n");
      out.write("\t\t\t\t<col width=\"40%\"> \r\n");
      out.write("\t\t\t\t<col width=\"13%\">\r\n");
      out.write("\t\t\t\t<col width=\"10%\"> \r\n");
      out.write("\t\t\t\t<col width=\"12%\">\r\n");
      out.write("\t\t\t\t<col width=\"15%\"> \r\n");
      out.write("\t\t</colgroup>\r\n");
      out.write("\t\t<caption style=\"text-align:left; font-weight:bold; font-size:20px\" >주문상품 확인</caption>\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th style=\" width=150px\">상품 정보</th>\r\n");
      out.write("\t\t\t\t<th>상품 금액</th>\r\n");
      out.write("\t\t\t\t<th>수량</th>\r\n");
      out.write("\t\t\t\t<th>합계</th>\r\n");
      out.write("\t\t\t\t<th>판매자</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/view/body/buyer/buyer_order_form.jsp(207,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/view/body/buyer/buyer_order_form.jsp(207,2) '${requestScope.list}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${requestScope.list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/view/body/buyer/buyer_order_form.jsp(207,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("cart");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t<td style=\"text-align:left\">\r\n");
            out.write("\t\t\t\t\t<div style=\"float: left\"> \r\n");
            out.write("\t\t\t\t\t<img src=\"");
            out.print(request.getContextPath());
            out.write('/');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cart.product.imagePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("\" style=\"width: 100px;height: 100px; \"/>\r\n");
            out.write("\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t<div class=\"productName\" style=\"padding-left: 120px\"><font size=\"3\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cart.product.productName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</font></div><br>\r\n");
            out.write("\t\t\t\t\t<div class=\"productInfo\" style=\"padding-left: 120px\"><font size=\"2\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cart.product.productInfo }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</font></div>\r\n");
            out.write("\t\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t\t<td style=\"text-align:center\">");
            if (_jspx_meth_fmt_005fformatNumber_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return;
            out.write("원</td>\r\n");
            out.write("\t\t\t\t\t<td style=\"text-align:center\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cart.amount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t<td style=\"text-align:center\">");
            if (_jspx_meth_fmt_005fformatNumber_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return;
            out.write("원</td>\r\n");
            out.write("\t\t\t\t\t<td style=\"text-align:center\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cart.product.sellerId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t</tr> \r\n");
            out.write("\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      }
      out.write("\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<br>\r\n");
      out.write("\r\n");
      out.write("\t<table class=\"center\">\r\n");
      out.write("\t<caption style=\"text-align:left; font-weight:bold; font-size:20px\">구매자 정보</caption>\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th style=\"width:80px; text-align:left\">보내는분</th>\r\n");
      out.write("\t\t\t\t<td style=\"text-align:left\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginInfo.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>주소</th>\r\n");
      out.write("\t\t\t\t<td style=\"text-align:left\" id=\"oiginalAddr\">\r\n");
      out.write("\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginInfo.address.postcode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginInfo.address.addressDetails}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t\t</tr>\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>연락처</th>\r\n");
      out.write("\t\t\t\t<td style=\"text-align:left\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginInfo.phone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t\t</tr>\t\t\t\t\t\t\t\r\n");
      out.write("\t</table><br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t<table class=\"center\">\r\n");
      out.write("\t\t<colgroup>\r\n");
      out.write("\t\t\t\t<col width=\"20%\"> \r\n");
      out.write("\t\t\t\t<col width=\"80%\">\r\n");
      out.write("\t\t</colgroup>\r\n");
      out.write("\t<caption style=\"text-align:left; font-weight:bold; font-size:20px\">받는사람 정보</caption>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th style=\"width:80px\">배송지</th>\r\n");
      out.write("\t\t\t\t<td style=\"text-align:left\">\r\n");
      out.write("\t\t\t\t\t<label><input type=\"radio\" name=\"delivery\" id=\"test1\" value=\"기본주소\" checked=\"checked\">기본주소</label>\r\n");
      out.write("\t\t\t\t\t<label><input type=\"radio\" name=\"delivery\" id=\"test2\" value=\"새로입력\">새로입력</label>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>받는분</th>\r\n");
      out.write("\t\t\t\t<td style=\"text-align:left\"><input type=\"text\" name=\"name\" id=\"name\" readonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginInfo.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t<!-- <td style=\"text-align:left\" id=\"td1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginInfo.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>  -->\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>주소</th>\r\n");
      out.write("\t\t\t\t<td style=\"text-align:left\">\r\n");
      out.write("\t\t\t\t<div id=\"addr1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginInfo.address.postcode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginInfo.address.addressDetails}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t<div id=\"addr2\" style=\"display: none\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"postcode1\" readonly=\"readonly\" class=\"d_form mini\" size=\"4\" maxlength=\"3\"> - <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"text\" id=\"postcode2\" readonly=\"readonly\" class=\"d_form mini\" size=\"4\"\tmaxlength=\"3\"> \r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" id=\"addressBtn\" value=\"우편번호 찾기\" class=\"d_btn\"><br>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"address\" class=\"d_form std\" placeholder=\"주소\" readonly=\"readonly\" size=\"40\"> \r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"addressDetails\" class=\"d_form\" placeholder=\"상세주소\" size=\"30\">\t\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" id=\"postcode\" name=\"postcode\"><input type=\"hidden\" id=\"addressDetail\" name=\"addressDetail\">\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<span id=\"addressErr\" class=\"error\" style=\"display: none\">필수입력 사항입니다.</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<!-- <td style=\"text-align:left\" id=\"td2\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginInfo.address}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>-->\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>연락처</th>\r\n");
      out.write("\t\t\t\t<td style=\"text-align:left\"><input type=\"text\" name=\"phone\" id=\"phone\" readonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginInfo.phone }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t<!-- <td style=\"text-align:left\" id=\"td3\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginInfo.phone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>-->\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>배송 시 요구사항</th>\r\n");
      out.write("\t\t\t\t<td style=\"text-align:left\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"detail\" name=\"detail\" value=\"빠른 배송 부탁드립니다.\" size=\"55\">\r\n");
      out.write(" \t\t\t\t\t<select>\r\n");
      out.write("\t \t\t\t\t\t<option id=\"op1\">직접입력</option>\r\n");
      out.write("\t\t\t\t\t\t<option id=\"op2\">옥상 문 앞에 보관해주세요. 감사합니다.</option>\r\n");
      out.write("\t\t\t\t\t\t<option id=\"op3\">부재시 경비실에 맡겨주세요.</option>\r\n");
      out.write("\t\t\t\t\t\t<option id=\"op4\" selected=\"selected\">빠른 배송 부탁드립니다.</option>\r\n");
      out.write("\t\t\t\t\t\t<option id=\"op5\" >부재시 핸드폰으로 연락바랍니다.</option>\r\n");
      out.write("\t\t\t\t\t\t<option id=\"op6\">배송 전 연락바랍니다.</option>\r\n");
      out.write("\t\t\t\t\t</select> \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table><br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<table class=\"center\">\r\n");
      out.write("\t<caption style=\"text-align:left; font-weight:bold; font-size:20px\">결제 정보 입력</caption>\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th style=\"width:80px; text-align:left\">결제 방식</th>\r\n");
      out.write("\t\t\t\t<td style=\"text-align:left\">\r\n");
      out.write("\t\t\t\t\t<label><input type=\"radio\" name=\"pay\" id=\"pay\" value=\"신용카드\" checked=\"checked\">신용카드</label>\r\n");
      out.write("\t\t\t\t\t<label><input type=\"radio\" name=\"pay\" id=\"pay\" value=\"무통장입금\">무통장입금</label>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr id=\"payType1\">\r\n");
      out.write("\t\t\t\t<th>신용카드/할부 방식</th>\r\n");
      out.write("\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t<select id=\"scard\">\r\n");
      out.write("\t\t\t\t\t\t<option>카드선택</option>\r\n");
      out.write("\t\t\t\t\t\t<option>신한카드</option>\r\n");
      out.write("\t\t\t\t\t\t<option>비씨카드</option>\r\n");
      out.write("\t\t\t\t\t\t<option>우리카드</option>\r\n");
      out.write("\t\t\t\t\t\t<option>국민카드</option>\r\n");
      out.write("\t\t\t\t\t\t<option>삼성카드</option>\r\n");
      out.write("\t\t\t\t\t\t<option>현대카드</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<select id=\"installment\">\r\n");
      out.write("\t\t\t\t\t\t<option>일시불</option>\r\n");
      out.write("\t\t\t\t\t\t<option>2개월 무이자</option>\r\n");
      out.write("\t\t\t\t\t\t<option>3개월 무이자</option>\r\n");
      out.write("\t\t\t\t\t\t<option>4개월 무이자</option>\r\n");
      out.write("\t\t\t\t\t\t<option>5개월 무이자</option>\r\n");
      out.write("\t\t\t\t\t\t<option>6개월 무이자</option>\r\n");
      out.write("\t\t\t\t\t\t<option>7개월 무이자</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\t\r\n");
      out.write("\t\t\t<tr id=\"payType2\">\r\n");
      out.write("\t\t\t\t<th>입금은행</th>\r\n");
      out.write("\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t<select id=\"sbank\">\r\n");
      out.write("\t\t\t\t\t\t<option>은행선택</option>\r\n");
      out.write("\t\t\t\t\t\t<option>신한은행</option>\r\n");
      out.write("\t\t\t\t\t\t<option>우리은행</option>\r\n");
      out.write("\t\t\t\t\t\t<option>국민은행</option>\r\n");
      out.write("\t\t\t\t\t\t<option>기업은행</option>\r\n");
      out.write("\t\t\t\t\t\t<option>하나은행</option>\r\n");
      out.write("\t\t\t\t\t\t<option>외환은행</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\t\t\r\n");
      out.write("\t\t\t<caption style=\"text-align:right\" align=\"bottom\">\r\n");
      out.write("\t\t\t\t<button id=\"orderpopup\">결제하기</button>\r\n");
      out.write("\t\t\t</caption>\t\t\t\t\t\r\n");
      out.write("\t</table><br>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_fmt_005fformatNumber_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_005fformatNumber_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_005fformatNumber_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatNumber_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/view/body/buyer/buyer_order_form.jsp(216,35) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatNumber_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cart.product.productPrice}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatNumber_005f0 = _jspx_th_fmt_005fformatNumber_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatNumber_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fnobody.reuse(_jspx_th_fmt_005fformatNumber_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fnobody.reuse(_jspx_th_fmt_005fformatNumber_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatNumber_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_005fformatNumber_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_005fformatNumber_005f1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatNumber_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/view/body/buyer/buyer_order_form.jsp(218,35) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatNumber_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cart.product.productPrice*cart.amount}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatNumber_005f1 = _jspx_th_fmt_005fformatNumber_005f1.doStartTag();
    if (_jspx_th_fmt_005fformatNumber_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fnobody.reuse(_jspx_th_fmt_005fformatNumber_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fnobody.reuse(_jspx_th_fmt_005fformatNumber_005f1);
    return false;
  }
}
