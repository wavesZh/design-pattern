package com.waves.pattern.creational.singleton;

/**
 * DCL(double-check locking)
 *
 * 懒加载
 */
public class DclSingleton {
	/**
	 * volatile保证了instance的内存可见性，不可少。
	 */
	private volatile static DclSingleton instance;

	private DclSingleton() {}

	public static DclSingleton getInstance() {
		if (instance == null) {
			synchronized (DclSingleton.class) {
				if (instance == null) {
					instance = new DclSingleton();
				}
			}
		}
		return instance;
	}
}
