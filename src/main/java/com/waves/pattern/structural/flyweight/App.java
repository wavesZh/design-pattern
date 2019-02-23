package com.waves.pattern.structural.flyweight;

/**
 * 享元模式
 *
 * 单例+工厂模式
 * 一个类中含有大量相似对象，对象对外是共享的，即可以单例实现，减少存储开销
 */
public class App {

	public static void main(String[] args) {
		RiceFactory riceFactory = new RiceFactory();
		riceFactory.create("Red").show();
		riceFactory.create("Red").show();
	}
}
