package com.waves.pattern.structural.adapter.objectadapter;

import com.waves.pattern.structural.adapter.Adaptee;

/**
 * 对象适配
 *
 * 一般以组合的形式实现
 * 使用场景： 使用一个类，如果其的方法和你的要求不一致时。
 */
public class Adapter {

	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	public String chargeByThree() {
		Integer before = adaptee.charge();
		// 对charge进行转换，电流符合标准
		String after = before.toString();
		System.out.println("3孔充电");
		return after;
	}

}
