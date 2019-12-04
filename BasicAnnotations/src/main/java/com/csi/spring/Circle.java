package com.csi.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{
private Point center;
//private Point pointB;
/*public Point getPointA() {
	return pointA;
}
@Required
public void setPointA(Point pointA) {
	this.pointA = pointA;
}
public Point getPointB() {
	return pointB;
}
public void setPointB(Point pointB) {
	this.pointB = pointB;
}*/
public void draw() {
	System.out.println(getCenter().getX()+" "+getCenter().getY());
	/*System.out.println(getPointB().getX()+" "+getPointB().getY());*/

}
public Point getCenter() {
	return center;
}
@Autowired
@Qualifier(value="circleRelated")
public void setCenter(Point center) {
	this.center = center;
}


}
