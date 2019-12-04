package com.csi.constructor;

public class Circle {
private Points pointA;
//private Points pointB;

public Circle(Points pointA) {
	super();
	this.pointA = pointA;
	//this.pointB = pointB;
	
}
public void draw()
{
	System.out.println(pointA);
}
}
