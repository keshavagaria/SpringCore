package com.csi.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Triangle {
private int id;
private List<String>type;
public Triangle(int id, List<String> type) {
	super();
	this.id = id;
	this.type =  type;
}
public void draw()
{
	System.out.println(id+" "+type+" "+" "+"triangle is drawing");
}
public void list()
{
	for(String s:type)
	{
		System.out.println(s);
	}
}
}
