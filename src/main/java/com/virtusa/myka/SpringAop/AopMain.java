package com.virtusa.myka.SpringAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.virtusa.myka.service.ShapeService;

/**
 * Hello world!
 *
 */
public class AopMain 
{
    public static void main( String[] args ) {
    	ApplicationContext cxt = new ClassPathXmlApplicationContext("spring.xml");
    	ShapeService shapeService = cxt.getBean("shapeServie", ShapeService.class);
    	System.out.println(shapeService.getCircle().getName());
    
    }
}
 