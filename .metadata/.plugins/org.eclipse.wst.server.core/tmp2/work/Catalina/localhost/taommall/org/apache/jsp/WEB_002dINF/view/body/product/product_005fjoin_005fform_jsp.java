/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-06-13 01:51:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.body.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_005fjoin_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/script/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/script/date_picker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t$(\"#registerBtn\").on(\"click\",function(){\r\n");
      out.write("\t\t\tif($(\"#productId\").val().trim()=='' ||\r\n");
      out.write("\t\t\t\t\t$(\"#productPrice\").val().trim()=='' ||\r\n");
      out.write("\t\t\t\t\t$(\"#productInfo\").val().trim()=='' ||\r\n");
      out.write("\t\t\t\t\t$(\"#upfile\").val().trim()=='' ||\r\n");
      out.write("\t\t\t\t\t$(\"#expDate\").val().trim()=='' ){\r\n");
      out.write("\t\t\t\t\talert(\"입력정보를 확인하세요\");\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#upfile\").on(\"change\",function(){\r\n");
      out.write("\t\t\tvar path = $(this).val();\t\t\t\r\n");
      out.write("\t\t\tvar leng = path.length;\r\n");
      out.write("\t\t\tvar txt = path.substr(leng-3,3);\r\n");
      out.write("\t\t\tdocument.e\r\n");
      out.write("\t\t\tif((txt != \"jpg\") && (txt != \"peg\") && (txt != \"png\") && (txt != \"gif\") && (txt != \"bmp\")){\r\n");
      out.write("\t\t\t\talert(\"jpg, jpeg, png, gif 파일만 등록 가능합니다.\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(\"#infoUpfile\").on(\"change\",function(){\r\n");
      out.write("\t\t\tvar path = $(this).val();\t\t\t\r\n");
      out.write("\t\t\tvar leng = path.length;\r\n");
      out.write("\t\t\tvar txt = path.substr(leng-3,3);\r\n");
      out.write("\t\t\tif((txt != \"jpg\") && (txt != \"peg\") && (txt != \"png\") && (txt != \"gif\") && (txt != \"bmp\")){\r\n");
      out.write("\t\t\t\talert(\"jpg, jpeg, png, gif 파일만 등록 가능합니다.\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<style>\n");
      out.write("#join_form input{\r\n");
      out.write("\tmargin-top: 2px;\r\n");
      out.write("\tmargin-bottom: 2px;\r\n");
      out.write("}\n");
      out.write("</style>\r\n");
      out.write("<div style=\"width: 700px;margin:0 auto\">\r\n");
      out.write("<h2 style=\"text-align: center\"> 상 품 등 록 </h2>\r\n");
      out.write("\t<div id=\"join_form\" style=\"width:300px;margin:0 auto;text-align: left\">\r\n");
      out.write("\t\t<form action=\"insertProduct.do\" method=\"POST\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"productName\" name=\"productName\" placeholder=\"상품이름\" maxlength=\"50\" required=\"required\"/><br>\r\n");
      out.write("\t\t\t<input type=\"number\" id=\"productPrice\" name=\"productPrice\" placeholder=\"상품가격\" required=\"required\"/><br>\r\n");
      out.write("\t\t\t상품 분류 : \r\n");
      out.write("\t\t\t<select name=\"category\" id=\"category\">\r\n");
      out.write("\t\t\t\t<option value=\"food\" selected=\"selected\">농/수/축산물</option>\r\n");
      out.write("\t\t\t\t<option value=\"fruit\">과일/채소</option>\r\n");
      out.write("\t\t\t\t<option value=\"health\">건강식품</option>\r\n");
      out.write("\t\t\t\t<option value=\"snack\">간식</option>\r\n");
      out.write("\t\t\t</select><br>\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"productInfo\" name=\"productInfo\" placeholder=\"상품 요약 정보\" required=\"required\"><br>\r\n");
      out.write("\t\t\t상품 사진 : <input type=\"file\" id=\"upfile\" name=\"upfile\"/><br>\r\n");
      out.write("\t\t\t상품 정보 : <input type=\"file\" id=\"infoUpfile\" name=\"infoUpfile\"/><br>\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"expDate\" name=\"expDate\" readonly=\"readonly\" required=\"required\">\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"유통기한\" onClick=\"datePicker(event,'expDate')\"><br>\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"SellerId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginInfo.sellerId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/><p>\r\n");
      out.write("\t\t\t<input type=\"submit\" id=\"registerBtn\" value=\"상품등록\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
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
}
