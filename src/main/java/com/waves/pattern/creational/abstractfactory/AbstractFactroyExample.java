package com.waves.pattern.creational.abstractfactory;

/**
 *  抽象工厂模式
 *
 *  同简单工厂模式一样，将类的实例化操作与使用对象操作分离。
 *  简单工厂和抽象工厂的区别： 抽象工厂中每个工厂可以创建多种类的产品；而工厂方法每个工厂只能创建一类产品
 *
 */
public class AbstractFactroyExample {

	public static void main(String[] args) {
		PhoneFactory iPhoneFactory = new IPhoneFactory();
		Phone iPhone = iPhoneFactory.createPhone();
		Charger iCharger = iPhoneFactory.createCharger();


		PhoneFactory APhoneFactory = new AndroidPhoneFactory();
		Phone aPhone = APhoneFactory.createPhone();
		Charger aCharger = APhoneFactory.createCharger();

		aCharger.charging(iPhone);
		iCharger.charging(iPhone);
	}



}
