package com.design.creational;

public class SingletonDoubleCheckedThreadSafe {

	private static SingletonDoubleCheckedThreadSafe instance;

	private SingletonDoubleCheckedThreadSafe() {
		// do nothing
	}

	public static SingletonDoubleCheckedThreadSafe getInstance() {
		if (instance == null) {
			synchronized (SingletonDoubleCheckedThreadSafe.class) {
				if (instance == null) {
					instance = new SingletonDoubleCheckedThreadSafe();
				}
			}
		}
		return instance;
	}

}
