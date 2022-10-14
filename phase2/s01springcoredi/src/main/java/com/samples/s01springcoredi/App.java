package com.samples.s01springcoredi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext springcontainer = new ClassPathXmlApplicationContext("com/samples/s01springcoredi/Springconfig.xml");
        Employee emp = (Employee) springcontainer.getBean("emp2"); 
        System.out.println(emp);
        Employee emp3 = (Employee) springcontainer.getBean("emp3"); 
        System.out.println(emp3);

       hospital emp7 = (hospital) springcontainer.getBean("emp7"); 
        System.out.println(emp7);
        cardealer emp8 = (cardealer) springcontainer.getBean("emp8"); 
        System.out.println(emp8);
        
        ShoppingMall emp9 =  (ShoppingMall) springcontainer.getBean("emp10"); 
        System.out.println(emp9);
    }
}
