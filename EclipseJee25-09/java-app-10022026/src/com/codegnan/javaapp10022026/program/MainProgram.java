package com.codegnan.javaapp10022026.program;

import com.codegnan.javaapp10022026.shapes.twodshape.Square;
import com.codegnan.javaapp10022026.shapes.threedshape.Cube;
import com.codegnan.javaapp10022026.shapes.generalshape.Arrow;
import com.codegnan.javaapp10022026.shapes.generalshape.Star;

public class MainProgram {

	public static void main(String[] args) {
		 
		Square square = new Square(10);
		square.displayInfo();
		System.out.println("Sqaure - Area  : " + square.area());
		System.out.println("Square - Perimeter : " + square.perimeter());
		System.out.println();
		
		Cube cube = new Cube(10);
		square.displayInfo();
		System.out.println("Cube - Volume  : " + cube.volume());
		System.out.println("Cube - SurfaceArea : " + cube.surfaceArea());
		System.out.println();
		 
		Arrow arrow = new Arrow();
		arrow.draw();
		arrow.fillColor();
		arrow.displayInfo();
		System.out.println();
		
		Star star = new Star();
		star.draw();
		star.fillColor();
		star.displayInfo();
		System.out.println();
	}

}
