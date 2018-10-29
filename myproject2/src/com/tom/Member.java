package com.tom;

import java.util.Scanner;

public class Member {
		boolean adult;
		int age;
		String name;
		String niclName;
		
		public Member (boolean adult) {
			this.adult = adult;
		}
		
	
		
		public Member (int age, String name, String nickname) {
			this.age = age;
			this.name = name;
			this.niclName = nickname;
		}
		
	    public void starInpot() {
	    	Scanner scanner = new Scanner(System.in);
	    	System.out.println("Your age?");
	    	int age = scanner.nextInt();
	    	scanner.nextLine();
	    	System.out.println("name");
	    	String name = scanner.nextLine();
	    	System.out.println("nickname");
	    	String nickname = scanner.nextLine();
	    }
	
	    
	    
}
