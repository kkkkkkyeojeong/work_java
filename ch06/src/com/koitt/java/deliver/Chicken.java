package com.koitt.java.deliver;

public class Chicken extends Process{

	@Override
	public void ordering() {
		System.out.println("치킨 주문을 받는다.");
	}

	@Override
	public void cooking() {
		System.out.println("치킨을 만들기 시작한다.");
	}

	@Override
	public void delivering() {
		System.out.println("치킨 배달원이 배달을 한다.");
	}

	@Override
	public void payment() {
		System.out.println("치킨 배달원이 결제 받는다.");
	}

}
