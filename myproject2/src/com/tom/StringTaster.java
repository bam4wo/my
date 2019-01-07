package com.tom;

import java.util.Scanner;

public class StringTaster {

	public static void main(String[] args) {
		String s = "Hello brooo";
		System.out.println(s.substring(5));
		System.out.println(s.substring(4, 8));
		
		
		for(int i = s.length()-1; i>=0; i--){
			System.out.print(s.charAt(i));
    	}

    	System.out.println();
    	System.out.println(s.indexOf("e"));
    	System.out.println(s.lastIndexOf("o"));
    
    	String x = "Hank Tom Jack";
    	String name = "Tom";
    	int index = x.indexOf(name);
    	System.out.println(index);
    	System.out.println(x.substring(0,index)+"Boss"+x.substring(index+name.length(),x.length()));
    
    	int n = Integer.parseInt("55");
    	System.out.println(n);
    	byte m = Byte.parseByte("56");
    	System.out.println(m);
    	float l = Float.parseFloat("66");
    	System.out.println(l);
    	double o = Double.parseDouble("88");
    	System.out.println(o);
    	long d = Long.parseLong("89");
    	System.out.println(d);
    
    	
    	String s1 = new String("ABC");
    	String s2 = new String("ABC");
    	System.out.println(s1==s2);
    	boolean c  = s1.equals(s2);
    	System.out.println(c);
    	
    	String s11 = "abc";
    	String s22 = "abc";
    	System.out.println(s11==s22);
    	
    	String pp = "abcde";
    	System.out.println(pp);
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Pleas enter number(0~10)");
    	int r = scanner.nextInt();
    	if(r>5) {
    		System.out.println("sorry");
    	}else {
    		System.out.println("thanks");
    	}
    	
	}

}
