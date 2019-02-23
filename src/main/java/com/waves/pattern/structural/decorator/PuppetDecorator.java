package com.waves.pattern.structural.decorator;


/**
 * 木偶装饰者抽象类
 */
public abstract class PuppetDecorator extends Puppet {
	private Puppet puppet;

	public PuppetDecorator(Puppet puppet) {
		this.puppet = puppet;
	}

	@Override
	public void dress() {
		puppet.dress();
	}

}
