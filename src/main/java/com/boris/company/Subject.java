package com.boris.company;

public class Subject {
	
	private String history;
	private String biology;
	
	public Subject() {
		
		
		
	}
	
	
	public Subject(String history, String biology) {
		
		
		this.history = history;
		this.biology = biology;
	}
	
	public void init(){
		
		System.out.println("subject created " + this);
	}

	
	
	public String getHistory() {
		return history;
	}


	public void setHistory(String history) {
		this.history = history;
	}


	public String getBiology() {
		return biology;
	}


	public void setBiology(String biology) {
		this.biology = biology;
	}


	@Override
	public String toString() {
		return "Class [history=" + history + ", biology=" + biology + "]";
	}
	
	

}
