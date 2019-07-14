package com.design.structural;

public class AdapterPattern {

}

class Volt {
	private int volt;

	public Volt(int volt) {
		this.volt = volt;
	}

	public int getVolt() {
		return volt;
	}

	public void setVolt(int volt) {
		this.volt = volt;
	}
}

class Socket {

	public Volt getVolt() {
		return new Volt(120);
	}

}

interface SocketAdapter {
	public Volt get120Volt();

	public Volt get12Volt();

	public Volt get3Volt();
}

class SocketClassAdapterImpl extends Socket implements SocketAdapter {

	@Override
	public Volt get120Volt() {
		return new Socket().getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt volt = new Socket().getVolt();
		return convertVolt(volt, 10);
	}

	@Override
	public Volt get3Volt() {
		Volt volt = new Socket().getVolt();
		return convertVolt(volt, 40);
	}

	private Volt convertVolt(Volt volt, int div) {
		return new Volt(volt.getVolt() / div);
	}
}
