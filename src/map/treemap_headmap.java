package map;
import java.util.*;
public class treemap_headmap {


	   public static void main(String[] args) {
		   																// creating maps 
	   TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
	   NavigableMap<Integer, String> treemapheadincl = new TreeMap<Integer, String>();
	      
	   																	// populating tree map
	   treemap.put(2, "two");
	   treemap.put(1, "one");
	   treemap.put(3, "three");
	   treemap.put(6, "six");
	   treemap.put(5, "five");
	      
	   																	// getting head map inclusive 3
	   treemapheadincl=treemap.headMap(3,true);
	      
	   System.out.println("Checking values of the map");
	   System.out.println("Value is: "+ treemapheadincl);
	   }    
	}
