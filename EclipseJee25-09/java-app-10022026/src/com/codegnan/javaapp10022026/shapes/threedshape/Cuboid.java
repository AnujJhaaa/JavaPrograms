package com.codegnan.javaapp10022026.shapes.threedshape;

public class Cuboid extends ThreeDShapes {

	int length;
	int breadth;
	int width;
	
	public Cuboid (int length,int breadth,int width) {
		this.length = length;
		this.breadth = breadth;
		this.width = width;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Length : " + length);
		System.out.println("Breadth : " + breadth);
		System.out.println("Width : " + width);
	}

	@Override
	public int volume() {
		return length * breadth * width;
	}

	@Override
	public int surfaceArea() {
		return 2 *(length*breadth + breadth*width + width*length);
	}

}
