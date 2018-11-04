package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
	    int secret = random.nextInt((100)+1);
	    System.out.println(secret);
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number(0~100)");
		while(true) {
			int n = scanner.nextInt();
			if(n > secret){
				System.out.printf("%d ~ 0"+"\n", n);
			}else if(n < secret){
				System.out.printf("100 ~ %d"+"\n",n);
			}else {
				System.out.println("bingo");
			}
			
		}
		

	}

}
