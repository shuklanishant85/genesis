package com.design.behavioral;

public class TemplateMethodPattern {
	public static void main(String[] args) {
		HouseTemplate house = new WoodenHouse();
		house.buildHouse();
		System.out.println("\n\n");
		house = new GlassHouse();
		house.buildHouse();
	}
}

abstract class HouseTemplate {
	// template method, final so subclasses can't override
	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built");
	}

	private void buildFoundation() {
		System.out.println("Building foundation");
	}

	private void buildWindows() {
		System.out.println("Building windows");
	}

	public abstract void buildWalls();

	public abstract void buildPillars();

}

class WoodenHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Building wooden walls");
	}

	@Override
	public void buildPillars() {
		System.out.println("Building wooden pillars");
	}

}

class GlassHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Building glass walls");
	}

	@Override
	public void buildPillars() {
		System.out.println("Building pillars with glass coating");
	}

}