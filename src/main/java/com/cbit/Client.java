package com.cbit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		DemoBean demoBean = (DemoBean)context.getBean("demoBean");
		demoBean.callProcedure(101);
		

	}

}
