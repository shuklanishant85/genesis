package com.design.structural;

import java.util.ArrayList;
import java.util.List;

public class CompositePattern {
	public static void main(String[] args) {
		Shape tri = new Triangle();
		Shape tri1 = new Triangle();
		Shape cir = new Circle();
		
		Drawing drawing = new Drawing();
		drawing.addShape(tri);
		drawing.addShape(tri1);
		drawing.addShape(cir);
		
		drawing.removeShape(tri1);
		drawing.draw("Red");
		drawing.clearShapes();
		
		drawing.addShape(tri);
		drawing.addShape(cir);
		drawing.draw("Green");
	}

}

interface Shape {
	public void draw(String color);
}

class Circle implements Shape {

	@Override
	public void draw(String color) {
		System.out.println("Drawing circle of color : " + color);
	}

}

class Triangle implements Shape{

	@Override
	public void draw(String color) {
		System.out.println("Drawing triangle of color : " + color);		
	}
	
}

class Drawing implements Shape{
	List<Shape> shapes = new ArrayList<>();

	@Override
	public void draw(String color) {
		for (Shape shape : shapes) {
			shape.draw(color);
		}
	}
	
	public void addShape(Shape shape){
		this.shapes.add(shape);
	}
	
	public void removeShape(Shape shape){
		this.shapes.remove(shape);
	}
	
	public void clearShapes(){
		System.out.println("removing all shapes");
		this.shapes.clear();
	}
}
