package com.javaex.ex06;

public class Circle {

	//필드
	private int radius;
	
	//생성자
	public Circle() {
		super();
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}

	//메서드 gs
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	//메서드 일반
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}
