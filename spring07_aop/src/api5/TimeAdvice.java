package api5;
/*
 * POJO
 * AOP 스키마 이용
 * Aspect-J 표현식 사용
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
		System.out.println(targetMName+" method start 시각 :: "+start);
		
		Object obj = pjp.proceed();
		
		long end = System.currentTimeMillis();
		System.out.println(targetMName+" method end 시각 :: "+end);
		
		System.out.println("총 소요시각 :: "+(end-start)/1000+"초");
	}
}
