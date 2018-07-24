package com.oracle.peoplesoft.bass2.qe.test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.JSONObject;





public class JsonDemo1 {

	public JsonDemo1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createJSONByMap();
		createJSONByBean();
		
		
	}
	
	
	public static void createJSONByMap() {
		Map<String, Object> map=new LinkedHashMap<String,Object>();
		map.put("name", "LaoWang");
		map.put("age", 35);
		map.put("height", 1.73);
		map.put("major", new String[] { "理发", "挖掘机" });
        map.put("hasGirlFriend", false);
        map.put("car", null);
        JSONObject jsonObject=new JSONObject(map);
        System.out.println("方法名:createJSONByMap()---" + jsonObject);
	}
	
	public static void createJSONByBean() {
		Person person=new Person();
		person.setName("Lisi");
		person.setAge(40);
		person.setHasGirlFriend(false);
		person.setHeight(1.75);
		person.setMajor(new String[] {"厨师", "编程" });
		System.out.println("方法名：createJSONByBean()---" + new JSONObject(person));
		
	}

}

class Person{
	private String name;
	private int age;
	private double height;
	private String[] major;
	private boolean hasGirlFriend;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String[] getMajor() {
		return major;
	}
	public void setMajor(String[] major) {
		this.major = major;
	}
	public boolean isHasGirlFriend() {
		return hasGirlFriend;
	}
	public void setHasGirlFriend(boolean hasGirlFriend) {
		this.hasGirlFriend = hasGirlFriend;
	}
	
	public String toString() {
		 return "Person [name=" + name + ", age=" + age + ", height=" + height
                + ", major=" + Arrays.toString(major) + ", hasGirlFriend="
                + hasGirlFriend + "]";
		
	}
}
