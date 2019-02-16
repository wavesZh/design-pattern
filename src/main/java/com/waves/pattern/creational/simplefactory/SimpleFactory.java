package com.waves.pattern.creational.simplefactory;

/**
 * 简单工厂模式
 * 将类的实例化操作与使用对象操作分离。避免了直接实例化类，不需要显示指定product类型，将选择逻辑放入factory中，降低了耦合。
 * 缺点：如需要增加新的product，则需要修改factory，这违反了开闭原则（OCP）。
 * 适用场景：product比较固定且不需要增加
 */
public class SimpleFactory {

	private static String PRODUCT_A_NAME = "A";
	private static String PRODUCT_B_NAME = "B";

	public static Product createProduct(String name) {
		switch (name) {
			case "A" : return new ProductA();
			case "B" : return new ProductB();
			default: return null;
		}
	}

	public static class ProductA extends Product {
		@Override
		public String getName() {
			return "Product A";
		}
	}

	public static class ProductB extends Product {
		@Override
		public String getName() {
			return "Product B";
		}
	}

	public static void main(String[] args) {
		Product product = SimpleFactory.createProduct(PRODUCT_A_NAME);
		System.out.println(product.getName());
	}
}
