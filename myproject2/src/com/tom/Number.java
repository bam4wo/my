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
		int n = scanner.nextInt();
		if(n > secret){
			System.out.printf("0 ~ %d" + "\n", n);
		}else if(n < secret){
			System.out.printf("%d ~ 100" + "\n",n);
		}else {
			System.out.println("bingo");
		}
		while(true) {
			int s = scanner.nextInt();
			if(s > secret  && s < n  ) {
				System.out.printf("0 ~ %d " + "\n", s);
			}else if(s < secret && s > n  ){
				System.out.printf("%d ~ 100 " + "\n", s );
			}else if(s > secret && s > n  || s < secret && s < n ) {
				System.out.printf("%d ~ %d ",s ,n );
			}else {
				System.out.println("bingo");
			}
		
		}
	}

}
