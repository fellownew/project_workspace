/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-06-16 01:49:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.body.buyer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class buyer_005fid_005fcheck_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/script/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var regex = /^([\\w-]+(?:\\.[\\w-]+)*)@((?:[\\w-]+\\.)*\\w[\\w-]{0,66})\\.([a-z]{2,6}(?:\\.[a-z]{2})?)$/;\r\n");
      out.write("var idCheck = false;\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$(\"#next\").on(\"click\",function(){\r\n");
      out.write("\t\tif(codeCheck){\r\n");
      out.write("\t\t\tlocation = \"/taommall/buyer/idConfirm.do?id=\"+$(\"#buyerId\").val()+\"&email=\"+$(\"#email\").val();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t$(\"#buyerId\").blur(function(){\t\t\t\t\t\t\r\n");
      out.write("\t\tif($(\"#buyerId\").val().trim()==''){\t\t\t\t\t\r\n");
      out.write("\t\t\t$(\"#idErr\").show().html(\"필수 정보입니다\").attr('style', \"color:red\");\r\n");
      out.write("\t\t\t$(\"#buyerId\").val('');\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t//이메일\r\n");
      out.write("\t$(\"#email\").keydown(function(){\r\n");
      out.write("\t\t$(\"#emailErr\").hide();\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#email\").blur(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(regex.test($(\"#email\").val()) === false) {\r\n");
      out.write("\t\t\t$(\"#emailErr\").show().html(\"email 형식에 맞게 입력하세요.\").attr('style', \"color:red\");\r\n");
      out.write("\t\t\t return false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif($(\"#email\").val().trim()==''){\r\n");
      out.write("\t\t\t$(\"#emailErr\").show().html(\"필수 정보입니다\").attr('style', \"color:red\");\r\n");
      out.write("\t\t\t$(\"#email\").val('');\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(\"#emailErr\").html('').hide();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t//인증번호\r\n");
      out.write("\t$(\"#code\").keydown(function(){\r\n");
      out.write("\t\t$(\"#codeErr\").hide();\r\n");
      out.write("\t});\r\n");
      out.write("\t$(\"#code\").blur(function(){\t\t\r\n");
      out.write("\t\tif($(\"#code\").val().trim()==''){\r\n");
      out.write("\t\t\t$(\"#codeErr\").show().html(\"필수 정보입니다\").attr('style', \"color:red\");\r\n");
      out.write("\t\t\t$(\"#code\").val('');\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(\"#codeErr\").html('').hide();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t//인증번호 전송\r\n");
      out.write("\t$(\"#emailBtn\").on(\"click\",function(){\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:\"/taommall/buyer/identifyEmail.do\",\r\n");
      out.write("\t\t\ttype:\"POST\",\r\n");
      out.write("\t\t\tdata:{\"email\":$(\"#email\").val()},\r\n");
      out.write("\t\t\tdataType:\"text\",\r\n");
      out.write("\t\t\tbeforeSend:function(){\r\n");
      out.write("\t\t\t\tif($(\"#email\").val().trim()==''){\r\n");
      out.write("\t\t\t\t\t$(\"#emailErr\").html('email을 다시확인해 주세요.').attr('style', \"color:red\");\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tsuccess:function(res){\r\n");
      out.write("\t\t\t\tif(res.trim()!='' ){\r\n");
      out.write("\t\t\t\t\tmsg = res;\r\n");
      out.write("\t\t\t\t$(\"#emailErr\").html('인증번호가 발송되었습니다.').attr('style', \"color:blue\");\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$(\"#emailErr\").html('이메일을 확인해주세요.').attr('style', \"color:red\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror:function(a,s,b){\r\n");
      out.write("\t\t\t\talert(a+\":\"+s+\":\"+b);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t//인증번호 확인\r\n");
      out.write("\t$(\"#codeBtn\").on(\"click\",function(){\r\n");
      out.write("\t\tif(msg == $(\"#code\").val()){\r\n");
      out.write("\t\t\tcodeCheck = true;\r\n");
      out.write("\t\t\t$(\"#codeErr\").html('인증이 성공했습니다.').attr('style', \"color:blue\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(idCheck && codeCheck && passwordCheck){\r\n");
      out.write("\t\t\t\t$(\"#joinErr\").hide().html('');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(\"#codeErr\").html('인증번호를 다시 확인해주세요').attr('style', \"color:red\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\t\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div>\r\n");
      out.write("<input class=\"int\" id=\"buyerId\" name=\"buyerId\" type=\"text\" placeholder=\"이름\">\r\n");
      out.write("<div id=\"idErr\" class=\"error\" style=\"display:none\">필수 정보입니다.</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("<input id=\"email\" type=\"text\" placeholder=\"이메일 입력\"><button id=\"emailBtn\" >인증번호 받기</button>\r\n");
      out.write("<div id=\"emailErr\" class=\"error\" style=\"display: none\">필수 정보입니다.</div>\r\n");
      out.write("<div>\r\n");
      out.write("<input type=\"text\" id=\"code\" name=\"code\" maxlength=\"12\"\r\n");
      out.write("\t\t\t\t\tplaceholder=\"인증번호\" class=\"int2\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" id=\"codeBtn\">확인</button>\r\n");
      out.write("\t\t\t\t\t<div id=\"codeErr\" class=\"error\" style=\"display: none\">인증이\r\n");
      out.write("\t\t\t\t\t\t필요합니다.</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div><button id=\"next\">다음</button></div>\r\n");
      out.write("</div>\r\n");
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
