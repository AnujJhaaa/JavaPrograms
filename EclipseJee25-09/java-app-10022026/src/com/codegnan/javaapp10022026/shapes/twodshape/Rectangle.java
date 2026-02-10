package com.codegnan.javaapp10022026.shapes.twodshape;

public class Rectangle extends TwoDShapes {
	
	int length;
	int breadth;
	
	public Rectangle(int length,int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Length : " + length);
		System.out.println("Breadth : " + breadth);
	}

	@Override
	public int area() {
		return length * breadth;
	}

	@Override
	public int perimeter() {
		return 2 * (length+breadth);
	}

}
