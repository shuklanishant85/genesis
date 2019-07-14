package com.design.creational;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonSerializedTest {
	public static void main(String[] args) {
		SingletonSerialized instanceOne = SingletonSerialized.getInstance();
		try {
			ObjectOutput objectOut = new ObjectOutputStream(new FileOutputStream("object.ser"));
			objectOut.writeObject(instanceOne);
			objectOut.close();
			
			ObjectInput objectIn = new ObjectInputStream(new FileInputStream("object.ser"));
			SingletonSerialized instanceTwo = (SingletonSerialized) objectIn.readObject();
			objectIn.close();
			
			System.out.println(instanceOne.hashCode());
			System.out.println(instanceTwo.hashCode());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
