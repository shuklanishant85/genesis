package com.design.creational;

public class SingletonStaticBlock {
	
	private static SingletonStaticBlock instance;
	
	private SingletonStaticBlock(){
		//do nothing
	}

	static{
		try {
			instance = new SingletonStaticBlock();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured while creating singleton instance");
		}
	}
	
	public static SingletonStaticBlock getInstance(){
		return instance;
	}
}
