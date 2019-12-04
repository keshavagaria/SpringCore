package com.csi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.csi.spring.Triangle;
import com.csi.spring2.Triangle2;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Triangle2 t2=(Triangle2)context.getBean("triangle2");
	t2.draw();
}
}
