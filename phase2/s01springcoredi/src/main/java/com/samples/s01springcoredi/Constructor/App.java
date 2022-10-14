package com.samples.s01springcoredi.Constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext springcontainer = new ClassPathXmlApplicationContext("com/samples/s01springcoredi/Constructor/Springconfig.xml");
      
        ShoppingMall emp9 =  (ShoppingMall) springcontainer.getBean("emp10"); 
        System.out.println(emp9);
    }
}
