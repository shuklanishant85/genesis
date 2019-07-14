package com.design.creational;

public class SingletonPillBugh {
	//most widely used singleton implementation
	//does not require synchronized blocks
	//inner class loaded only when getInstance method called.
	
	private SingletonPillBugh(){
		//do nothing
	}
	
	private static class SingletonPillBughHelper{
		private static final SingletonPillBugh INSTANCE = new SingletonPillBugh();
	}
	
	public static SingletonPillBugh getInstance(){
		return SingletonPillBughHelper.INSTANCE;
	}
}
