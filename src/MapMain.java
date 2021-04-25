
/**
 * @author ANREW25
 *
 */

import java.util.*;
public class MapMain {

	public static void main(String... args) {
		
		HashMap countries = new HashMap();
		
		//int is key, string is value like python dictionaries
		HashMap<Integer, String> countries2 = new HashMap<>();
		
		Map languages = new HashMap();
		
		
		//generic typing
		//key and value same python dicts
		Map<String, String> languages2 = new HashMap<>();
		
		countries2.put(840,"USA");
		countries2.put(484,"MEX");
		countries2.put(124,"CAN");
		
		System.out.println(countries2.values());
		
	}
	
	
	
}
