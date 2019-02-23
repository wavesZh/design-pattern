package com.waves.pattern.structural.decorator;

/**
 * 人木偶
 */
public class HumanPuppet extends Puppet {
	@Override
	public void dress() {
		System.out.print("衣服，裤子");
	}
}
