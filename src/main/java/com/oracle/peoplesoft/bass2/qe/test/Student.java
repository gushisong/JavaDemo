package com.oracle.peoplesoft.bass2.qe.test;

public class Student {

	public Student() {
		// TODO Auto-generated constructor stub
		
	}
	private String name;  
    private String examid;  
    private String idcart;  
    private String location;  
    private String grade;  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public String getExamid() {  
        return examid;  
    }  
    public void setExamid(String examid) {  
        this.examid = examid;  
    }  
    public String getIdcart() {  
        return idcart;  
    }  
    public void setIdcart(String idcart) {  
        this.idcart = idcart;  
    }  
    public String getLocation() {  
        return location;  
    }  
    public void setLocation(String location) {  
        this.location = location;  
    }  
    public String getGrade() {  
        return grade;  
    }  
    public void setGrade(String grade) {  
        this.grade = grade;  
    }  
      
    public String toString(){  
        return "姓名：" + name + ",身份证号：" + idcart + ",准考证号：" + examid + ",地区：" + location + ",成绩：" + grade;  
    }  

}
