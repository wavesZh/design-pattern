package com.waves.pattern.creational.builder;

import java.math.BigDecimal;
import java.util.Date;

/**
 * builder设计模式
 *
 * 外部类可以直接访问静态内部类的私有变量
 * enclosing / inner class之间要访问对方的private/protected成员时，javac会生成合适的“access method”来提供合适的可访问性
 */
public class Order {

	private String orderCode;
	private BigDecimal totalPrice;
	private Date createTime;

	private Order(Builder builder) {
		orderCode = builder.orderCode;
		totalPrice = builder.totalPrice;
		createTime = builder.createTime;
	}

	/**
	 * final class 标明该class不能被扩展 extends
	 */
	public static final class Builder {
		private String orderCode;
		private BigDecimal totalPrice;
		private Date createTime;

		public Builder() {
		}

		public Builder orderCode(String val) {
			orderCode = val;
			return this;
		}

		public Builder totalPrice(BigDecimal val) {
			totalPrice = val;
			return this;
		}

		public Builder createTime(Date val) {
			createTime = val;
			return this;
		}

		public Order build() {
			return new Order(this);
		}
	}

	public static void main(String[] args) {
		Builder builder = new Builder();
		Order order = builder.createTime(new Date()).orderCode("1234").totalPrice(new BigDecimal("12")).build();
	}
}
