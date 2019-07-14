package com.design.base;

public abstract class Computer {
	public abstract String getRAM();

	public abstract String getHDD();

	public abstract String getCPU();

	@Override
	public String toString() {
		return "RAM = " + getRAM() + ", CPU = " + getCPU() + ", HDD = " + getHDD();
	}

}
