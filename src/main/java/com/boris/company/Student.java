package com.boris.company;

public class Student {
	
	private int id;
	private String name;
	
	private int schoolNumber;
	
	private Subject subject;
	
	public Student(){
		
	}
	
	public static Student getInstance(int id, String name){
		System.out.println("created factory-method");
		return new Student(id,name);
	}
	
	public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	
    //property
	public void setSchoolNumber(int schoolNumber) {
		this.schoolNumber = schoolNumber;
	}


	
//property
	public void setSubject(Subject subject) {
		this.subject = subject;
	}



	public void talk(){
		
		System.out.println("hello this is student");
	}

    // "this" will get into toString
	public void creating(){
		System.out.println("Student is created" + this);
	}
	
	public void destroying(){
		
		System.out.println("Person is destroyed" + this);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", schoolNumber="
				+ schoolNumber + ", subject=" + subject + "]";
	}


	
	

}
