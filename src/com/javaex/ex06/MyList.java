package com.javaex.ex06;

import java.util.ArrayList;

public class MyList {

	public static void main(String[] args) {

		ArrayList<Circle> circleList = new ArrayList<Circle>();
		
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(15);
		Circle c03 = new Circle(100);
		
		circleList.add(c01);
		circleList.add(c02);
		circleList.add(c03);
		
		System.out.println("circle0list는 몇개?");
		System.out.print(circleList.size());
		System.out.println("개!");
		
		circleList.remove(1);
		
		for(int i=0; i<circleList.size();i++) {
			System.out.println(circleList.get(i));
		}
	}

}
