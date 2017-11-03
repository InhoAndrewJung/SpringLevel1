package api4;
/*
 * POJO ������� �ۼ�
 * �̶� Around������� ���ư�����...method���ڰ��� ProceddingJoinPoint�� �ִ´�.
 */


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.util.StopWatch;

@Aspect
public class LoggingAdvice{
	private Log log = LogFactory.getLog(getClass());
	
	@Around("execution(* api4.Message*.say*(..))")
	public void timeLog(ProceedingJoinPoint pjp) throws Throwable {
		String methodName = pjp.getSignature().getName();
		StopWatch sw = new StopWatch();
		sw.start(methodName);
		
		
		System.out.println("LOG METHOD: "+methodName+" is calling");
		Object rtnObj = pjp.proceed();
		
		sw.stop();
		
		System.out.println("LOG METHOD: "+methodName+" is calling");
		System.out.println("LOG ó���ð�"+ sw.getTotalTimeMillis()/1000+"��");
		
		
		
	}

}








