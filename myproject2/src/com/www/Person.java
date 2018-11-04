package com.www;

import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bmi p = new Bmi(60.5f , 1.7f);
		//System.out.println(p.bmi());
		//System.out.println(3 > 5);
		//System.out.println(3 == 5);
		System.out.println("enter c (-100~100)");
		Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			boolean c = a<=100 && a>=-100;
			System.out.println(c);
		
		
	}

}
