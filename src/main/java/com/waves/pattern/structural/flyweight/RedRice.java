package com.waves.pattern.structural.flyweight;

public class RedRice extends Rice {

	public RedRice(int price) {
		this.price = price;
	}

	@Override
	void show() {
		System.out.println("Red rice price is " + price);
	}
}
