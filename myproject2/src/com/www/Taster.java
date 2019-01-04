package com.www;

public class Taster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[10];
		System.out.println(nums[0]);
		System.out.println(nums.length);
		Card[] c = new Card[10];
		c[0] = new Card(45);
		//System.out.println(c[0]);
		int i = 0;
		while(i<4) {
			System.out.println(i);
			i++;
		}
		
		int[] cc = {45,65,23,89,66};
		for(int v=0; v<5; v++) {
			System.out.println(cc[v]);
		}
	}

}
