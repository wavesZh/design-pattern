package com.waves.pattern.creational.singleton;

/**
 * 静态内部类单例-懒加载
 *
 * 线程安全，<cinit>每个类在同一个classloader下只会触发一次。
 */
public class StaticSinleton {
	private StaticSinleton() {}

	public static StaticSinleton getInstance() {
		return Holder.instance;
	}

	public static class Holder {
		private static StaticSinleton instance = new StaticSinleton();
	}

}
