package com.csi.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Service {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	 Triangle triangle =(Triangle)context.getBean("triangle");
	triangle.display();.
}
}
