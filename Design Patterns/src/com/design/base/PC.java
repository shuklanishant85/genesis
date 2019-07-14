package com.design.base;

public class PC extends Computer {
	private String RAM;
	private String CPU;
	private String HDD;

	public PC(String RAM, String CPU, String HDD) {
		super();
		this.RAM = RAM;
		this.CPU = CPU;
		this.HDD = HDD;
	}

	/**
	 * @return the RAM
	 */
	public String getRAM() {
		return RAM;
	}

	/**
	 * @param RAM
	 *            the RAM to set
	 */
	public void setRAM(String RAM) {
		this.RAM = RAM;
	}

	/**
	 * @return the CPU
	 */
	public String getCPU() {
		return CPU;
	}

	/**
	 * @param CPU
	 *            the CPU to set
	 */
	public void setCPU(String CPU) {
		this.CPU = CPU;
	}

	/**
	 * @return the hDD
	 */
	public String getHDD() {
		return HDD;
	}

	/**
	 * @param HDD
	 *            the HDD to set
	 */
	public void setHDD(String HDD) {
		this.HDD = HDD;
	}
}
