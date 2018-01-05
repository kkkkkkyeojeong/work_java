package com.koitt.java.deliver;

// 중국집
public class Chinese extends Process{

	@Override
	public void ordering() {
		System.out.println("중국집에서 주문받는다.");
	}

	@Override
	public void cooking() {
		System.out.println("중국집에서 요리를 만든다.");
	}

	@Override
	public void delivering() {
		System.out.println("중국집에서 배달한다.");
	}

	@Override
	public void payment() {
		System.out.println("중국집 배달원이 결제한다.");
	}

}
