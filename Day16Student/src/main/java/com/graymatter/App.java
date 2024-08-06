package com.graymatter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.graymatter.beans.Student;
import com.graymatter.beans.Student_two;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//constructor based injected bean
//        ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
//        Student s1=(Student) context.getBean("stud1");
//        System.out.println(s1);
        
        //setter based injected bean
//        Student s2=(Student) context.getBean("stud2");
//        System.out.println(s2);
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("Emp-Bean.xml");
        Student_two s1=(Student_two) context.getBean("Stud1");
        System.out.println(s1);
        
        //Constructor Autowiring and bean class not having constructors then spring 
        //container will perform constructor injection thru default constructor then uses setters to inject values
    }
}
