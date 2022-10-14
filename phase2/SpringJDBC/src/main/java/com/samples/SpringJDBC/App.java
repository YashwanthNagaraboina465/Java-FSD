package com.samples.SpringJDBC;

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
        
        ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/SpringJDBC/SpringConfig.xml");
        
JdbcTemplate jdbcTemplate = (JdbcTemplate) springContainer.getBean("jdbcTemplate");
		
		String sql = "insert into employee values (?, ?, ?)";
		int updateResult = jdbcTemplate.update(sql, 1, "John", "khhj");
		System.out.println("Number of records inserted: " + updateResult);
		
    }
}
