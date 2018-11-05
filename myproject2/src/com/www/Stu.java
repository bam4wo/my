package com.www;

public class Stu {
	String name;
	int math;
	int art;
	int weight;
	int height;
	int age;
	
	public Stu(String name,int math, int art) {
		this.name = name;
		this.math = math;
		this.art = art;
	}
	public Stu( int weight, int height, int age) {
		this.weight = weight;
		this.height = height;
		this.age = age;
	}
	public void print() {
		System.out.println(name + "\t" + math + "\t" + art + "\t"
				+ (math+art)/2 );
	}
}
