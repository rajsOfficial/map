package map;

import java.util.*;

public class Hashmap_CollectionView {
   public static void main(String args[]) {
	   														// create hash map
   HashMap newmap = new HashMap();      
      
   															// populate hash map
	newmap.put(1, "Hello");
	newmap.put(2, "Every");
	newmap.put(3, "One");
   															// checking collection view of the map
   System.out.println("Collection view is: "+ newmap.values());
   
   System.out.println("Size of map is :"+ newmap.size());
   }    
}