package com.koitt.java.ch07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
	
	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<String, String>();
		
		hm.put("대한민국", "서울");			// key, value
		hm.put("일본", "동경");
		hm.put("중국", "북경");		
		hm.put("태국", "방콕");
		hm.put("중국", "북경1");			// 기존 중국 key 값이 제일 마지막으로 입력된 값으로 변경된다
		hm.remove("태국");				// key 값 삭제 
				
		System.out.print("키 : " + hm.keySet());			
		System.out.println(" 값 : " + hm.values());
		
		// 1. iterator 방식 이용
		Iterator<String> keys = hm.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			String value = hm.get(key);			// key(대한민국) 의 value(서울) 값 호출 
			System.out.println(key + ": " + value);
		}
		// 2. for-each문
		for(String key : hm.keySet()) {
			String value = hm.get(key);
			System.out.println(key + " : " + value);
		}
		// 3. key 값을 알고 있어서 직접 key갑을 입력하여 값을 꺼낸다.
		String value = hm.get("대한민국");
		System.out.println(value);
	}

}
