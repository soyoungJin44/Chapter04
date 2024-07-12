package com.javaex.ex07;

import java.util.HashSet;

public class Ex01 {

	public static void main(String[] args) {
		
		//표현만 이렇게 해주고 배열과 다르게 순서대로 정리되어있지않다. (꾸러미 안에 값들이 섞여서 들어있다고 생각)
		//같은 값을 넣으면 애초에 값이 들어가지 않는다. (ex. 3,3,3을 i01~03까지에 넣으면 size로 출력했을 때 1개로 출력된다.
		
		
		HashSet<Integer> iSet = new HashSet<Integer>();
		
		Integer i01 = 3;
		Integer i02 = 6;
		Integer i03 = 9;
		
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		
		System.out.println(iSet.size());
		System.out.println(iSet.toString());
		System.out.println("==================");
		
		//**방 번호가 없기 때문에 for문으로 꺼내올수가없음
		//for(int i=0; i<iSet.size();i++) {
		for(Integer no : iSet) {
			System.out.println(no.toString());	//no 로 출력해도됨 (println에 포함되어있는 기능으로 기본 toString() 으로 사용되기때문에 생략가능)
		}
		
		
			
		
	}
}
