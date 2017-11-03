package api2;
/*
 * advice�쑀�삎 ::
 * 1) api瑜� �긽�냽 --- MethodInterceptor :: arround 諛⑹떇�쓽 �뼱�뱶諛붿씠�뒪
 * 2) xml�궗�슜�븿 --- aop �뒪�궎留덇� 鍮좎졇�엳�떎....only 鍮� �꽕�젙�쑝濡쒕쭔 xml�쓣 �옉�꽦�븯�뒗 踰덇굅濡쒖�
 * 3) pointcut�쓽 �뙣�꽩�쑝濡� JDK �젙洹쒖떇 �몴�쁽踰뺤쓣 �궗�슜.
 */
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

public class LoggingAdvice  implements MethodInterceptor{
	
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String methodName = invocation.getMethod().getName();
		StopWatch sw = new StopWatch();
		sw.start(methodName);
		
		System.out.println("[LOG] METHOD :"+ methodName+" is calling...");
		Object rtnObj = invocation.proceed();
		
		sw.stop();
		
		System.out.println("[LOG] METHOD :"+ methodName + " was called...");
		System.out.println("[LOG 泥섎━�떆媛� : "+ sw.getTotalTimeMillis()/1000+ "珥�");
		return rtnObj;
	}

}









