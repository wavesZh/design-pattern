package com.waves.pattern.structural.bridge;

public class SingleConnectionHelper extends ConnectionHelper {

	public SingleConnectionHelper(DataAccess dataAccess) {
		super(dataAccess);
	}

	private Object connection;

	@Override
	public Object getConnection(Object[] args) {
		return getDataAccess().connect(args);
	}


}
