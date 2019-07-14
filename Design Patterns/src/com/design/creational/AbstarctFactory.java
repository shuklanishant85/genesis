package com.design.creational;

import com.design.base.Computer;
import com.design.base.PC;
import com.design.base.Server;

public class AbstarctFactory {
	public static void main(String[] args) {
		Computer computer = ComputersFactory.getComputer(new PCFactory("8 GB", "500 Gb", "i7"));
		if (computer != null) {
			System.out.println(computer.toString());
		}

		computer = ComputersFactory.getComputer(new ServerFactory("80 GB", "500 Tb", "i7"));
		if (computer != null) {
			System.out.println(computer.toString());
		}
	}
}

// A factory for each sub-class
interface ComputerAbstractFactory {
	public Computer createComputer();
}

class PCFactory implements ComputerAbstractFactory {
	private String ram;
	private String hdd;
	private String cpu;

	public PCFactory(String ram, String hdd, String cpu) {
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
	}

	@Override
	public Computer createComputer() {
		return new PC(ram, cpu, hdd);
	}
}

class ServerFactory implements ComputerAbstractFactory {
	private String ram;
	private String hdd;
	private String cpu;

	public ServerFactory(String ram, String hdd, String cpu) {
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
	}

	@Override
	public Computer createComputer() {
		return new Server(ram, cpu, hdd);
	}
}

class ComputersFactory {
	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
}
