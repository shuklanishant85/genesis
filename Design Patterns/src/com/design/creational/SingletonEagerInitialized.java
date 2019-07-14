package com.design.creational;

public class SingletonEagerInitialized {

	private static final SingletonEagerInitialized instance = new SingletonEagerInitialized();
	
	private SingletonEagerInitialized(){
		//do nothing
	}
	
	public static SingletonEagerInitialized getInstantce() {
		return instance;
	}
	
}
