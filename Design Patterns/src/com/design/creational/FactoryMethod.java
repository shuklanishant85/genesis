package com.design.creational;

import com.design.base.Computer;
import com.design.base.PC;
import com.design.base.Server;

public class FactoryMethod {

	public static void main(String[] args) {
		Computer computer = ComputerFactory.getComputer("PC", "4 GB", "500 GB", "i7");
		if (computer != null) {
			System.out.println(computer.toString());
		}
		computer = ComputerFactory.getComputer("Server", "80 GB", "50 TB", "i7");
		if (computer != null) {
			System.out.println(computer.toString());
		}
	}
}

class ComputerFactory{
	//contains a static factory method "getObject(param)"
	
	public static Computer getComputer(String type, String RAM, String HDD, String CPU){
		if (type .equalsIgnoreCase("PC")) {
			return new PC(RAM, CPU, HDD);
		} else if (type.equalsIgnoreCase("Server")) {
			return new Server(RAM, CPU, HDD);
		}else {
			System.out.println("incompatible computer type : "+type);
			return null;
		}
	}
}
