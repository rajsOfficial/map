package map;

import java.util.*;

public class Hashmap_containsO {
   public static void main(String args[]) {
	   																		// create hash map
   HashMap<Integer,String> newmap = new HashMap<>();
      
   																			// populate hash map
   newmap.put(1, "HI");
  
   newmap.put(2, "Every");
   int n=newmap.hashCode();
   System.out.println(n);
   newmap.put(3, "One"); 
      
   																			// check existence of key 2
   System.out.println("Check if key 2 exists: " + newmap.containsKey(2));
   
   System.out.println("Check if value 'point' exists: " +  newmap.containsValue("One"));
   }    
}
