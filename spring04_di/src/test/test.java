package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kosta.di.MessageBean;

public class test {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("resources/MessageConf.xml");//classPath�� src�Ⱦ�
		System.out.println("1. �������");
		
		//3. �����Ǿ ������ ������ �ִ� ���� ��û :: getBean()
		System.out.println("3. ���忡�� ���� �����ɴϴ�...");
		MessageBean bean = factory.getBean("messageBean", MessageBean.class);//�̱������� ������



		//4. ���� �޼ҵ带 ����...����� Ȯ��
		System.out.println("4. ���� �޼ҵ带 ȣ��..." + bean.sayHello());


	}

}