package api1;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/*
 * Cross Cutting Concern�� ����ִ� �����̽� Ŭ����
 * ::
 * TARGET CLASS�� �����Ͻ� ������ ȣ��Ǹ� 
 * �̰��� ���ͼ����� MessageAdvice�� �̺�Ʈ�� �����ؼ�
 * invoke()�� ȣ���
 * �ᱹ �����Ͻ� ������ ����Ǳ����� invoke()�� ����ȴ�.
 */
public class MessageAdvice implements MethodInterceptor{

	public Object invoke(MethodInvocation invocation) throws Throwable {
		//�����Ͻ� ���� ���� ���� ����Ǵ� ����...
		System.out.println("1.�����Ͻ� ���� ���� ���� ����Ǵ� ����...");
		Object obj = invocation.proceed(); // ->�� �� �����Ͻ� ������ ȣ��ȴ�.
		if(obj!=null) {
			System.out.println("target�� ���ϰ� :: "+obj);
		}
		//�����Ͻ� ���� ���� �Ŀ� ����Ǵ� ����
		System.out.println("2. �����Ͻ� ���� ���� �Ŀ� ����Ǵ� ����");
		return obj;
	}
	
}
