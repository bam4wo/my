package com.tom;

public class Classmate {
	String name;
	int chinese;
	int art;
	
	public Classmate(String name, int chinese, int art) {
		this.name = name;
		this.chinese = chinese;
		this.art = art;
	}
	
	
	public void print() {
		System.out.println(name+"\t"+chinese+"\t"+art+"\t"+(chinese+art)/2);
	}
	

}
