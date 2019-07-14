package com.design.creational;

import java.lang.reflect.Constructor;

public class SingletonReflectionDestroy {

	public static void main(String[] args) {
		SingletonEagerInitialized instanceOne = SingletonEagerInitialized.getInstantce();
		SingletonEagerInitialized instanceTwo = null;

		try {
			Constructor<?>[] constructors = 
					SingletonEagerInitialized.class.getDeclaredConstructors();
			for (Constructor<?> constructor : constructors) {
				constructor.setAccessible(true);
				instanceTwo = (SingletonEagerInitialized) constructor.newInstance();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}

}
