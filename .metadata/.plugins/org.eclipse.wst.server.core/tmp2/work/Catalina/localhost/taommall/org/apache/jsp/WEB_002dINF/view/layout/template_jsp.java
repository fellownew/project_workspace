/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-06-12 02:40:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class template_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>따옴몰</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/script/jquery.js\"></script>\r\n");
      out.write("<style type=\"text/css\" >\r\n");
      out.write("body{\r\n");
      out.write("\twidth:1300px;\r\n");
      out.write("\tmargin:0 auto;\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("table{\r\n");
      out.write("\tborder: 1px none #DCD8D0;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button {\r\n");
      out.write("  font-family: arial;\r\n");
      out.write("  font-weight: bold;\r\n");
      out.write("  color: #FFFFFF !important;\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  padding: 9px 11px;\r\n");
      out.write("  -moz-border-radius: 15px;\r\n");
      out.write("  -webkit-border-radius: 15px;\r\n");
      out.write("  border-radius: 15px;\r\n");
      out.write("  background: #CD0000;\r\n");
      out.write("  background: linear-gradient(top,  #5C5C5C,  #A6A6A6);\r\n");
      out.write("  background: -ms-linear-gradient(top,  #5C5C5C,  #A6A6A6);\r\n");
      out.write("  background: -webkit-gradient(linear, left top, left bottom, from(#5C5C5C), to(#A6A6A6));\r\n");
      out.write("  background: -moz-linear-gradient(top,  #5C5C5C,  #A6A6A6);\r\n");
      out.write("}\r\n");
      out.write("button:hover {\r\n");
      out.write("  color: #000000 !important;\r\n");
      out.write("  background: #FFFFFF;\r\n");
      out.write("  background: linear-gradient(top,  #A6A6A6,  #5C5C5C);\r\n");
      out.write("  background: -ms-linear-gradient(top,  #A6A6A6,  #5C5C5C);\r\n");
      out.write("  background: -webkit-gradient(linear, left top, left bottom, from(#A6A6A6), to(#5C5C5C));\r\n");
      out.write("  background: -moz-linear-gradient(top,  #A6A6A6,  #5C5C5C);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header{\r\n");
      out.write("\tbackground-color:white;\r\n");
      out.write("\toverflow:auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav{\r\n");
      out.write("\tbackground-color:tomato;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\tfloat:none;\r\n");
      out.write("\tpadding: 5px;\r\n");
      out.write("\toverflow:auto;\r\n");
      out.write("}\r\n");
      out.write("#aside{\r\n");
      out.write("\tline-height: 50px;\r\n");
      out.write("\tbackground-color:white;\r\n");
      out.write("\tfloat:right;\r\n");
      out.write("\twidth:300px;\r\n");
      out.write("\ttext-align:right;\r\n");
      out.write("\tmargin:0 auto;\r\n");
      out.write("}\r\n");
      out.write("#section{\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\twidth: 970px;\r\n");
      out.write("\tpadding:15px;\r\n");
      out.write("\tmargin:0 auto; \r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("#footer{\r\n");
      out.write("\tbackground-color:tomato;\r\n");
      out.write("\tcolor:white;\r\n");
      out.write("\tpadding-top:20px;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\theight:50px;\r\n");
      out.write("\tclear:both;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/view/layout/remote.jsp", out, false);
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_tiles_005finsertAttribute_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"nav\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_tiles_005finsertAttribute_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"aside\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_tiles_005finsertAttribute_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"section\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_tiles_005finsertAttribute_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"footer\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_tiles_005finsertAttribute_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</div>\r\n");
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

  private boolean _jspx_meth_tiles_005finsertAttribute_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f0 = (new org.apache.tiles.jsp.taglib.InsertAttributeTag());
    _jsp_instancemanager.newInstance(_jspx_th_tiles_005finsertAttribute_005f0);
    _jspx_th_tiles_005finsertAttribute_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/view/layout/template.jsp(87,2) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f0.setName("header");
    _jspx_th_tiles_005finsertAttribute_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_tiles_005finsertAttribute_005f0);
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f1 = (new org.apache.tiles.jsp.taglib.InsertAttributeTag());
    _jsp_instancemanager.newInstance(_jspx_th_tiles_005finsertAttribute_005f1);
    _jspx_th_tiles_005finsertAttribute_005f1.setJspContext(_jspx_page_context);
    // /WEB-INF/view/layout/template.jsp(91,2) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f1.setName("nav");
    _jspx_th_tiles_005finsertAttribute_005f1.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_tiles_005finsertAttribute_005f1);
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f2 = (new org.apache.tiles.jsp.taglib.InsertAttributeTag());
    _jsp_instancemanager.newInstance(_jspx_th_tiles_005finsertAttribute_005f2);
    _jspx_th_tiles_005finsertAttribute_005f2.setJspContext(_jspx_page_context);
    // /WEB-INF/view/layout/template.jsp(95,2) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f2.setName("aside");
    _jspx_th_tiles_005finsertAttribute_005f2.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_tiles_005finsertAttribute_005f2);
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f3 = (new org.apache.tiles.jsp.taglib.InsertAttributeTag());
    _jsp_instancemanager.newInstance(_jspx_th_tiles_005finsertAttribute_005f3);
    _jspx_th_tiles_005finsertAttribute_005f3.setJspContext(_jspx_page_context);
    // /WEB-INF/view/layout/template.jsp(99,2) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f3.setName("body");
    _jspx_th_tiles_005finsertAttribute_005f3.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_tiles_005finsertAttribute_005f3);
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f4 = (new org.apache.tiles.jsp.taglib.InsertAttributeTag());
    _jsp_instancemanager.newInstance(_jspx_th_tiles_005finsertAttribute_005f4);
    _jspx_th_tiles_005finsertAttribute_005f4.setJspContext(_jspx_page_context);
    // /WEB-INF/view/layout/template.jsp(103,2) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f4.setName("footer");
    _jspx_th_tiles_005finsertAttribute_005f4.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_tiles_005finsertAttribute_005f4);
    return false;
  }
}
