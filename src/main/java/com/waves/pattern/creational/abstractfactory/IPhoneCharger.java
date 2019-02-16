package com.waves.pattern.creational.abstractfactory;

public class IPhoneCharger extends Charger {
	@Override
	public void charging(Phone phone) {
		if (phone instanceof IPhone) {
			System.out.println(phone.getName() + " charging success");
		} else {
			System.out.println(phone.getName() + " charging fail");
		}
	}
}
