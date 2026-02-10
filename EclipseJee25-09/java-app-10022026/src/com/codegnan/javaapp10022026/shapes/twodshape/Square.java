package com.codegnan.javaapp10022026.shapes.twodshape;

public class Square extends TwoDShapes {

	int side ;
	
	public Square(int side) {
		this.side = side;
	}
	
	@Override
	public int area() {
		return side * side ;
	}

	@Override
	public int perimeter() {
		return 4 * side ;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Side-length : " + side);
	}

}
