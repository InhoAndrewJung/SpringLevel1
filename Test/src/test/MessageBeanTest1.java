package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kosta.service.MemberService;

public class MessageBeanTest1 {

	public static void main(String[] args) {
		//1. ���������� �о���Դϴ�..springframework.core.io
		/*Resource r= new FileSystemResource("src/resources/messageBean.xml");
				System.out.println("1. �� ���������� �о r�� ��ȯ�߽��ϴ�...");
				//2. �� ���丮 ����(di container)
				BeanFactory factory = new XmlBeanFactory(r);
				System.out.println("2. ���� ������ ������ �ϳ� ��������ϴ�...");*/

		ApplicationContext factory = new ClassPathXmlApplicationContext("resources/messageBean1.xml");//classPath�� src�Ⱦ�
		System.out.println("1. �������");
		
		//3. �����Ǿ ������ ������ �ִ� ���� ��û :: getBean()
		System.out.println("3. ���忡�� ���� �����ɴϴ�...");
		MemberService bean = factory.getBean("message1", MemberService.class);//�̱������� ������



		//4. ���� �޼ҵ带 ����...����� Ȯ��
		System.out.println("4. ���� �޼ҵ带 ȣ��..."+bean.msg());



	}

}
