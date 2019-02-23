package com.waves.pattern.structural.flyweight;

public class BlackRice extends Rice {

	public BlackRice(int price) {
		this.price = price;
	}

	@Override
	void show() {
		System.out.println("Red rice price is " + price);
	}
}
