package com.design.base;

public class Server extends Computer {

	private String RAM;
	private String CPU;
	private String HDD;

	public Server(String RAM, String CPU, String HDD) {
		super();
		this.RAM = RAM;
		this.CPU = CPU;
		this.HDD = HDD;
	}

	/**
	 * @return the rAM
	 */
	public String getRAM() {
		return RAM;
	}

	/**
	 * @param RAM
	 *  the rAM to set
	 */
	public void setRAM(String RAM) {
		this.RAM = RAM;
	}

	/**
	 * @return the cPU
	 */
	public String getCPU() {
		return CPU;
	}

	/**
	 * @param CPU
	 * the cPU to set
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
	 * the hDD to set
	 */
	public void setHDD(String HDD) {
		this.HDD = HDD;
	}

}
