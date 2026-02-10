package com.codegnan.javaapp10022026.shapes.generalshape;

import com.codegnan.javaapp10022026.shapes.Shape;

public class Star extends GeneralShape implements Shape {

	@Override
	public void displayInfo() {
		System.out.println("This is a yellow Star.");

	}

	@Override
	public void draw() {
		 System.out.println("Drawing a Star.");
	}

	@Override
	public void fillColor() {
		System.out.println("Filling it with color Yellow.");
	}

}
