package map;
import java.util.*;
public class Hashmap_keyset {

	


	   public static void main(String args[]) {
		   														// create hash map
	   HashMap<Integer,String> newmap = new HashMap();
	      
	   															// populate hash map
	   newmap.put(1, "Hello");
	   newmap.put(2, "Every");
	   newmap.put(3, "One");
	      
	   															// get keyset value from map
	   Set keyset=newmap.keySet();
	   Set entryset = newmap.entrySet();  
	   															// check key set values
	   System.out.println("Key set values are: " + keyset);
	   System.out.println("Entry Set values aret: "+entryset);
	   }    
	}

