package com.boris.company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/boris/company/beans/beans.xml");
		
		Student person = (Student)context.getBean("student");
		Student person1 = (Student)context.getBean("student");
		
		person.setSchoolNumber(222);
		
		System.out.println(person);
		System.out.println(person1);
		
		
		person.talk();
		
		Subject subject = (Subject)context.getBean("subject");
		Subject subject2 = (Subject)context.getBean("subject2"
				+ "");
		System.out.println(person);
		System.out.println(subject);
		System.out.println(subject2);
		
		
		Department department = (Department)context.getBean("deparment");
		System.out.println(department);
		
		Sports sports = (Sports)context.getBean("sports");
		System.out.println(sports);
		
		
		Building building = (Building)context.getBean("building");
		
		System.out.println(building);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}