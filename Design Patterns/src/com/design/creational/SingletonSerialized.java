package com.design.creational;

import java.io.Serializable;

public class SingletonSerialized implements Serializable{

	private static final long serialVersionUID = -976641192613879822L;
	
	private SingletonSerialized(){
		//do nothing
	}

	private static class SingletonHelper{
		private static final SingletonSerialized instance =  new SingletonSerialized();
	}
	
	public static SingletonSerialized getInstance(){
		return SingletonHelper.instance;
	}
	
	protected Object readResolve(){
		return getInstance();
	}
}
