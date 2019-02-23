package com.waves.pattern.structural.decorator;

import java.util.Arrays;
import java.util.List;

/**
 * 冬装人木偶
 */
public class WinterPuppetDecorator extends PuppetDecorator {

	private List<String> dressList;

	public WinterPuppetDecorator(Puppet puppet) {
		super(puppet);
		dressList = Arrays.asList("围巾", "帽子", "手套");
	}

	@Override
	public void dress() {
		super.dress();
		for (String dress : dressList) {
			System.out.print("," + dress);
		}
	}
}
