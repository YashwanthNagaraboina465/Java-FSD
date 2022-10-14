package stereoType.stereoType;

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
        
        ClassPathXmlApplicationContext spCont = new ClassPathXmlApplicationContext("stereoType/stereoType/SpringConfig.xml");
        
        Student s = (Student) spCont.getBean("student");
        System.out.println(s);
    }
}
