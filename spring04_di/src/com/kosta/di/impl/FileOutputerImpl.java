package com.kosta.di.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.kosta.di.Outputer;

public class FileOutputerImpl implements Outputer{
	private String path;	
	
	public void setPath(String path) {
		this.path = path;
	}


	public void output(String message) {
		//Ư�� ���Ϸ� message�� ����ϴ� ����� �ۼ�...
		try {
			FileWriter fw = new FileWriter(path);
			fw.write(message);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}