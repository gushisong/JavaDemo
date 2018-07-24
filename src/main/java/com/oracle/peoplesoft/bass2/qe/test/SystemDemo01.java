package com.oracle.peoplesoft.bass2.qe.test;

import java.io.OutputStream;

public class SystemDemo01 {

	public SystemDemo01() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OutputStream outputStream=System.out;
		try {
			outputStream.write("hello world!!!".getBytes());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		String string="Hello";
		

	}

}
