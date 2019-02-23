package com.waves.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 0级菜单，可以拥有子菜单
 */
public class MenuLevel0 extends Menu {

	private List<Menu> menuList;

	public MenuLevel0(String name) {
		super(name);
		menuList = new ArrayList<>();
	}

	@Override
	protected void add(Menu menu) {
		menuList.add(menu);
	}

	@Override
	protected void remove(Menu menu) {
		menuList.remove(menu);
	}
}
