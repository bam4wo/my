package com.www;

import java.util.Scanner;

public class Member {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("are you 20?(y/n)");
		Scanner scanner = new Scanner(System.in);
		String c = scanner.nextLine();
		boolean adult = c.equalsIgnoreCase("y");
		Mem mem = new Mem(adult);
		if(mem.adult) {
			mem.inpot();
		}else{
			System.out.println("bye");
		}
		
	}

}
