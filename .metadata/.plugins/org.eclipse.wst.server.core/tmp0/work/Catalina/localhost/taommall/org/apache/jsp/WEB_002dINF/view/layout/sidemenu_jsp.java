/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-05-27 05:37:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sidemenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style type=\"text/css\">\r\n");
      out.write(".myButton {\r\n");
      out.write("\t-moz-box-shadow:inset 0px 1px 0px 0px #cf866c;\r\n");
      out.write("\t-webkit-box-shadow:inset 0px 1px 0px 0px #cf866c;\r\n");
      out.write("\tbox-shadow:inset 0px 1px 0px 0px #cf866c;\r\n");
      out.write("\tbackground:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #d0451b), color-stop(1, #c7624d));\r\n");
      out.write("\tbackground:-moz-linear-gradient(top, #d0451b 5%, #c7624d 100%);\r\n");
      out.write("\tbackground:-webkit-linear-gradient(top, #d0451b 5%, #c7624d 100%);\r\n");
      out.write("\tbackground:-o-linear-gradient(top, #d0451b 5%, #c7624d 100%);\r\n");
      out.write("\tbackground:-ms-linear-gradient(top, #d0451b 5%, #c7624d 100%);\r\n");
      out.write("\tbackground:linear-gradient(to bottom, #d0451b 5%, #c7624d 100%);\r\n");
      out.write("\tfilter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#d0451b', endColorstr='#c7624d',GradientType=0);\r\n");
      out.write("\tbackground-color:#d0451b;\r\n");
      out.write("\t-moz-border-radius:3px;\r\n");
      out.write("\t-webkit-border-radius:3px;\r\n");
      out.write("\tborder-radius:3px;\r\n");
      out.write("\tborder:1px solid #942911;\r\n");
      out.write("\tdisplay:inline-block;\r\n");
      out.write("\tcursor:pointer;\r\n");
      out.write("\tcolor:#ffffff;\r\n");
      out.write("\tfont-family:Arial;\r\n");
      out.write("\tfont-size:13px;\r\n");
      out.write("\tpadding:6px 24px;\r\n");
      out.write("\ttext-decoration:none;\r\n");
      out.write("\ttext-shadow:0px 1px 0px #854629;\r\n");
      out.write("}\r\n");
      out.write(".myButton:hover {\r\n");
      out.write("\tbackground:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #c7624d), color-stop(1, #d0451b));\r\n");
      out.write("\tbackground:-moz-linear-gradient(top, #c7624d 5%, #d0451b 100%);\r\n");
      out.write("\tbackground:-webkit-linear-gradient(top, #c7624d 5%, #d0451b 100%);\r\n");
      out.write("\tbackground:-o-linear-gradient(top, #c7624d 5%, #d0451b 100%);\r\n");
      out.write("\tbackground:-ms-linear-gradient(top, #c7624d 5%, #d0451b 100%);\r\n");
      out.write("\tbackground:linear-gradient(to bottom, #c7624d 5%, #d0451b 100%);\r\n");
      out.write("\tfilter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#c7624d', endColorstr='#d0451b',GradientType=0);\r\n");
      out.write("\tbackground-color:#c7624d;\r\n");
      out.write("}\r\n");
      out.write(".myButton:active {\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("\ttop:1px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\t<button class=\"myButton\">버튼1</button><br>\r\n");
      out.write("\t<button class=\"myButton\">버튼2</button><br>\r\n");
      out.write("\t<button class=\"myButton\">버튼3</button><br>\r\n");
      out.write("\t<button class=\"myButton\">버튼4</button><br>\r\n");
      out.write("\t\r\n");
      out.write("</body>");
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
