package di.step1;

//Interface�� �̿��� Ŭ���� = Component!!
public class MessageBeanEN implements MessageBean{

	public MessageBeanEN() {
		System.out.println("EN Bean ����");
	}
	@Override
	public void sayHello(String str) {//biz logic�̶�� ��������..
		// TODO Auto-generated method stub
		System.out.println("Hello..."+str);		
	}

}
