package map;

import java.util.*;

public class Treemap_Entryset {
   public static void main(String[] args) {
	   																// creating tree map 
   TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
      
   																	// populating tree map
   treemap.put(2, "two");
   treemap.put(1, "one");
   treemap.put(3, "three");
   treemap.put(6, "six");
   treemap.put(5, "five");
      
   																	// putting values in set
   Set mapset=treemap.entrySet();
      
   System.out.println("Checking value");
   System.out.println("Entry set values: "+mapset);
   }    
}