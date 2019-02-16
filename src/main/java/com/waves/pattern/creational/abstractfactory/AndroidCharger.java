package com.waves.pattern.creational.abstractfactory;

public class AndroidCharger extends Charger {

	@Override
	public void charging(Phone phone) {
		if (phone instanceof AndroidPhone) {
			System.out.println(phone.getName() + " charging success");
		} else {
			System.out.println(phone.getName() + " charging fail");
		}
	}
}
