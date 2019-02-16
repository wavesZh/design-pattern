package com.waves.pattern.creational.abstractfactory;

/**
 * 充电器
 */
public abstract class Charger {

	/**
	 * 给手机充电，iphone的充电器只能给iphone充电。
	 * @param phone
	 */
	public abstract void charging(Phone phone);
}
