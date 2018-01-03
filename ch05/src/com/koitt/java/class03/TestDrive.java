package com.koitt.java.class03;

public class TestDrive {
	public static void main(String[] args) {
		
		// 고양이 케이 한마리 생성
		Cat kei = new Cat("케이", 1);
		
		// 주인 생성 - 예은 주인이 kei 고양이 소유함 
		Owner yeEun = new Owner("예은", "서울", kei);
		
		// 주인이 소유한 고양이 소개 하는 메소드 호출 
		yeEun.introCat();
		
		// 해피 고양이 생성
		Cat happy = new Cat("해피", 5);
		
		Owner kildong = new Owner("길동", "경기도", happy);
		
		kildong.introCat();
		
	}

}
