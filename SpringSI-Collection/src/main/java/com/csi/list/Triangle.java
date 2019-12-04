package com.csi.list;


import java.util.Collection;
import java.util.Collections;

public class Triangle {
private int id;
private Collection<String> type;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


public Collection<String> getType() {
	return type;
}
public void setType(Collection<String> type) {
	this.type = type;
}
public void draw()
{
	System.out.println(getId()+" "+getType()+" "+"triangle is drawing");
}
public void showList()
{
	for(String s:type)
	{
		System.out.println(s);
	}
}
}
