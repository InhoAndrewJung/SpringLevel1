package di.step1;

//Interface�� �̿��� Ŭ���� = Component!!
public class MessageBeanKR implements MessageBean{

	public MessageBeanKR() {
		System.out.println("KR Bean ����");
	}
	@Override
	public void sayHello(String str) {//biz logic�̶�� ��������..
		// TODO Auto-generated method stub
		System.out.println("�ȳ�..."+str);		
	}

}
