package solv2;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;

/*
 * POJO | XML ���(aop ��Ű�� ���)
 */
public class ServiceAdvice {
	private Log log = LogFactory.getLog(getClass());
	
	//�޼ҵ忡 ���ڰ��� �����̽��� ������ �����Ѵ�. -> ProceedingJoinPoint =around ���
	//JoinPoint = before of after���
	public void logPush(ProceedingJoinPoint pjp) throws Throwable {
		//target�� Ư�� �������� weaving�ϴ� ���� 
		log.info("check...before...");
		pjp.proceed();
		log.info("check...after...");
		
	}
}