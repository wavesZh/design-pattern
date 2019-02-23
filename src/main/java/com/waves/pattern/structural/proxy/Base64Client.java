package com.waves.pattern.structural.proxy;

import java.util.Base64;

/**
 * 加密发送信息
 */
public class Base64Client extends Client {

	private CommonClient client;

	public Base64Client() {
		this.client = new CommonClient();
	}

	@Override
	public void sendMessge(String message) {
		client.sendMessge(encode(message));
	}

	private String encode(String s) {
		return String.valueOf(Base64.getEncoder().encode(s.getBytes()));
	}

	private String dncode(String s) {
		return String.valueOf(Base64.getDecoder().decode(s.getBytes()));
	}
}
