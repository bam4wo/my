package com.tom;

public class Temperature {
	double Celsius;
		
	public Temperature(double celsius) {
		this.Celsius = celsius;
	}
		
	public double Fahrenheit(){
		double Fahrenheit = Celsius*(9.0/5.0)+32;
		return Fahrenheit ;
	}
	
	public double Kelvin() {
		double Kelvin = Celsius+237.15;
		return Kelvin;
	}
}
