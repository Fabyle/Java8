package edu.fle.behaviorParametrization;

import java.util.ArrayList;
import java.util.List;

import edu.fle.behaviorParametrization.predicate.ApplePredicate;

public class FilterGreenApples {
	
	

	public static void main(String[] args) {
	
		Apple apple1 = new Apple("green",150);
		Apple apple2 = new Apple("green",100);
		Apple apple3 = new Apple("blue",50);
		Apple apple4 = new Apple("green",200);
		Apple apple5 = new Apple("red",170);
		Apple apple6 = new Apple("red",50);
		
		List<Apple> inventory = new ArrayList<Apple>();
		inventory.add(apple1);
		inventory.add(apple2);
		inventory.add(apple3);
		inventory.add(apple4);
		inventory.add(apple5);
		inventory.add(apple6);
		
		
		filterGreenApples(inventory);
		filterApplesByColor(inventory,"green");
		filterApplesByColor(inventory,"red");
		filterApplesByWeight(inventory,150);

	}
	
	public static List<Apple> filterGreenApples(List<Apple> inventory){
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory){
			if ("green".equals(apple.getColor())){
				result.add(apple);
			}
		}
		return result;
	}
	
	public static List<Apple> filterApplesByColor(List<Apple> inventory,String color){
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory){
			if (color.equals(apple.getColor())){
				result.add(apple);
			}
		}
		return result;
	}
	
	public static List<Apple> filterApplesByWeight(List<Apple> inventory,int weight){
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory){
			if (apple.getWeight()> weight){
				result.add(apple);
			}
		}
		return result;
	}
	
	public static List<Apple> filterApples(List<Apple> inventory,ApplePredicate p){
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory){
			if (p.test(apple)){
				result.add(apple);
			}
		}
		return result;
	}

}
