package com.waves.pattern.structural.adapter.classadapter;

import com.waves.pattern.structural.adapter.Adaptee;

import java.util.List;

/**
 * 类适配
 *
 * 一般以继承的方式实现
 * 转换器，2孔转换称3孔
 */
public class Adapter extends Adaptee {

	public String chargeByThree() {
		Integer before = charge();
		// 对charge进行转换，电流符合标准
		String after = before.toString();
		System.out.println("3孔充电");
		return after;
	}

}
