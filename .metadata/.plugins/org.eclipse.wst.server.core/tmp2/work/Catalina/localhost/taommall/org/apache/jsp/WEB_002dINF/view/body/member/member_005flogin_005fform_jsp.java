/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-06-11 04:17:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.body.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class member_005flogin_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/buyer.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/script/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/script/member_login.js\"></script>\r\n");
      out.write("\r\n");
      out.write(" <div id=\"container\" style=\"width:300px;margin:0 auto;\">\r\n");
      out.write("    <ul class=\"tabs\">\r\n");
      out.write("        <li class=\"active\" rel=\"blog\">구매자</li>\r\n");
      out.write("        <li rel=\"slog\">판매자</li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <div class=\"tab_container\">\r\n");
      out.write("        <div id=\"blog\" class=\"tab_content\">\r\n");
      out.write("            <form action=\"");
      out.print(request.getContextPath());
      out.write("/mainPage.do\" class=\"loginForm\" id=\"buyerLogin\" method=\"post\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t<input type=\"text\" name=\"bId\" id=\"bId\" placeholder=\"구매자아이디\" class=\"loginInput\">\r\n");
      out.write("\t\t<span id=\"bIdErr\" class=\"error\" style=\"display:none\">아이디를 입력해주세요.</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t<input type=\"password\" name=\"bPassword\" id=\"bPassword\" placeholder=\"비밀번호\" class=\"loginInput\">\r\n");
      out.write("\t\t<span id=\"bPasswordErr\" class=\"error\" style=\"display:none\">비밀번호를 입력해주세요.</span> \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t<span id=\"bLoginError\" class=\"error\" style=\"display:none\">아이디 또는 비밀번호를 다시 확인하세요.<br> 등록되지 않은 아이디이거나, 아이디 또는 비밀번호를 잘못 입력하셨습니다.<br></span> \r\n");
      out.write("\t\t<input type=\"button\" id=\"bButton\" value=\"전송\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- #tab1 -->\r\n");
      out.write("        <div id=\"slog\" class=\"tab_content\">\r\n");
      out.write("        <form action=\"");
      out.print(request.getContextPath());
      out.write("/mainPage.do\" class=\"loginForm\" id=\"sellerLogin\" method=\"post\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t<input type=\"text\" name=\"sId\" id=\"sId\" placeholder=\"판매자아이디\" class=\"loginInput\">\r\n");
      out.write("\t\t<span id=\"sIdErr\" class=\"error\" style=\"display:none\">아이디를 입력해주세요.</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t<input type=\"password\" name=\"sPassword\" id=\"sPassword\" placeholder=\"비밀번호\"class=\"loginInput\">\r\n");
      out.write("\t\t<span id=\"sPasswordErr\" class=\"error\" style=\"display:none\">비밀번호를 입력해주세요.</span> \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t<span id=\"sLoginError\" class=\"error\" style=\"display:none\">아이디 또는 비밀번호를 다시 확인하세요.<br> 등록되지 않은 아이디이거나, 아이디 또는 비밀번호를 잘못 입력하셨습니다.<br></span>\r\n");
      out.write("\t\t<input type=\"button\" id=\"sButton\" value=\"전송\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>    \r\n");
      out.write("      \r\n");
      out.write("       </div>\r\n");
      out.write("        <!-- #tab2 -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- .tab_container -->\r\n");
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
