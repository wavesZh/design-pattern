package com.waves.pattern.creational.abstractfactory;

public class AndroidPhoneFactory implements PhoneFactory {

	@Override
	public Charger createCharger() {
		return new AndroidCharger();
	}

	@Override
	public Phone createPhone() {
		return new AndroidPhone();
	}
}
