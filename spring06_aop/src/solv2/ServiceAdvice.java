package solv2;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;

/*
 * POJO | XML 사용(aop 스키마 사용)
 */
public class ServiceAdvice {
	private Log log = LogFactory.getLog(getClass());
	
	//메소드에 인자값이 어드바이스의 유형을 결정한다. -> ProceedingJoinPoint =around 방식
	//JoinPoint = before of after방식
	public void logPush(ProceedingJoinPoint pjp) throws Throwable {
		//target의 특정 지점으로 weaving하는 지점 
		log.info("check...before...");
		pjp.proceed();
		log.info("check...after...");
		
	}
}
