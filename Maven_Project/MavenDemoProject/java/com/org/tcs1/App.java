package com.org.tcs1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.tcs1.bean.Manager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    
        System.out.println( "Hello World!" );
        
        ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
        
       Manager m =(Manager) ap.getBean("manager");
        m.doWork();
       m.callMeeting();
    }
}
