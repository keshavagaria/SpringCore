package com.csi.set;

import java.util.Set;

public class Triangle2 {
private int id;
private Set<String> type;
public Triangle2(int id, Set<String> type) {
	super();
	this.id = id;
	this.type = type;
}
public void draw()
{
	System.out.println(id+" "+type+" "+"triangle is drawing");
}
public void showList(){
	for(String s:type)
	{
		System.out.println(s);
	}
}

}
