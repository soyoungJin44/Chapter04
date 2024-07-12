package com.javaex.ex07;

import java.util.Set;
import java.util.TreeSet;

public class Ex02 {

	public static void main(String[] args) {

		
			///HashSet : 꾸러미에 값을 넣는다
		Set<Integer> lotto = new TreeSet<Integer>();  //TreeSet : HashSet 이랑 기능은 같음. 높은숫자부터 순서대로 출력해줘라는뜻
		
		
		while(true) {
			
			int no = (int)(Math.random()*45)+1;	//랜덤으로 숫자 받는 식
			lotto.add(no);
			
			if(lotto.size() == 6) {
				break;
			}
			
		}
		//System.out.println(lotto.toString()); >> [132,312,5,231,5,] 이런식으로 묶여서 나오고
		
		for(Integer no : lotto) {			//값을 따로따로 하나씩 출력됨
			System.out.println(no);
		}
		System.out.println("============");
	}
}