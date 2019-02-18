package com.waves.pattern.structural.adapter;

import java.util.List;
import java.util.stream.Stream;

/**
 *
 */
public class Adaptee {
	/**
	 * 被适配的方法
	 */
	public Integer charge() {
		System.out.println("2孔充电");
		return Integer.valueOf(0);
	}
}
