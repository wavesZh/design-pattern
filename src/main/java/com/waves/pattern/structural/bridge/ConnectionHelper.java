package com.waves.pattern.structural.bridge;


public abstract class ConnectionHelper {

	private DataAccess dataAccess;

	public ConnectionHelper(DataAccess dataAccess) {
		this.dataAccess = dataAccess;
	}

	public abstract Object getConnection(Object[] args);

	public DataAccess getDataAccess() {
		return dataAccess;
	}

	public void setDataAccess(DataAccess dataAccess) {
		this.dataAccess = dataAccess;
	}

}
