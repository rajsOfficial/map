package map;

import java.util.*;

public class hashmap_put {
   public static void main(String args[]) {
	   																				// create hash map
   HashMap<Integer,String> newmap = new HashMap<>();
      
   																					// populate hash map
   newmap.put(1, "Hello");
   int n=newmap.hashCode();
   System.out.println(n);
   newmap.put(2, "Every");
   newmap.put(3, "one");
      
   System.out.println("Map value before change: "+ newmap);
      
   																				
      
   																					// check returned previous value
   System.out.println("Returned previous value: "+ newmap.put(3, "is good"));
      
   System.out.println("Map value after change: "+ newmap);
   }    
}