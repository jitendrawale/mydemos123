package demo.AOPDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.demo.ActorRepository;
import com.org.demo.ConfigurationClass;
import com.org.demo.MovieRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(ConfigurationClass.class);
    	MovieRepository obj=(MovieRepository) ac.getBean(MovieRepository.class);
       // System.out.println( "Hello World!" );
    	ActorRepository obj2=ac.getBean(ActorRepository.class);
    	obj.add("kaho na pyar hain");
    	obj2.add("srk");
    }
}
