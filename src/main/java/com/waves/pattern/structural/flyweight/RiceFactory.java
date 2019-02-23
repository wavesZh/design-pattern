package com.waves.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class RiceFactory {

	Map<String, Rice> riceMap = new HashMap<>();

	public RiceFactory() {

	}


	public Rice create(String type) {
		Rice rice = null;
		if ("Red".equals(type)) {
			rice = riceMap.computeIfAbsent(type, s -> new RedRice(1));
		} else if ("Black".equals(type)){
			rice = riceMap.computeIfAbsent(type, s -> new RedRice(2));
		}
		return rice;
	}

}
