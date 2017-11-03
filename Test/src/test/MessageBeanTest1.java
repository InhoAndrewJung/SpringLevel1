package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kosta.service.MemberService;

public class MessageBeanTest1 {

	public static void main(String[] args) {
		//1. 설정문서를 읽어들입니다..springframework.core.io
		/*Resource r= new FileSystemResource("src/resources/messageBean.xml");
				System.out.println("1. 빈 설정문서를 읽어서 r로 반환했습니다...");
				//2. 빈 팩토리 생성(di container)
				BeanFactory factory = new XmlBeanFactory(r);
				System.out.println("2. 빈을 생성할 공장을 하나 만들었습니다...");*/

		ApplicationContext factory = new ClassPathXmlApplicationContext("resources/messageBean1.xml");//classPath는 src안씀
		System.out.println("1. 공장생성");
		
		//3. 생성되어서 공장이 가지고 있는 빈을 요청 :: getBean()
		System.out.println("3. 공장에서 빈을 가져옵니다...");
		MemberService bean = factory.getBean("message1", MemberService.class);//싱글톤으로 생성됨



		//4. 빈의 메소드를 수행...결과를 확인
		System.out.println("4. 빈의 메소드를 호출..."+bean.msg());



	}

}
