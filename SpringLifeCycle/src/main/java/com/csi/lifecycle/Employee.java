package com.csi.lifecycle;

public class Employee {
private int id;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void init()
{
	System.out.println("init method is called");
}
public void display()
{
	System.out.println("hello this is employee class with id="+getId()+"and name="+getName());
}
public void destroy()
{
	System.out.println("destroy is being called");
}
}
