package com.waves.pattern.creational.singleton;

/**
 * 枚举单例
 *
 * 枚举类在被虚拟机加载的时候会保证线程安全的被初始化。
 */
public enum  EnumSingleton {

	INSTANCE;

	public void doSometing() {}

	public static void main(String[] args) {
		EnumSingleton.INSTANCE.doSometing();
	}
}
