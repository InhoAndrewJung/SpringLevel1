package jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class jdbcMainTest1 {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("jdbc/jdbc.xml");
		
		MemberDao dao = (MemberDao)factory.getBean("dao");
		MemberVO vo = new MemberVO("1010", "1010", "快府笼 碍巢备", "老魂");
		//dao.register(vo);
		System.out.println("regist ok  "+vo );
		
		System.out.println("===============getList()===================");
		List<MemberVO> list = dao.getList();
		for(MemberVO m : list) {
			System.out.println(m);
		}
		
		System.out.println("===============getSearch()===================");
		System.out.println(dao.getSearch("1010"));
	}

}
