package com.waves.pattern.creational.abstractfactory;

public interface PhoneFactory {

	Charger createCharger();

	Phone createPhone();
}
