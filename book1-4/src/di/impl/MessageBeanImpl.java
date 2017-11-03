package di.impl;

import di.MessageBean;

public class MessageBeanImpl implements MessageBean {
	private String name;
	
	

	public void setName(String name) {
		this.name = name;
	}



	public void sayHello() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Hello, "+name+"!");
	}
	
}
