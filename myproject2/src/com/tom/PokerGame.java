package com.tom;

import java.util.Random;

public class PokerGame {

	public static void main(String[] args) {
		int[] n = new int[10];
		Card[] c = new Card[10];
		System.out.println(n[0]);
		c[0] = new Card(45);
		System.out.println(c[0].get());
		
		Poker poker = new Poker();
		poker.shuffle();
		poker.print();
		
		// TODO Auto-generated method stub
		/*int[] flowers = {0x2663, 0x2665, 0x2660, 0x2666};
		int[] nums = new int[5];
		nums[0] = 76;
		nums[4] = 98;
		System.out.println(nums[0]);
		System.out.println(nums.length);
		for(int i = 0; i<nums.length; i++){
			System.out.println(nums[i]);
		}
		char f = 0x2663;
		System.out.println(f); 
		char a = 0x2665;
		System.out.println(a);
		
		Random random = new Random();
		int num = random.nextInt(13)+1;
		int flower = random.nextInt(4);
		System.out.print(num);
		char c = 0;
		switch(flower) {
		case 0:
			c = 'F';
			break;
		case 1:
			c = 'D';
			break;
		case 2:
			c = 'S';
			break;
		case 3:
			c = 'H';
			break;
		}*/
		
	}

}
