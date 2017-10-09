package py.com.snowtech.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class TestFour {
  public static void main(String[] args) {
    Set<String> info = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
    Map<String, Set<String>> tokensByAuthor = new HashMap<>();
    
    info.add("IfStatement#Jake Wharton");
    info.add("ForeachStatement#Jake Wharton");
    info.add("int#Jake Wharton");
    info.add("Double#Jake Wharton");
    
    info.add("IfStatement#Cristhian Recalde");
    info.add("ForeachStatement#Cristhian Recalde");
    info.add("int#Cristhian Recalde");
    info.add("Double#Cristhian Recalde");
    info.add("boolean#Cristhian Recalde");
    info.add("loop#Cristhian Recalde");
    
    // filter list of authors
    info.forEach( t -> {
      String [] data = t.split("#");
      
      if (data.length > 1) {
        Set<String> tokens = tokensByAuthor.get(data[1]);
        if (tokens == null) {
          tokens = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        }
        
        tokens.add(data[0]);
        tokensByAuthor.put(data[1], tokens);
      }
    });
    
    tokensByAuthor.entrySet().forEach( s -> {
      System.out.println("Author: " + s.getKey());
      
      s.getValue().forEach(v -> {
        System.out.print(v + " ");
      });
      System.out.println();
    });
    
  }
}
