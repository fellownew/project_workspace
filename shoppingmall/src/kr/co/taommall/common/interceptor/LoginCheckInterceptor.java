package kr.co.taommall.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginCheckInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		//로그인 여부를 체크 : 
				//로그인이 안된 경우 : request.jsp로 이동
				//로그인이 된 경우 : controller로 이동
		
		HttpSession session = request.getSession();
		Object loginFlag = session.getAttribute("loginInfo");
		
		if(loginFlag == null){
			throw new ModelAndViewDefiningException(new ModelAndView("/WEB-INF/view/","errorMessage","로그인 먼저 하세요"));
		}else{
			//로그인한 클라이언트의 요청
		}
		return super.preHandle(request, response, handler);
	}

}
