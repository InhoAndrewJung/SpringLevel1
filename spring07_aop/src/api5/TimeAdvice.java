package api5;
/*
 * POJO
 * AOP ��Ű�� �̿�
 * Aspect-J ǥ���� ���
 */

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TimeAdvice {

	@Around("execution(* api5.Dao*.re*(..))")
	public void time(ProceedingJoinPoint pjp)throws Throwable {
		long start = System.currentTimeMillis();
		String targetMName = pjp.getSignature().getName();
		System.out.println(targetMName+" method start �ð� :: "+start);
		
		Object obj = pjp.proceed();
		
		long end = System.currentTimeMillis();
		System.out.println(targetMName+" method end �ð� :: "+end);
		
		System.out.println("�� �ҿ�ð� :: "+(end-start)/1000+"��");
	}
}