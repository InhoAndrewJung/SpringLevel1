package di.step1;

//Interface를 이용한 클래스 = Component!!
public class MessageBeanKR implements MessageBean{

	public MessageBeanKR() {
		System.out.println("KR Bean 생성");
	}
	@Override
	public void sayHello(String str) {//biz logic이라고 생각하자..
		// TODO Auto-generated method stub
		System.out.println("안녕..."+str);		
	}

}
