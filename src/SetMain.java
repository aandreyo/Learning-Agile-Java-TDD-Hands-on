
/**
 * @author ANREW25
 *
 */
import java.util.*;
public class SetMain {
	
	public static void main(String... args) {
		//unordered
		Set<Integer> primeNumbers1 = new HashSet<>();
		//ordered
		Set<Integer> primeNumbers2 = new TreeSet<>();
		
		
		primeNumbers1.add(71);
		primeNumbers1.add(61);
		primeNumbers1.add(41);
		primeNumbers1.add(1);
		
		
		primeNumbers2.add(71);
		primeNumbers2.add(61);
		primeNumbers2.add(41);
		primeNumbers2.add(1);
		
		
		primeNumbers1.forEach(System.out::println);
		System.out.println("");
		primeNumbers2.forEach(System.out::println);
	}
	

}
