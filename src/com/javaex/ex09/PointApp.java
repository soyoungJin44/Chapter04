package com.javaex.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {

		Map<String, Point> pMap = new HashMap<String, Point>();
		
		Point p01 = new Point(1,2);		//p01이 데이처
		Point p02 = new Point(3,4);
		Point p03 = new Point(1,2);
		
		pMap.put("문준원", p01); //pMap.add()가 아닌 키,값을 입력해야하기때문에 put으로 해야한다.
		pMap.put("이창섭", p02);
		pMap.put("조진웅", p03);
		
		System.out.println(pMap.size());
		System.out.println(pMap.toString());
		
		pMap.get("문준원");
		System.out.println(pMap.get("문준원").getX());
		
		
		//주소 자체를 아예 바꿔버린거임. (수정용)(키값이 같으면)
		Point p04 = new Point(2,5);
		pMap.put("문준원", p04);
		
		System.out.println(pMap.get("문준원"));
		System.out.println("=============");
		
		//이름에 공통점이 없기 때문에 이름들을 다 외우고 있어도 출력을 한번에 하기가 힘듦.. >>이름(키)리스트는 자체적으로 관리중. 줘 하면 줌 ㅎㅎ
		Set<String> key = pMap.keySet();
		
		for(String name : key) {
			System.out.println(pMap.get(name).toString());
		}
		System.out.println("===================");
		
		Map<String,String> guestbookMap = new HashMap<String,String>();
		guestbookMap.put("date", "2024-07-12");
		guestbookMap.put("userName", "정우성");
		guestbookMap.put("pw", "1234");
		guestbookMap.put("contents", "왔다갑니다~");
		
		System.out.println(guestbookMap.get("userName"));
		System.out.println(guestbookMap.get("contents"));
		
		
		
		
	}

}
