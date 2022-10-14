package com.samples.InterfaceInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/InterfaceInjection/SpringConfig2.xml");

		Service s= (Service) springContainer.getBean("serviceImple");
		System.out.println(s);
		s.m2();
		
    }
}
