package com.company.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.Organization;

public class Test{
	
	public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	Organization org = (Organization) context.getBean("organization");
	System.out.println(org);
	
	}
			
}
