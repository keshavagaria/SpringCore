package com.csi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.csi.list.Triangle;
import com.csi.map.Triangle3;
import com.csi.properties.Triangle4;
import com.csi.set.Triangle2;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Triangle4 t4=(Triangle4)context.getBean("triangle4");
	t4.draw();
	
}
}
