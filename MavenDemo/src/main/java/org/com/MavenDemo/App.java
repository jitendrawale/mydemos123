package org.com.MavenDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.bean.ConfigurationClass;
import com.org.bean.Manager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext app = new AnnotationConfigApplicationContext(ConfigurationClass.class);
    	Manager m = (Manager) app.getBean("manager");
    	m.doWork();
    	m.callMeeting();
    	
    }
}
