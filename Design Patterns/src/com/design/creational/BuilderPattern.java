package com.design.creational;

public class BuilderPattern {

}

class Computer {
	// only getters
	// private constructors
	// public static inner builder class

	private String HDD;
	private String RAM;
	private boolean isBluetoothEnabled;
	private boolean isGraphicsEnabled;

	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	public boolean isGraphicsEnabled() {
		return isGraphicsEnabled;
	}

	public Computer(ComputerBuilder builder) {
		this.RAM = builder.RAM;
		this.HDD = builder.HDD;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
		this.isGraphicsEnabled = builder.isGraphicsEnabled;
	}

	public static class ComputerBuilder {
		private String HDD;
		private String RAM;
		private boolean isBluetoothEnabled;
		private boolean isGraphicsEnabled;

		public ComputerBuilder(String HDD, String RAM) {
			this.HDD = HDD;
			this.RAM = RAM;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public ComputerBuilder setGraphicsEnabled(boolean isGraphicsEnabled) {
			this.isGraphicsEnabled = isGraphicsEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}
	}

}
