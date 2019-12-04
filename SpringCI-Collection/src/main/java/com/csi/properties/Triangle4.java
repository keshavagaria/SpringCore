package com.csi.properties;

import java.util.Properties;

public class Triangle4 {
private int id;
private Properties type;
public Triangle4(int id, Properties type) {
	super();
	this.id = id;
	this.type = type;
}
public void draw()
{
	System.out.println(id+" "+type+" "+"triangle is being drawn");
}
}
