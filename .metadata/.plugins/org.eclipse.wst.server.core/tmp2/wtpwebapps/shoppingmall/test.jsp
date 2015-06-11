<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<script type="text/javascript" src="<%=request.getContextPath() %>/script/jquery.js"></script>
<script type="text/javascript">


var popup_req = false;//for popup ajax
var popup_script = false;//dialog_open 네번째 인자로, 레이어 팝업창을 띄운 직후 실행할 스크립트 값
var in_alertcount = 0;
function new_popup()
{
	this.agent_name = navigator.userAgent.toLowerCase();
	this.is_ie = ((this.agent_name.indexOf("msie") != -1) && (this.agent_name.indexOf("opera") == -1));
	this.is_gecko = navigator.product;

	this.position_x = 0;
	this.position_y = 0;
	this.ajax_url = '';

	this.dlg_bg = document.getElementById('dialogbackgroundlayer');
	this.dlg = document.getElementById('dialoglayer');
	this.msg = document.getElementById('message');

	this.dlg_bg.style.left = '0px';

	this.dlg_bg.style.top = '0px';
	this.dlg_bg.style.width = '100%';
	this.dlg_bg.style.background = "#000";
	this.dlg_bg.style.opacity = (50/100);
	this.dlg_bg.style.MozOpacity = (50/100);
	this.dlg_bg.style.KhtmlOpacity = (50/100);
	this.dlg_bg.style.filter = 'alpha(opacity=50)';

	this.dialog_open= function(url, w_width, w_height, run_script)
	{
		var height = document.body.clientHeight;
		if(!w_height) w_height = 170;
		if (this.is_gecko) height += 10;

		this.dlg_bg.style.height = height + 'px';
		this.dlg_bg.style.display = '';

		this.dlg.style.left = "50%";
		this.dlg.style.top = w_height + "px";
		this.dlg.style.marginLeft = w_width/2*-1+"px";
		if (run_script)
			popup_script = run_script;
		else
			popup_script = false;

		this.load(url);
		this.dlg.style.display = '';

	}
	this.dialog_close= function()
	{
		this.dlg_bg.style.display = 'none';
		this.dlg.style.display = 'none';
	}

	this.in_alert = function(message)
	{
		this.msg.innerHTML = message;
		this.msg.style.display = '';
		window.setTimeout(this.in_alert_hidden, 2000);
		in_alertcount++;
	}
	this.in_alert_hidden = function()
	{
		in_alertcount--;
		if(!in_alertcount)
			document.getElementById('message').style.display = 'none';
	}

	this.load = function(url) {
		popup_req= false;
		// branch for native XMLHttpRequest object
		if (window.XMLHttpRequest) {
			try {
				popup_req = new XMLHttpRequest();
			}
			catch(e) {
				popup_req = false;
			}
		}
		// branch for IE/Windows ActiveX version
		else if (window.ActiveXObject) {
			try {
				popup_req = new ActiveXObject("Msxml2.XMLHTTP");
			}
			catch(e) {
				try {
					this.req= new ActiveXObject("Microsoft.XMLHTTP");
				}
				catch(e) {
					popup_req  = false;
				}
			}
		}
		if (popup_req ) {

			popup_req.onreadystatechange = this.processPopup;
			popup_req.open("GET", url, true);
			popup_req.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
			popup_req.send("");
		}
	}
	this.processPopup = function() {
		// only if req shows "loaded"
		var obj = document.getElementById('dialoglayer');
		if (popup_req.readyState == 4) {
			// only if "OK"
			obj.innerHTML = popup_req.responseText;
			if (popup_script)
				eval(popup_script);
		}
	}

}


//리모콘 부분
     var win = new new_popup(); 
     var dragmode = false; 

     function resize_win() 
     { 
          var w = document.body.clientWidth; 
          var obj = document.getElementById('remote'); 
          if(parseInt(obj.style.left.split('px')[0])+105 > w) 
          { 
            obj.style.left = (w-105)+'px'; 
          } 
     } 
     function set_remoconposition(e) 
     { 
          if(dragmode) 
          { 
            var obj = document.getElementById('remote'); 
            if(win.is_ie) 
            { 
              var x = event.x; 
              var y = event.y; 
            } 
            else 
            { 
              var x = e.pageX; 
              var y = e.pageY; 
            } 
            obj.style.right = ''; 
            obj.style.left = (x-50)+'px'; 
            obj.style.top = (y-10)+'px'; 
          } 
     } 
     function change_mode(val,e) 
     { 
          dragmode = val; 
          if(val) 
          { 
            win.dialog_open('',0); 
          } 
          else win.dialog_close(); 
     } 
      </script> 
<html> 
  <head><title>테스트 페이지</title> 
      <script src=new_win.js></script> 
  </head> 

  <body style='overflow:hidden;margin:0px;' onResize='resize_win();'> 
      <iframe  src="http://naver.com" style="z-index:1;" frameborder="0" width="100%" height="100%" scrolling="auto"></iframe> 

      <div id="dialogbackgroundlayer" style="display:none;position:absolute;z-index:999;" onClick="win.dialog_close()" onMouseUp="change_mode(false);"  onMouseMove='set_remoconposition(arguments[0]);'> 
      </div> 
      <div id="dialoglayer" style="display:hidden;"></div> 


      <div id="remote" style="position:absolute;z-index:1000;right:27px;top:10px;" onMouseMove='set_remoconposition(arguments[0]);'> 
     <!-- 리모콘 시작 --> 
     <table width=100 border=0 cellpadding=0 cellspacing=1 bgcolor=#555555> 
        <tr bgcolor=#aaaaff align=right><td id=topbar style='cursor:move' onMouseDown='change_mode(true, arguments[0]);' onMouseUp='change_mode(false);' onMouseMove='set_remoconposition(arguments[0]);'><img src=/images/new_win/x.gif style='cursor:hand;' border=0 onclick="location.href=document.getElementById('innerpage').src"></td></tr> 
        
        <tr><td height=200 bgcolor=#ffffff><a href=/index.php style='font-size:11px'>함트 홈피로 되돌아가기</a></td></tr> 
        <tr><td bgcolor=#aaaaff> </td></tr> 
     </table> 
     <!-- 리모콘 끝 --> 
      </div> 
      <div id=message style="display:none;position:absolute;left:0px;top:0px;padding:3px;background:#cc0000;color:#ffffff;font-size:13px;font-weight:bold;z-index:100;"></div> 

  </body> 
</html> 


