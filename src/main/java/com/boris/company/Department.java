package com.boris.company;

import java.util.List;

public class Department {
	
	private String name;
	private List<String> teachers;
	

	
	public Department(String name, List<String> teachers) {
	
		this.name = name;
		this.teachers = teachers;
	}
	
	//to do a toString method you have to do StringBuilder 
	public String toString(){
		
		StringBuilder sb = new StringBuilder();
		//this is just one string
		sb.append(name);
		sb.append(" contains: \n");
		
		//list of strings
	    for(String teacher:teachers){
	    	
	    	sb.append(teacher);
	    	sb.append("\n");
	    	
	    }
	    
	    return sb.toString();
	}
	
	

}
