package com.csi.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Triangle t=(Triangle)context.getBean("triangle");
	t.setId(420);
	t.setType("Right Angled");
	t.draw();
	
	Triangle t2=(Triangle)context.getBean("triangle");
	t2.draw();
	
}
}
