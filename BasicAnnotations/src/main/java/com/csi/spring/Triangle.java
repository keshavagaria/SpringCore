package com.csi.spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Triangle implements Shape{

private Point pointA;
/*private Point pointB;
private Point pointC;
*/
public Point getPointA() {
	return pointA;
}
@Autowired
@Qualifier("tri")
public void setPointA(Point pointA) {
	this.pointA = pointA;
}
/*public Point getPointB() {
	return pointB;
}
@Autowired
public void setPointB(Point pointB) {
	this.pointB = pointB;
}*/
/*public Point getPointC() {
	return pointC;
}
@Autowired
public void setPointC(Point pointC) {
	this.pointC = pointC;
}*/
public void draw() {

	System.out.println(getPointA().getX()+" "+getPointA().getY());
/*	System.out.println(getPointB().getX()+" "+getPointB().getY());
	System.out.println(getPointC().getX()+" "+getPointC().getY());*/

	
}
  
}
