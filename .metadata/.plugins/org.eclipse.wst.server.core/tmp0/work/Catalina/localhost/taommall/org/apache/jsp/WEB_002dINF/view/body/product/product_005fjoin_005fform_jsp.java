/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-05-28 06:13:07 UTC
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
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${initParam.rootPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/script/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${initParam.rootPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/script/date_picker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t$(\"#registerBtn\").on(\"click\",function(){\r\n");
      out.write("\t\t\talert($(\"form\").serialize());\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${initParam.rootPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/auth/product/insert.do\",\r\n");
      out.write("\t\t\t\ttype:\"POST\",\r\n");
      out.write("\t\t\t\tdataType:\"JSON\",\r\n");
      out.write("\t\t\t\tdata:$(\"form\").serialize(),\r\n");
      out.write("\t\t\t\tsuccess:function(txt){\r\n");
      out.write("\t\t\t\t\talert(\"try\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\talert(\"3\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<h2> 상 품 등 록 </h2>\r\n");
      out.write("\r\n");
      out.write("<form>\r\n");
      out.write("\t<input type=\"text\" name=\"productName\" placeholder=\"상품이름\"/><br>\r\n");
      out.write("\t<input type=\"number\" name=\"productPrice\" placeholder=\"상품가격\"/><br>\r\n");
      out.write("\t상품 분류 : \r\n");
      out.write("\t<select name=\"category\" id=\"category\">\r\n");
      out.write("\t\t<option value=\"food\">농/수/축산물</option>\r\n");
      out.write("\t\t<option value=\"fruit\">과일/채소</option>\r\n");
      out.write("\t\t<option value=\"health\">건강식품</option>\r\n");
      out.write("\t\t<option value=\"snack\">간식</option>\r\n");
      out.write("\t</select><br>\r\n");
      out.write("\t<textarea name=\"productInfo\" rows=\"50\" cols=\"200\" placeholder=\"상품 정보\"></textarea><br>\r\n");
      out.write("\t<input type=\"file\" name=\"imagePath\"/><br>\r\n");
      out.write("\t<input type=\"text\" name=\"expDate\">\r\n");
      out.write("\t<input type=\"button\" value=\"유통기한\" onClick=\"datePicker(event,'expDate')\"><br>\r\n");
      out.write("\t\r\n");
      out.write("\t<input type=\"hidden\" name=\"command\" value=\"joinProduct\"/>\r\n");
      out.write("\t<input type=\"hidden\" name=\"SellerId\" value=\"seller-1\"/> <!-- 테스트용 임시 파라미터 -->\r\n");
      out.write("\t\r\n");
      out.write("\t<button id=\"registerBtn\">상품등록</button>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
