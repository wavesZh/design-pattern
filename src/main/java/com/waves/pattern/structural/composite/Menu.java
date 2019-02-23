package com.waves.pattern.structural.composite;

/**
 * 菜单的抽象类，可以添加删除子菜单
 */
public abstract class Menu {

	protected String name;

	public Menu(String name) {
		this.name = name;
	}

	protected abstract void add(Menu menu);

	protected abstract void remove(Menu menu);
}
