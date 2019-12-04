package com.csi.springCI;

import java.util.List;

public class Triangle {
private int id;
private String type;

private Point pointA;
private Point pointB;
private Point pointC;







public Triangle(int id, String type, Point pointA, Point pointB, Point pointC) {
	super();
	this.id = id;
	this.type = type;
	this.pointA = pointA;
	this.pointB = pointB;
	this.pointC = pointC;
}







public void draw()
{
	System.out.println(id+" "+type+" "+"triangle is drawing");
	System.out.println(pointA);
	System.out.println(pointB);
	System.out.println(pointC);
}







/*@Override
public String toString() {
	return "Triangle [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + "]";
}*/

}
