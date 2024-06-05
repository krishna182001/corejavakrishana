package com.oops.inheritance;

public class Animal {
	private float height;
	private String color;
	private String noise;
	public Animal() {
		
		// TODO Auto-generated constructor stub
	}
	public Animal(float height, String color, String noise) {
		
		this.height = height;
		this.color = color;
		this.noise = noise;
	}
	
	public float getheight() {
		return height;
	}
	public void setheight(float height) {
		this.height=height;
	}
	
	public String color() {
		return color;
		
	}
	public void setcolor(String color) {
		this.color=color;
	}
	
	public String getnoise() {
		return noise;
	}
	public void setnoise(String noise) {
		this.noise=noise;
	}
	@Override
	public String toString() {
		return "Animal [height=" + height + ", color=" + color + ", noise=" + noise + "]";
	}
		

}
