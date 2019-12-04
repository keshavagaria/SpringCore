package com.csi.spring2;

import java.util.List;

import com.csi.spring.Point;

public class Triangle2 {
private String type;
private List<Point2> points;
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public List<Point2> getPoints() {
	return points;
}
public void setPoints(List<Point2> points) {
	this.points = points;
}
public void draw()
{
	System.out.println(getType());
	for(Point2 p:points)
	{
		System.out.println(p.getX()+" "+p.getY());
	}
}
}
