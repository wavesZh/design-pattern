package com.waves.pattern.structural.proxy;

/**
 * 代理模式
 *
 * 功能增强，跟装饰者模式十分相似，不过侧重点不同：装饰者模式侧重动态增强功能，代理模式侧重控制对象.
 * 另外装饰者是在运行增强功能，代理是在编译的时候就已经确定了（不过我觉得代理也可以运行时增加）。
 */
public class App {

	public static void main(String[] args) {
		new Base64Client().sendMessge("hello");
	}
}
