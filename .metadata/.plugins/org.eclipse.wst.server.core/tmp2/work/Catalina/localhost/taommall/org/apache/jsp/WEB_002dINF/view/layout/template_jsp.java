/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
<<<<<<< HEAD
<<<<<<< HEAD
 * Generated at: 2015-06-12 09:01:59 UTC
=======
 * Generated at: 2015-06-13 01:22:53 UTC
>>>>>>> fafb74dd4c3fb906ae858d90c845b85192ff8a0a
=======
 * Generated at: 2015-06-13 08:25:55 UTC
>>>>>>> 477e1b155eee536234217b2b6696041f70b68f31
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

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/view/layout/remote.jsp", Long.valueOf(1434159610804L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin.release();
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
<<<<<<< HEAD
<<<<<<< HEAD
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/view/layout/remote.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
=======
>>>>>>> fafb74dd4c3fb906ae858d90c845b85192ff8a0a
=======
      out.write("\r\n");
>>>>>>> 477e1b155eee536234217b2b6696041f70b68f31
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#remoCon {\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("\twidth: 100px;\r\n");
      out.write("\theight: auto;\r\n");
      out.write("\tright: 157px;\r\n");
      out.write("\ttop: 138px;\r\n");
      out.write("\tborder: thin solid gray;\r\n");
      out.write("\tbackground-color : white;\r\n");
      out.write(" } \r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/script/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("//쿠키 생성\r\n");
      out.write("function setCookie(cName, cValue, cDay){\r\n");
      out.write("       var expire = new Date();\r\n");
      out.write("       expire.setDate(expire.getDate() + cDay);\r\n");
      out.write("       cookies = cName + '=' + escape(cValue) + '; path=/ '; // 한글 깨짐을 막기위해 escape(cValue)를 합니다.\r\n");
      out.write("       if(typeof cDay != 'undefined') cookies += ';expires=' + expire.toGMTString() + ';';\r\n");
      out.write("       document.cookie = cookies;\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("//쿠키 가져오기\r\n");
      out.write("function getCookie(cName) {\r\n");
      out.write("   cName = cName + '=';\r\n");
      out.write("   var cookieData = document.cookie;\r\n");
      out.write("   var start = cookieData.indexOf(cName);\r\n");
      out.write("   var cValue = '';\r\n");
      out.write("   if(start != -1){\r\n");
      out.write("       start += cName.length;\r\n");
      out.write("       var end = cookieData.indexOf(';', start);\r\n");
      out.write("       if(end == -1)end = cookieData.length;\r\n");
      out.write("       cValue = cookieData.substring(start, end);\r\n");
      out.write("   }\r\n");
      out.write("   return unescape(cValue);\r\n");
      out.write("}\r\n");
      out.write("$(\"#remoCon\").click(function(){\t\r\n");
      out.write("\t$(\"html, body\").animate({scrollTop: 0}, 1000);\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\tvar str = \"\";\r\n");
      out.write("\t\r\n");
      out.write("\tfor(var idx = 4;idx>=0;idx--){\r\n");
      out.write("\t\t$(\"#a\"+idx).attr(\"href\",\"");
      out.print(request.getContextPath());
      out.write("/productInfo.do?productId=\"+getCookie('productId'+idx));\r\n");
      out.write("\t\t$(\"#img\"+idx).attr(\"src\",\"");
      out.print(request.getContextPath());
      out.write("/\"+getCookie('imagePath'+idx));\r\n");
      out.write("\t\t$(\"#span\"+idx).html(getCookie('productName'+idx));\r\n");
      out.write("\t}\r\n");
      out.write("\t$(\"#top\").on(\"click\",function(){\r\n");
      out.write("\t\t$(document.body).animate({ scrollTop: 0 }); //animation효과로 scollTop=0으로 이동\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("<div id=\"remoCon\">\r\n");
      out.write("\t<div style=\"text-align: center;\">\r\n");
      out.write("\t\t<b><font size=\"2px\">오늘 본 상품</font></b>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"remote\">\r\n");
      out.write("\t");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/view/layout/remote.jsp(65,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(request.getCookies() !=null);
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<div id=\"remote\" style=\"text-align: center;\">\r\n");
          out.write("\t\t\t\t");
          //  c:forEach
          org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
          _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
          // /WEB-INF/view/layout/remote.jsp(67,4) name = begin type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_c_005fforEach_005f0.setBegin(1);
          // /WEB-INF/view/layout/remote.jsp(67,4) name = end type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_c_005fforEach_005f0.setEnd(request.getCookies().length/3 );
          // /WEB-INF/view/layout/remote.jsp(67,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_c_005fforEach_005f0.setVar("cnt");
          int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
          try {
            int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
            if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("\r\n");
                out.write("\t\t\t\t\t<div style=\"border-bottom: 1px solid gray;\">\r\n");
                out.write("\t\t\t\t\t\t<a id=\"a");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cnt-1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
                out.write("\" style=\"color: gray; text-decoration: none; \"> \r\n");
                out.write("\t\t\t\t\t\t<img style=\"width: 80px; height: 80px; margin-top: 2px;\" id=\"img");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cnt-1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
                out.write("\"/><br> \r\n");
                out.write("\t\t\t\t\t\t<span  style=\"font-size:8px; line-height: 0px;\" id=\"span");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cnt-1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
                out.write("\"></span>\r\n");
                out.write("\t\t\t\t\t\t</a>\r\n");
                out.write("\t\t\t\t\t</div>\r\n");
                out.write("\t\t\t\t");
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
            _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin.reuse(_jspx_th_c_005fforEach_005f0);
          }
          out.write("\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"text-align: center\"><a id=\"top\">top</a></div>\r\n");
      out.write("</div>");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
    // /WEB-INF/view/layout/template.jsp(88,2) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/view/layout/template.jsp(92,2) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/view/layout/template.jsp(96,2) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/view/layout/template.jsp(100,2) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/view/layout/template.jsp(104,2) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f4.setName("footer");
    _jspx_th_tiles_005finsertAttribute_005f4.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_tiles_005finsertAttribute_005f4);
    return false;
  }
}
