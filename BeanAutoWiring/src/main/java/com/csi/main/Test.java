package com.csi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.csi.autowire.Triangle;
import com.csi.constructor.Circle;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	/*Triangle t=(Triangle)context.getBean("triangle");
	t.draw();*/
	Circle c=(Circle)context.getBean("circle");
	c.draw();
}
}
