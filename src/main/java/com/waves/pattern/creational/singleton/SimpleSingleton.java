package com.waves.pattern.creational.singleton;

/**
 * 简单懒加载单例
 *
 * 线程安全
 */
public class SimpleSingleton {

	private static SimpleSingleton instance;

	private SimpleSingleton() {}

	public static SimpleSingleton getInstance1() {

		synchronized (SimpleSingleton.class) {
			if (instance == null) {
				instance = new SimpleSingleton();
			}
		}
		return instance;
	}

	public synchronized static SimpleSingleton getInstance2() {

		if (instance == null) {
			instance = new SimpleSingleton();
		}
		return instance;
	}



}
