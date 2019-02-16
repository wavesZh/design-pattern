package com.waves.pattern.creational.factorymethod;

public class BFactory extends Factory {
	@Override
	public Product factoryMethod() {
		return new ProductB();
	}

	public static class ProductB extends Product {
		@Override
		public String getName() {
			return "Product B";
		}
	}
}
