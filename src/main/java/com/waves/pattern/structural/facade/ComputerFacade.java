package com.waves.pattern.structural.facade;

public class ComputerFacade {
	private final Cpu processor;
	private final Memory ram;
	private final HardDrive drive;


	public ComputerFacade(Cpu processor, Memory ram, HardDrive drive) {
		this.processor = processor;
		this.ram = ram;
		this.drive = drive;
	}

	public void startComputer() {
		processor.start();
		ram.start();
		drive.start();
	}

	public void closeComputer() {
		processor.close();
		ram.close();
		drive.close();
	}
}
