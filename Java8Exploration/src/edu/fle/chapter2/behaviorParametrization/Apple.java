package edu.fle.chapter2.behaviorParametrization;

public class Apple {
	
	String color;
	Integer weight;
	
	public Apple(String color, Integer weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	
	public Apple(String color) {
		super();
		this.color = color;
	}

	

	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}



	public Integer getWeight() {
		return weight;
	}

}
