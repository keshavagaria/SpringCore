package com.csi.set;

import java.util.Set;

public class Triangle2 {
private int id;
private Set<String> type;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Set<String> getType() {
	return type;
}
public void setType(Set<String> type) {
	this.type = type;
}
public void draw()
{
	System.out.println(getId()+" "+getType()+" "+"triangle is drawn");
}
public void showList()
{
	for(String s:type)
	{
		System.out.println(s);
	}
}
}
