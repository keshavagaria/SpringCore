package com.csi.spring;

public class Circle implements Shape{
private Point pointA;
private Point pointB;
public Point getPointA() {
	return pointA;
}
public void setPointA(Point pointA) {
	this.pointA = pointA;
}
public Point getPointB() {
	return pointB;
}
public void setPointB(Point pointB) {
	this.pointB = pointB;
}
public void draw() {
	System.out.println(getPointA().getX()+" "+getPointA().getY());
	System.out.println(getPointB().getX()+" "+getPointB().getY());

	
}

}
