package di.step1;

//Interface를 이용한 클래스 = Component!!
public class MessageBeanEN implements MessageBean{

	public MessageBeanEN() {
		System.out.println("EN Bean 생성");
	}
	@Override
	public void sayHello(String str) {//biz logic이라고 생각하자..
		// TODO Auto-generated method stub
		System.out.println("Hello..."+str);		
	}

}
