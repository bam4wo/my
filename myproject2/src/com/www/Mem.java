package com.www;

import java.util.Scanner;

public class Mem {
	boolean adult;
	String name;
	String nickname;
	int age;
	int weight;
	int height;
	
	public Mem(boolean adult) {
		this.adult = adult;
	}
	
	public Mem(String name, String nickname) {
		this.name = name;
		this.nickname = nickname;
	}
	
	public Mem(int age, int weight, int height) {
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	public void inpot() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("name");
		String a = scanner.nextLine();
		System.out.println("nickname");
		String b = scanner.nextLine();
		System.out.println("age");
		int c = scanner.nextInt();
		System.out.println("weight");
		int d = scanner.nextInt();
		System.out.println("height");
		int e = scanner.nextInt();
		
	}
	public float bmi() {
		float bmi = weight / (height*height);
		return bmi;
	}
	
}
