package com.codegnan.javaapp10022026.shapes.generalshape;

import com.codegnan.javaapp10022026.shapes.Shape;

public class Arrow extends GeneralShape implements Shape {

	@Override
	public void displayInfo() {
		System.out.println("This is a Blue color Arrow");

	}

	@Override
	public void draw() {
		System.out.println("Drawing an Arrow.");
	}

	@Override
	public void fillColor() {
		System.out.println("Filling it with color Blue.");
	}

}
