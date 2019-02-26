package com.tom;

public class Master {
	String name;
	int age;
	int phone;
	float weight;
	float height;
	
	public Master(String name, int age, int phone, float weight, float height) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.weight = weight;
		this.height = height;
	}
	
	public void print() {
		System.out.println(name +"\t"+ age +"\t"+ phone + "\t"+ weight +"\t"+ height);
	}

}
