package com.codegnan.javaapp10022026.shapes.threedshape;

public class Cube extends ThreeDShapes {
	
	int side;
	
	public Cube(int side) {
		this.side = side;
	}

	@Override
	public int volume() {
		return side * side * side;
	}

	@Override
	public int surfaceArea() {
		return 6 * (side*side);
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Side-length : " + side);
	}

}
