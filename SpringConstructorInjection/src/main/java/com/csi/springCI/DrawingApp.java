package com.csi.springCI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.glass.ui.Application;

public class DrawingApp {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Triangle t=(Triangle)context.getBean("triangle");
	t.draw();
}
}
