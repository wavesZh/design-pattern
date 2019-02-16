package com.waves.pattern.creational.factorymethod;

/**
 * 工厂方法模式
 *
 * 工厂方法把简单工厂的内部逻辑判断移到了客户端
 *
 */
public class FactoryMethodExample {

	public static void main(String[] args) {
		Factory factory = new AFactory();
		Product product = factory.factoryMethod();
		System.out.println(product.getName());
	}
}
