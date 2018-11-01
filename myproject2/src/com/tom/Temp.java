package com.tom;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please emter temperature(Celsius)");
		double c = scanner.nextDouble();
		Temperature f = new Temperature(c);
		Temperature k = new Temperature(c);
		System.out.printf("%.1f C = %.1f F = %.1f K",c , f.Fahrenheit(), k.Kelvin());
	}

}
