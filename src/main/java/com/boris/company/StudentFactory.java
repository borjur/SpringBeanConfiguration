package com.boris.company;

public class StudentFactory {
	
	public Student createStudent(int id,String name){
		System.out.println("created factory-class");
		return new Student(id,name);
	}

}
