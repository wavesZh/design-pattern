package com.waves.pattern.structural.decorator;

/**
 * 装饰者模式
 *
 * 不改变现有对象的结构，动态增强功能。
 * 适用场景：
 * 1. 当需要给一个现有类添加附加职责，而又不能采用生成子类的方法进行扩充时。例如，该类被隐藏或者该类是终极类或者采用继承方式会产生大量的子类。
 * 2. 当对象的功能要求可以动态地添加，也可以再动态地撤销时。
 *
 */
public class App {
	public static void main(String[] args) {
		Puppet winterPuppetDecorator = new WinterPuppetDecorator(new HumanPuppet());
		winterPuppetDecorator.dress();
	}
}
