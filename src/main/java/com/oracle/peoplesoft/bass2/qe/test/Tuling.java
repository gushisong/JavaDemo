package com.oracle.peoplesoft.bass2.qe.test;

import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Tuling {
	
	public static final String url="https://www.tuling123.com/openapi/api";
	
	
	public static String sendPost(String param) {
		OutputStreamWriter oStreamWriter=null;
		BufferedReader bReader=null;
		String result="";
		
		try {
			URL realURL=new URL(url);
			
			HttpURLConnection conn=(HttpsURLConnection) realURL.openConnection();
			
			conn.setDoOutput(true);
			conn.setDoInput(true);
			
			conn.setUseCaches(true);
			conn.setRequestMethod("POST");
			conn.setConnectTimeout(5000);
			conn.setReadTimeout(5000);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("Authorization", "token");
            conn.setRequestProperty("tag", "htc_new");
            
            JSONObject obj=new JSONObject();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public Tuling() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
