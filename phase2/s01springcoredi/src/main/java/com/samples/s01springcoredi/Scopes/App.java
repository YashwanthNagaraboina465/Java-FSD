package com.samples.s01springcoredi.Scopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext springcontainer = new ClassPathXmlApplicationContext("com/samples/s01springcoredi/Scopes/Springconfig.xml");
        Employee emp5 = (Employee) springcontainer.getBean("emp"); 
        System.out.println(emp5.hashCode());
        emp5.setId(5);
        System.out.println(emp5);
        Employee emp2 = (Employee) springcontainer.getBean("emp"); 
        System.out.println(emp2.hashCode());
        System.out.println(emp2);
       
    }
}
