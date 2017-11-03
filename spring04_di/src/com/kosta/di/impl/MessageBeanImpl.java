package com.kosta.di.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.kosta.di.MessageBean;
import com.kosta.di.Outputer;

public class MessageBeanImpl implements MessageBean{
	private String name; // ������ ����(property �̿�)
	private String greeting; // setter ����
	
	//�߰�
	@Autowired
	private Outputer outputer;
	
	
	//�߰�
/*	public void setOutputer(Outputer outputer) {
		this.outputer = outputer;
	}*/

	public MessageBeanImpl(String name) {
		super();
		this.name = name;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String sayHello() {
		// TODO Auto-generated method stub
		return name+greeting;
	}








}