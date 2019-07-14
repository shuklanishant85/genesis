package com.design.creational;

public class SingletonThreadSafe {
	
	private static SingletonThreadSafe instance;

	private SingletonThreadSafe() {
		// do nothing
	}

	public static synchronized SingletonThreadSafe getInstance(){
		if (instance == null) {
			instance = new SingletonThreadSafe();
		}
		return instance;
	}

}
