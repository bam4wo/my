package com.www;

import java.util.Random;
import java.util.Scanner;

public class E3number {
	public static void main(String[] args) {
		Random random = new Random();
		int secret = random.nextInt((10)+1);
		int count = 0;
		System.out.println(secret);
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("your guess:");
			int n = scanner.nextInt();
			count++;
			if(n < secret){
				System.out.println("higher");
			}else if(n > secret){
				System.out.println("lower");
			}else{
				if(count <= 2){
					System.out.printf("excellent! The secret number is %d",secret);
				}else {
					System.out.printf("Great! The secret number is %d",secret);
				}
			    break;
			}
		}
	}
	

}
