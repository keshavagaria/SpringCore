package com.csi.list;

import java.util.List;

public class Triangle {
private int id;
private String name;
private List<Point> point;
public Triangle(int id, String name, List<Point> point) {
	super();
	this.id = id;
	this.name = name;
	this.point = point;
}
void display()
{
	System.out.println(id+" "+name+" "+"triangle is drawing");
	System.out.println(point);
}
}
