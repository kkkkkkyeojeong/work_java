package com.koitt.java.class03;

public class TestDrive {
	public static void main(String[] args) {
		
		// 고양이 케이 한마리 생성
		Cat kei = new Cat("케이", 1);
		
		// 주인 생성 - 예은 주인이 kei 고양이 소유함 
		// 2마리를 소유
		Cat[] cats = new Cat[2];
		cats[0] = new Cat("일냥이", 3);
		cats[1] = new Cat("이냥이", 2);
		Owner yeEun = new Owner("예은", "서울", cats);
		
		// 주인이 소유한 고양이 소개 하는 메소드 호출 
		yeEun.introCat();
		
		// 해피 고양이 생성
		Cat happy = new Cat("해피", 5);
		
		Cat[] cats2 = new Cat[3];
		cats2[0] = new Cat("삼냥이", 5);
		cats2[1] = new Cat("사냥이", 2);
		cats2[2] = new Cat("오냥이", 1);
		Owner gildong = new Owner("길동", "경기도", cats2);
		
		gildong.introCat();
		
		// 분양받을 고양이를 생성한다.
		Cat happy2 = new Cat("해피2호",1);
		
		// 주인(홍길동)이 새로 고양이 분양받는다. 
		gildong.setCat1(cats);
		
		// 주인 새로 분양받은 고양이를 소개한다.
		gildong.introCat();
		
	}

}
