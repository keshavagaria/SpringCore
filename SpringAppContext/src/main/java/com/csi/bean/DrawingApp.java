package com.csi.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Triangle t=(Triangle)context.getBean("triangle");
	t.draw();
	System.out.println(t.getType());
}
}
