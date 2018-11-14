package com.www;

import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scanner = new Scanner(System.in);
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
		}*/
		Scanner scanner = new Scanner(System.in);
		int ticket = 1; 
		while(ticket != 0) {
			System.out.print("Please enter number of tickets:");
			int totalt = scanner.nextInt();
			scanner.nextLine();
			if(ticket != -1) {
				System.out.print("How many round-trip tickets:");
				int tickett = scanner.nextInt();
				System.out.println("Total tickets:"+ totalt);
				System.out.println("Round-trip:" + tickett );
				int t = totalt - tickett;
				Ticket a = new Ticket(tickett);
				Ticket b = new Ticket(t);
				System.out.println("Total:" + b.all());
			}
			
		}
		
		
	}

}
