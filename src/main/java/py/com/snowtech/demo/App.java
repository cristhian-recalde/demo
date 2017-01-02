package py.com.snowtech.demo;

import java.util.UUID;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
     // creating UUID      
        UUID uid = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");     
             
        // checking the value of random UUID
        System.out.println("Random UUID value: "+uid.randomUUID()); 
    }
}
