package com.samples.CRUD;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/CRUD/SpringConfig.xml");
       
       
        DAO employeeDao = (DAO) springContainer.getBean("kk");
     
        
    		Employee emp = new Employee();
    		emp.setId(2);
    		emp.setFirstname("Dexter");
    		emp.setLastname("Johnson");
    		
    		employeeDao.create(emp);
    }
}
