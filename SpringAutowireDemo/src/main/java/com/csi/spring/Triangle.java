package com.csi.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Triangle {
private String type;

@Autowired
private Point pointA;

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

public void draw()
{
	System.out.println("Triangle is drawing");
}
}
