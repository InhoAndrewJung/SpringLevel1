package com.kosta.service.impl;

import com.kosta.service.MemberService;

/*
 * �� ��������
 * ::
 * 1. bean id class="fqcn"
 * 2. �� ���� @�ʵ�
 * 		1)������ 2)setter
 * 
 */


public class MemberServiceImpl implements MemberService{
	private int no; //������
	private String name;//setter
	private Integer date;//setter
	

	
	
	public MemberServiceImpl(int no) {
		super();
		this.no = no;
		System.out.println("�� ����");
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setDate(Integer date) {
		this.date = date;
	}

	public String msg() {
		// TODO Auto-generated method stub
		return no+name+date;
	}


	

}