package AutoWire.AutoWire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import AutoWire.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("AutoWire/AutoWire/SpringConfig.xml");
        
        Employee emp = (Employee) springContainer.getBean("emp"); 
        System.out.println(emp);
    }
}
