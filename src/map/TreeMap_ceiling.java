package map;
import java.util.TreeMap;

public class TreeMap_ceiling {
   public static void main(String[] args) {
   // creating tree map 
   TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
      
   // populating tree map
   treemap.put(2, "two");
   treemap.put(1, "one");
   treemap.put(3, "three");
   treemap.put(6, "six");
   treemap.put(5, "five");
      
   System.out.println("Ceiling key entry for 4: "+ treemap.ceilingKey(4));
   System.out.println("Ceiling key entry for 5: "+ treemap.ceilingKey(5));
   System.out.println("Ceiling key entry for 7: "+ treemap.ceilingKey(7));
   System.out.println("Higher key entry for  5: "+treemap.higherKey(5));
   
   System.out.println("Ceiling entry for 4: "+ treemap.ceilingEntry(4));
   System.out.println("Ceiling entry for 5: "+ treemap.ceilingEntry(5));
   }    
}