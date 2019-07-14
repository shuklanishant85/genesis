package com.design.creational;

public class SingletonLazyInitialized {

	private static SingletonLazyInitialized instance;

	private SingletonLazyInitialized() {
		// do nothing
	}

	public static SingletonLazyInitialized getInstance() {
		if (instance == null) {
			instance = new SingletonLazyInitialized();
		}
		return instance;
	}
}
