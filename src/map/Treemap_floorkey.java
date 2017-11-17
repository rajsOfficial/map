package map;

import java.util.*;

public class Treemap_floorkey {
   public static void main(String[] args) {
	   																					// creating tree map 
   TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
      
   																						// populating tree map
   treemap.put(2, "two");
   treemap.put(1, "one");
   treemap.put(3, "three");
   treemap.put(6, "six");
   treemap.put(5, "five");
   
   System.out.println("Checking greatest key less than or equal to 3");
   System.out.println("Value is: "+ treemap.floorKey(3));
   
   System.out.println("Checking greatest key  Strictly less than 3");
   System.out.println("Value is : "+ treemap.lowerKey(3));
   
   System.out.println("First key is :"+treemap.firstKey());
    System.out.println("last key is :"+treemap.lastKey());
    
   }    
}