package com.csi.spring;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{
	
private Point pointA;
private Point pointB;
public Point getPointA() {
	return pointA;
}
@Resource
public void setPointA(Point pointA) {
	this.pointA = pointA;
}
public Point getPointB() {
	return pointB;
}

@Resource
public void setPointB(Point pointB) {
	this.pointB = pointB;
}
public void draw() {
	System.out.println(getPointA().getX()+" "+getPointA().getY());
	System.out.println(getPointB().getX()+" "+getPointB().getY());
}

}
