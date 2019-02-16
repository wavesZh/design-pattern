package com.waves.pattern.creational.factorymethod;

public class AFactory extends Factory {
	@Override
	public Product factoryMethod() {
		return new ProductA();
	}

	public static class ProductA extends Product {
		@Override
		public String getName() {
			return "Product A";
		}
	}
}
