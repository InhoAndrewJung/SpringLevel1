package com.kosta.di.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.kosta.di.MessageBean;
import com.kosta.di.Outputer;

public class MessageBeanImpl implements MessageBean{
	private String name; // 생성자 주입(property 이용)
	private String greeting; // setter 주입
	
	//추가
	@Autowired
	private Outputer outputer;
	
	
	//추가
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
