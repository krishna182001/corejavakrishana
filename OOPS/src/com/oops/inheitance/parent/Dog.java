package com.oops.inheitance.parent;
import com.oops.inheritance.*;

public class Dog extends Animal{
	private int legs ;
	
	public Dog() {}

	public Dog(float height,String color,String noise,int legs) {
		super(height,color,noise);
		this.legs = legs;
	}
	
	public Dog(int legs) {
		super();
		this.legs=legs;
	}
	
	public int getlegs() {
		return legs;
	}
	public void setlegs(int legs) {
		this.legs=legs;
	}

	@Override
	public String toString() {
		return " Dog [legs="
				+ "Animal = | " + super.toString() + "]";
	}
	
	
	

}
