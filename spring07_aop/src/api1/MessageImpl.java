package api1;
/*
 * Target Class :: Core Concern�� ����ִ�.
 */
public class MessageImpl implements Message{
	private String message;//
	
	public MessageImpl(String message) {
		super();
		this.message = message;
	}

	public String print() {
		// TODO Auto-generated method stub
		return "Good Day!!";
	}

	public String message() {
		// TODO Auto-generated method stub
		return message;
	}

	public void searchMember(String id) {
		System.out.println("searchMember....call..."+id);
		
	}

	public void searchMemberByAddress(String address) {
		// TODO Auto-generated method stub
		System.out.println("searchAddress....call..."+address);

		
	}

}