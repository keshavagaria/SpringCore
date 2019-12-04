package com.csi.map;

import java.util.Map;

public class Triangle3 {
private int id;
private Map<Integer,String> type;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Map<Integer, String> getType() {
	return type;
}
public void setType(Map<Integer, String> type) {
	this.type = type;
}
public void draw()
{
	System.out.println(getId()+" "+getType()+" "+"triangle is drawn");
}
public void showList()
{
	for(Map.Entry<Integer, String> s:type.entrySet())
	{
		System.out.println(s.getKey()+" "+s.getValue());
	}
}
}
