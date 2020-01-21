package com.spring.tinu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

		public static void main(String[] args) {
			
			ApplicationContext beanObj=new ClassPathXmlApplicationContext("resource/beanjava.xml");
			HelloWorld obj=(HelloWorld) beanObj.getBean("Spring3HelloWorldBean");
			obj.printHello();
			obj.printAge();
		}
}
