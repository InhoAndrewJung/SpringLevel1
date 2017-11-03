package solv1;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * �μ����� ����� ��Ƴ��� �����̽�
 * 
 * �����̽��� ����� ���
 * 1. api�� ����ؼ� �ۼ�
 * 	  1)XML ���
 *    2)XML ������� ����
 * 2. POJO�� �ۼ�
 * ::
 *  �� �ڵ�� 1-2)������� �ۼ�
 *  ���̺귯���� �߰��ؾ��� -> 
 *  MethodInterceptor�� around ����� �����̽� ���̺귯��
 */
public class ServiceAdvice implements MethodInterceptor{
	private Log log = LogFactory.getLog(getClass());

	public Object invoke(MethodInvocation invocation) throws Throwable {
		log.info("check...before...log");
		
		Object obj = invocation.proceed();
		System.out.println("obj:"+obj);
		
		log.info("check...after...log");
		return obj;
	}
	
}
