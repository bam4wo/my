package com.www;

import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(true){
				System.out.print("Please enter number of tickets:");
				int a = scanner.nextInt();
				if(a > -1 || a<-1){
					System.out.println("How many round-trip tickets:");
				    int b = scanner.nextInt();
				    int c = a - b;
				    Ticket s = new Ticket(c);
				    Ticket t = new Ticket(b);
				    System.out.printf("Total tickets:%d Round-trip:%d Total:%d \n", a, b, s.singal()+t.two());
			    }else{
				   break;
			    }
			
		}
		
	}

}
