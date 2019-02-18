package com.waves.pattern.structural.bridge;

/**
 * 桥接模式
 *
 * 抽象部分与实现部分分离。
 * 多个抽象类之间有交叉的关系，如果使用继承的方式关联起来，子类数量将会很多。
 * 如果使用组合，将某个抽象类作为另一个抽象类的组件进行关联，将各自抽象分离，各自变化互不影响。
 */
public class PoolConnectionHelper extends ConnectionHelper {

	public PoolConnectionHelper(DataAccess dataAccess) {
		super(dataAccess);
	}

	private Object connection;

	@Override
	public Object getConnection(Object[] args) {
		Object connect = getDataAccess().connect(args);
		// DCL单例 ... ...
		return connection;
	}

	public static void main(String[] args) {

		ConnectionHelper connectionHelper = new PoolConnectionHelper(new MySqlDataAccess());
		connectionHelper.getConnection(args);

	}
}
