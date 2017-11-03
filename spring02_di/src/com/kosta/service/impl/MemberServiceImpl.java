package com.kosta.service.impl;
/*
 * �� ��������
 * ::
 * 1. bean id class="fqcn"
 * 2. �� ���� @�ʵ�
 * 		1)������ 2)setter
 * 
 */
import com.kosta.service.MemberService;

public class MemberServiceImpl implements MemberService{
	private int no; //������
	private String name;//setter
	private Integer date;//setter
	
	public MemberServiceImpl(int no) {
		super();
		this.no = no;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setDate(Integer date) {
		this.date = date;
	}

	@Override
	public String msg() {
		
		return name+"�ȴ�!!"+date+" "+no;
	}
	

}