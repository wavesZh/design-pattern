package com.waves.pattern.structural.bridge;

public class MySqlDataAccess extends DataAccess {

	@Override
	public Object connect(Object[] args) {
		System.out.println("mysql connect");
		return new Object();
	}
}
