/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-05-29 06:30:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.body.buyer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class buyer_005fjoin_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>BUYER JOIN</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/buyer.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/script/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/script/buyerjoin.js\" ></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h2>바이어 회원가입</h2>\r\n");
      out.write("\t<form id=\"buyer_form\"\r\n");
      out.write("\t\taction=\"");
      out.print(request.getContextPath());
      out.write("/buyer/buyerJoin.do\" method=\"post\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" id=\"buyerId\" name=\"buyerId\"\r\n");
      out.write("\t\t\t\t\tmaxlength=\"12\" placeholder=\"아이디\" class=\"int\">\r\n");
      out.write("\t\t\t\t\t<div id=\"idErr\" class=\"error\"  style=\"display: none\">필수 정보입니다.</div></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"password\" id=\"password\" name=\"password\"\r\n");
      out.write("\t\t\t\t\tmaxlength=\"16\" placeholder=\"비밀번호\" class=\"int\">\r\n");
      out.write("\t\t\t\t\t<div id=\"passwordErr\" class=\"error\" style=\"display: none\">필수 정보입니다.</div></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"password\" id=\"passwordConfirm\"\r\n");
      out.write("\t\t\t\t\tname=\"passwordConfirm\" maxlength=\"16\" placeholder=\"비밀번호 재확인\"\r\n");
      out.write("\t\t\t\t\tclass=\"int\">\r\n");
      out.write("\t\t\t\t\t<div id=\"pconfirmErr\" class=\"error\"  style=\"display: none\">필수 정보입니다.</div></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" id=\"name\" name=\"name\" maxlength=\"12\"\r\n");
      out.write("\t\t\t\t\tplaceholder=\"이름\" class=\"int\">\r\n");
      out.write("\t\t\t\t\t<div id=\"nameErr\" class=\"error\"  style=\"display: none\">필수 정보입니다.</div></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" id=\"address\" name=\"address\"\r\n");
      out.write("\t\t\t\t\tplaceholder=\"주소\" class=\"int\">\r\n");
      out.write("\t\t\t\t\t<div id=\"addressErr\" class=\"error\"  style=\"display: none\">필수 정보입니다.</div></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" id=\"phone\" name=\"phone\" maxlength=\"12\"\r\n");
      out.write("\t\t\t\t\tplaceholder=\"핸드폰 번호\" class=\"int\">\r\n");
      out.write("\t\t\t\t\t<div id=\"phoneErr\" class=\"error\"  style=\"display: none\">필수 정보입니다.</div></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" id=\"email\" name=\"email\" \r\n");
      out.write("\t\t\t\t\tplaceholder=\"이메일\" class=\"int2\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" id =\"emailBtn\">인증</button>\r\n");
      out.write("\t\t\t\t\t<div id=\"emailErr\" class=\"error\" style=\"display: none\">필수 정보입니다.</div></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" id=\"code\" name=\"code\" maxlength=\"12\"\r\n");
      out.write("\t\t\t\t\tplaceholder=\"인증번호\" class=\"int2\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" id=\"codeBtn\">확인</button>\r\n");
      out.write("\t\t\t\t\t<div id=\"codeErr\" class=\"error\"  style=\"display: none\">인증이 필요합니다.</div></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<div id=\"joinErr\" class=\"error\"  style=\"display: none\">입력하신 정보를 확인해주세요.</div>\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t<tr id=\"join\" >\r\n");
      out.write("\t\t\t\t<th class=\"join\"><font size=\"5\" color=\"white\">회원가입</font></th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
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
}
