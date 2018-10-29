package com.tom;

import java.util.Scanner;

public class SingUp {

	public static void main(String[] args) {
		System.out.println("Are you 18?(y/n)");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		boolean adult = line.equalsIgnoreCase("y");
		Member member = new Member(adult);
		if (member.adult) {
			member.starInpot();
		}else{
			System.out.println("bye");
		}
	 
		System.out.println("gender(boy/girl)");
		String sex1= scanner.nextLine();
		boolean gender = sex1.equalsIgnoreCase("boy") || sex1.equalsIgnoreCase("girl");
		Sex sex = new Sex(gender);
		
				
		
	}
}
