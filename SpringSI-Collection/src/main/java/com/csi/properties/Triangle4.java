package com.csi.properties;

import java.util.Properties;

public class Triangle4 {
private int id;
private Properties type;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public Properties getType() {
	return type;
}
public void setType(Properties type) {
	this.type = type;
}
public void draw()
{
	System.out.println(getId()+" "+getType()+" "+"triangle is being drawn");
}


}
