package com.csi.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Service {
public static void main(String[] args) {
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Employee emp=(Employee)context.getBean("employee");
	emp.display();
	context.registerShutdownHook();
}
}
