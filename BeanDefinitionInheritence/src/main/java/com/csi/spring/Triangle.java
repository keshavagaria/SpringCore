package com.csi.spring;

import java.util.List;

public class Triangle {
	private String type;
/*private Point pointA;
private Point pointB;
private Point pointC;*/
private List<Point> points;
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}


public List<Point> getPoints() {
	return points;
}
public void setPoints(List<Point> points) {
	this.points = points;
}
public void draw(){
	for(Point p:points)
	{
		System.out.println(p.getX()+" "+p.getY());
	}
	
}
}
