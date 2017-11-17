package map;
import java.util.*;

public class Linkedhashmap_Accessorder1 {

	public static void main(String[] args) throws Exception {
	    Map<String, String> m = new LinkedHashMap<> (16, 0.75f, true);

	    m.put("a", "raj");
	    m.put("b", "kanna");
	    System.out.println("m = " + m); // a, b
	    m.put("a", "raj1");
	    System.out.println("m = " + m); // b, a

	    Map<String, String> m2 = new LinkedHashMap<>();
	    m2.put("c", "kanna2");
	    m.get("b");

	    m.putAll(m2);
	    m.get("b");
	    System.out.println("m = " + m); 
	}
}
