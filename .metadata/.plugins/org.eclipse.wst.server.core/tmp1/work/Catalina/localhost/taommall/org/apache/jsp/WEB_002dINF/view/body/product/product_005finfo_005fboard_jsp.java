/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-06-10 01:31:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.body.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_005finfo_005fboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("<style>\r\n");
      out.write("tbody tr td{\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("tbody div{\r\n");
      out.write("\toverflow:auto;\r\n");
      out.write("\twidth: 1000px;\r\n");
      out.write("\theight:150px;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/script/jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var boardList;\r\n");
      out.write("\r\n");
      out.write("function getBoardList(){\r\n");
      out.write("\talert(boardList);\r\n");
      out.write("\treturn boardList;\r\n");
      out.write("}\r\n");
      out.write("<!--\r\n");
      out.write("\r\n");
      out.write("//-->\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl:\"/taommall/board/selectBoardByProductId.do\",\r\n");
      out.write("\t\ttype:\"POST\",\r\n");
      out.write("\t\tdata:{\"productId\":\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.productId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"},\r\n");
      out.write("\t\tdataType:\"JSON\",\r\n");
      out.write("\t\tsuccess:function(jdata){\r\n");
      out.write("\t\t\tboardList = jdata;\t\t\t\r\n");
      out.write("\t\t\t$(\"#tbody\").empty();\r\n");
      out.write("\t\t\tfor(var i = 0;i<jdata.length;i++){\r\n");
      out.write("\t\t\t\t$(\"#tbody\").append(\r\n");
      out.write("\t\t\t\t\t\t$(\"<tr>\").append($(\"<td>\").text(i+1)).append($(\"</td>\"))\r\n");
      out.write("\t\t\t\t\t\t.append($(\"<td>\").text(jdata[i].title)).append($(\"</td>\"))\r\n");
      out.write("\t\t\t\t\t\t.append($(\"<td>\").text(jdata[i].buyerId)).append($(\"</td>\")).append($(\"</tr>\")))\r\n");
      out.write("\t\t\t\t\t\t.append($(\"<tr id=\"+(i+1)+\">\").append($(\"<td colspan='3'>\").append($(\"<div>\").text(jdata[i].content)\r\n");
      out.write("\t\t\t\t\t\t\t\t.append($(\"</div>\"))).append($(\"</td>\"))).append($(\"</tr>\")))\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$(\"#tbody tr:odd\").hide();\r\n");
      out.write("\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\terror:function(a,b,c){\r\n");
      out.write("\t\t\talert(a+\"-\"+b+\"-\"+c);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#registerBtn\").on(\"click\",function(){\r\n");
      out.write("\t\twindow.open(\"writeBoard.do\",\"글쓰기\",'width=500,height=500,toolbar=no,location=no,status=no,menubar=no,scrollbars=no,resizable=no,left=150,top=100');\r\n");
      out.write("\t});\r\n");
      out.write("\t$(\"#tbody\").on(\"mouseover\",\"tr\",function(){\r\n");
      out.write("\t\t$(\"#tbody tr\").css(\"background-color\",\"white\");\r\n");
      out.write("\t\t$(this).css(\"background-color\",\"#E2B4A9\");\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#tbody\").on(\"click\",\"tr\",function(){\r\n");
      out.write("\t\tvar idx = $(this).find(\":first\").text();\r\n");
      out.write("\t\tvar eIdx = \"#\"+idx;\r\n");
      out.write("\t\t$(\"#tbody tr:odd\").hide();\r\n");
      out.write("\t\t$(\"#tbody\").find(eIdx).show();\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function registerBoard(title,content,buyerId){\r\n");
      out.write("\tlocation = \"board/auth/insertBoard.do?title=\"+title+\"&content=\"+content+\"&productId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.productId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&buyerId=\"+buyerId;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div style=\"width:1000px;margin: 0 auto;\">\r\n");
      out.write("\t\t<table border='1' style=\" width:1000px;margin: 0 auto\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr style=\"text-align: center\">\r\n");
      out.write("\t\t\t\t\t\t<td width=\"100px\">No.</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"750px\">제목</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"150px\">작성자</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tbody id=\"tbody\">\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\t\r\n");
      out.write("</div>");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/view/body/product/product_info_board.jsp(96,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user =='buyer' }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t<div style=\"width: 1000px;margin: 0 auto;text-align: right\">\r\n");
        out.write("\t\t\t<button id=\"registerBtn\">글쓰기</button>\t\t\r\n");
        out.write("\t\t</div>\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}