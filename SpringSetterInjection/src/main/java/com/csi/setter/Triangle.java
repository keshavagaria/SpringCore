package com.csi.setter;

public class Triangle {
private int id;
private String type;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public void draw()
{
	System.out.println(getId()+" "+getType()+" "+"triangle is drawn");
}
}
