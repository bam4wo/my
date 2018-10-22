package com.tom;

public class Friend {
	String blood;
	int age;
	float number;
	
	public Friend(String blood, int age, float number) {
		this.blood = blood;
		this.age = age;
		this.number = number;
	}
	
	
	public void print() {
		System.out.println(blood+"\t"+age+"\t"+number+"\t"+(age+number)*2);
	}

}
