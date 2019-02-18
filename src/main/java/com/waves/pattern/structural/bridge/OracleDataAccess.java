package com.waves.pattern.structural.bridge;

public class OracleDataAccess extends DataAccess {

	@Override
	public Object connect(Object[] args) {
		System.out.println("oracle connect");
		return new Object();
	}
}
