package com.samples.s01springcoredi.propertyfile;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext springcontainer = new ClassPathXmlApplicationContext("com/samples/s01springcoredi/propertyfile/Springconfig.xml");
      
       MyDao emp9 =   (MyDao) springcontainer.getBean("emp10"); 
        System.out.println(emp9);
    }
}
