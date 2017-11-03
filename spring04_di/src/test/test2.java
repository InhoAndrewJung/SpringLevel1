package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kosta.di.MessageBean;
import com.kosta.di.Outputer;

public class test2 {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("resources/msg2.xml");//classPath는 src안씀
		System.out.println("1. 공장생성");
		
		//3. 생성되어서 공장이 가지고 있는 빈을 요청 :: getBean()
		System.out.println("3. 공장에서 빈을 가져옵니다...");
		MessageBean bean = factory.getBean("msg", MessageBean.class);//싱글톤으로 생성됨



		//4. 빈의 메소드를 수행...결과를 확인
		System.out.println("4. 빈의 메소드를 호출..." + bean.sayHello());
		//추가
		System.out.println("=============================");
		Outputer output = (Outputer)factory.getBean("output");
		output.output("파일로 출력!! 성공!!");

	}

}
