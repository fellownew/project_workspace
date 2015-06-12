package kr.co.taommall.common;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

//공통로직 모음 클래스.
@Aspect
public class LoggerAspect {
	
	private static Logger logger = Logger.getLogger(LoggerAspect.class);
	//핵심로직 처리 후 실행 될 공통 메소드.
	//정상 처리 후 핵심 메소드가 return 한 경우.
	@AfterReturning(pointcut="execution(public * kr.co.taommall..*Service*..*(..))", returning="returnValue")
	public void afterReturn(Object returnValue){
		logger.info("return Info : "+returnValue);
	}
	@AfterThrowing(pointcut="within(kr.co.taommall..*)", throwing="ex")
	//핵심 로직에서 오류 발생한 후 호출.
	public void afterThrow(Throwable ex){
		logger.error("Exception : ",ex);
	}
	
}
