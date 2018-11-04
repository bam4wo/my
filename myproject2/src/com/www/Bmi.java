package com.www;

public class Bmi {
	float weight;
	float height;
	
	public Bmi(float weight,float height) {
		this.weight = weight;
		this.height = height;
	}
	
	public float bmi() {
		float bmi = weight / (height*height);
		return bmi;
	}
}
