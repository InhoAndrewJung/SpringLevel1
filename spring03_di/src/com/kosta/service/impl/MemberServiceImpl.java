package com.kosta.service.impl;

import com.kosta.service.MemberService;

/*
 * 빈 설정문서
 * ::
 * 1. bean id class="fqcn"
 * 2. 값 주입 @필드
 * 		1)생성자 2)setter
 * 
 */


public class MemberServiceImpl implements MemberService{
	private int no; //생성자
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

	public String msg() {
		// TODO Auto-generated method stub
		return null;
	}


	

}
