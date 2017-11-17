package map;

import java.util.*;

public class Hashmap_Contains {
   public static void main(String args[]) {
	   														// create hash map
   HashMap newmap = new HashMap();      
      
   															// populate hash map
   newmap.put(1, "Hello");
   newmap.put(2, "Every");
   newmap.put(3, "One");
      
   System.out.println("Values before remove: "+ newmap);
      
   															// remove value for key 2
   newmap.remove(2);

   System.out.println("Values after remove: "+ newmap);
   }    
}
