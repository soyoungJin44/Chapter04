package com.javaex.ex04;

import java.util.ArrayList;			//맨날 import 까먹음 ㅇㅇ (c+s+o)

public class MyListApp {

	public static void main(String[] args) {

		ArrayList<Point> pList = new ArrayList<Point>();	//Point 껄 관리한다.
		
		Point p01 = new Point(3,2);
		Point p02 = new Point(4,5);
		Point p03 = new Point(8,10);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		System.out.println(pList.size());		//갯수찾는거 ==lenght
		
		Point p = pList.get(1);		//
		System.out.println(p.getY());	//y값 찾는것
		
		Point p2 = pList.get(2);
		System.out.println(p2.getX());
		
		for(int i=0; i<pList.size();i++) {
			
			Point pp = pList.get(i);
			System.out.println(pp.toString()); 
			System.out.println("===============");
		}
		
		pList.remove(1);  //remove : 해당번호방에 있는 값 지움
		for(int i=0; i<pList.size();i++) {
					
					Point pp = pList.get(i);
					System.out.println(pp.toString()); 
					System.out.println("============");
				}
		System.out.println(pList.toString());
	}

}
