package com.tom;

public class StringTaster {

	public static void main(String[] args) {
		String s = "Hello brooo";
		System.out.println(s.substring(5));
		System.out.println(s.substring(4, 5));
		
		
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
    	
	}

}