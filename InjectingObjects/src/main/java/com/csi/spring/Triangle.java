package com.csi.spring;

public class Triangle {
private String  type;
private Point pointA;
private Point pointB;
private Point pointC;
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
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
public Point getPointC() {
	return pointC;
}
public void setPointC(Point pointC) {
	this.pointC = pointC;
}
public void draw()
{
	System.out.println(getType()+" "+getPointA().getX()+" "+getPointA().getY());
	System.out.println(getType()+" "+getPointB().getX()+" "+getPointB().getY());
	System.out.println(getType()+" "+getPointC().getX()+" "+getPointC().getY());

}
}
