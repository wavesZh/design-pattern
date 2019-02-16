package com.waves.pattern.creational.abstractfactory;

public class IPhoneFactory implements PhoneFactory {
	@Override
	public Charger createCharger() {
		return new IPhoneCharger();
	}

	@Override
	public Phone createPhone() {
		return new IPhone();
	}
}
