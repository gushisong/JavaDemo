package com.oracle.peoplesoft.bass2.qe.test;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class Dom4jDemo {

	public Dom4jDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Dom4jDemo dom4jDemo=new Dom4jDemo();
		System.out.println(dom4jDemo.getDocument());
	}
	
	public Document getDocument() throws Exception {
		
		SAXReader reader=new SAXReader();
		Document document=reader.read(new File("src//exam.xml"));
		return document;
		
	}

}
