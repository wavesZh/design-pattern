package com.waves.pattern.structural.proxy;

public class CommonClient extends Client {
	@Override
	public void sendMessge(String message) {
		System.out.println(message);
	}
}
