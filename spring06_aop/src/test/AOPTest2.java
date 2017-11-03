package test;

import org.springframework.aop.framework.ProxyFactoryBean;

import solv1.MemberService;
import solv1.ProductService;
import solv1.ServiceAdvice;

public class AOPTest2 {

	public static void main(String[] args) {
		//target, advice 클래스를 직접생성
		MemberService mem = new MemberService();
		ProductService pro = new ProductService();
		ServiceAdvice advice = new ServiceAdvice();
		
		//ProxyFactoryBean를 생성 ->AOP는 Bean Factory를 이용하지 않음!!
		ProxyFactoryBean pfBean = new ProxyFactoryBean();
		
		pfBean.setTarget(mem); //pro는 일부러 target에 넣지 않았다.
		pfBean.addAdvice(advice);
		
		//ProxyFactoryBean에서 target을 찾아온다.
		MemberService pfMem = (MemberService)pfBean.getObject();
		pfMem.register();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		mem.register();

	}

}
