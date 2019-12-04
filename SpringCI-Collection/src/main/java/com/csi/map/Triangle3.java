package com.csi.map;

import java.util.Map;
import java.util.Map.Entry;

public class Triangle3 {
private int x;
private int y;
private Map<Integer,String> triangle;
public Triangle3(int x, int y, Map<Integer, String> triangle) {
	super();
	this.x = x;
	this.y = y;
	this.triangle = triangle;
}

public void draw()
{
	System.out.println(x+" "+y+" "+triangle+" "+"are the properties");
}
public void showList()
{
	for(Map.Entry<Integer, String> m:triangle.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
}



}
