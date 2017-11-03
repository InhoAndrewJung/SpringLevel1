package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kosta.di.MessageBean;
import com.kosta.di.Outputer;

public class test2 {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("resources/msg2.xml");//classPath�� src�Ⱦ�
		System.out.println("1. �������");
		
		//3. �����Ǿ ������ ������ �ִ� ���� ��û :: getBean()
		System.out.println("3. ���忡�� ���� �����ɴϴ�...");
		MessageBean bean = factory.getBean("msg", MessageBean.class);//�̱������� ������



		//4. ���� �޼ҵ带 ����...����� Ȯ��
		System.out.println("4. ���� �޼ҵ带 ȣ��..." + bean.sayHello());
		//�߰�
		System.out.println("=============================");
		Outputer output = (Outputer)factory.getBean("output");
		output.output("���Ϸ� ���!! ����!!");

	}

}