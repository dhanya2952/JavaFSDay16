package com.graymatter;

import java.sql.Connection;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.graymatter.beans.Customer;
import com.graymatter.beans.DataSource;
import com.graymatter.beans.HelloBean;
import com.graymatter.beans.Order;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("hello-bean.xml");
//        HelloBean hb=(HelloBean) context.getBean("hello");
//        hb.sayHello();
//        HelloBean hb1=(HelloBean) context.getBean("hello");
//        hb1.sayHello();
        
    	//constructor based injected bean
    	 ApplicationContext context = new ClassPathXmlApplicationContext("customer-bean.xml");
//        Customer c=(Customer) context.getBean("cust");
//        System.out.println(c);
//        System.out.println(c.hashCode());
//        
//        Customer c1=(Customer) context.getBean("cust");
//        System.out.println(c1);
//        System.out.println(c1.hashCode());
//        
//        Customer c2=(Customer) context.getBean("cust");
//        System.out.println(c2);
//        System.out.println(c2.hashCode());
        //default - singleton scope - uses same object space for all the objects
        //prototype - diff object space
        
        //setter based injected bean
//        Customer c1=(Customer) context.getBean("cust1");
//        System.out.println(c1);
    	  
//    	  Order order = (Order) context.getBean("ord");
//    	  System.out.println(order);
    	 
    	 XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("dbcon.xml"));
    	 DataSource ds= (DataSource)factory.getBean("DBcon");
    	 Connection con= ds.getConnection();
    	 
      
    
    }
}
