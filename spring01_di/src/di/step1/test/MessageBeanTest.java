package di.step1.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import di.step1.MessageBean;

/*
 *  DI Framework
 */
/*
 * Lazy Loading
 * 클라이언트가 요청하는 시점에서야 빈을 생성
 * Pre Loading(load-on-startup)
 * 요청하기 전에 미리 생성하고 고객이 빈을 요청하면 미리 만들어놓은 빈을 제공...
 */
public class MessageBeanTest {

	public static void main(String[] args) {
		//1. 설정문서를 읽어들입니다..springframework.core.io
		Resource r= new FileSystemResource("src/bean.xml");
		System.out.println("1. 빈 설정문서를 읽어서 r로 반환했습니다...");
		//2. 빈 팩토리 생성(di container)
		BeanFactory factory = new XmlBeanFactory(r);
		System.out.println("2. 빈을 생성할 공장을 하나 만들었습니다...");
		//3. 생성되어서 공장이 가지고 있는 빈을 요청 :: getBean()
		System.out.println("3. 공장에서 빈을 가져옵니다...");
		MessageBean bean1 = factory.getBean("krBean", MessageBean.class);//싱글톤으로 생성됨
		MessageBean bean2 = factory.getBean("enBean", MessageBean.class);
		
		
		//4. 빈의 메소드를 수행...결과를 확인
		System.out.println("4. 빈의 메소드를 호출...");
		bean1.sayHello("스프링");
		bean2.sayHello("Spring");
	}

}
