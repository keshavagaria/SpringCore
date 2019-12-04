package com.csi.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Service {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Triangle t=(Triangle) context.getBean("triangle");
	t.setId(100);
	t.setName("Quilateral");
	System.out.println(t.getId()+" "+t.getName());
	
	Triangle t2=(Triangle) context.getBean("triangle");
	System.out.println(t2.getId()+" "+t2.getName());
	
	Triangle t3=(Triangle) context.getBean("triangle");
	System.out.println(t3.getId()+" "+t3.getName());
}
}
