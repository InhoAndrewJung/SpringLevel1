package api1;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/*
 * Cross Cutting Concern이 들어있는 어드바이스 클래스
 * ::
 * TARGET CLASS의 비지니스 로직이 호출되면 
 * 이것을 인터셉터인 MessageAdvice가 이벤트로 감지해서
 * invoke()가 호출됨
 * 결국 비지니스 로직이 실행되기전에 invoke()가 실행된다.
 */
public class MessageAdvice implements MethodInterceptor{

	public Object invoke(MethodInvocation invocation) throws Throwable {
		//비지니스 로직 실행 전에 수행되는 로직...
		System.out.println("1.비지니스 로직 실행 전에 수행되는 로직...");
		Object obj = invocation.proceed(); // ->이 때 비지니스 로직이 호출된다.
		if(obj!=null) {
			System.out.println("target의 리턴값 :: "+obj);
		}
		//비지니스 로직 실행 후에 수행되는 로직
		System.out.println("2. 비지니스 로직 실행 후에 수행되는 로직");
		return obj;
	}
	
}
