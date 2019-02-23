package com.waves.pattern.structural.facade;

/**
 * 外观模式
 *
 * 1.向客户端提供更加简单的接口以隐藏较大系统的复杂性，耦合性降低，便于使用
 *
 */
public class App {
	public static void main(String[] args) {
		Cpu cpu = new Cpu();
		Memory memory = new Memory();
		HardDrive hardDrive = new HardDrive();
		ComputerFacade computerFacade = new ComputerFacade(cpu, memory, hardDrive);
		computerFacade.startComputer();
	}
}
