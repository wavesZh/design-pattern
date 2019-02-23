package com.waves.pattern.structural.composite;

/**
 *
 */
public class MenuLevel1 extends Menu {

	public MenuLevel1(String name) {
		super(name);
	}

	@Override
	protected void add(Menu menu) {
		System.out.println("不允许添加菜单");
	}

	@Override
	protected void remove(Menu menu) {
		System.out.println("不允许删除菜单");
	}
}
