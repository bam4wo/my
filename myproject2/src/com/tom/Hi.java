package com.tom;

public class Hi {
	float weight;
	float height;
	
	public Hi(float weight, float height){
		this.weight = weight;
		this.height = height;
	}
	
	public float bim() {
		float bim = (weight + height)/2;
		return bim;
		
	}
	
	public void hello() {
		System.out.println("Lay");
	}
	
	

}
