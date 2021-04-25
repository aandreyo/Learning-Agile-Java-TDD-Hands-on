
import java.util.*;
import java.util.stream.Collectors;


public class Main {
	
	
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        
        List<Mountain> mountains = new ArrayList<>();
        mountains.add(new Mountain("Everest",8848));
        mountains.add(new Mountain("Matterhorn",4478));
        mountains.add(new Mountain("K2",8611));
        
        Collections.sort(mountains);
        //lowest to highest
        System.out.println(mountains.stream()
        		.map(Mountain::getName)
        		.collect(Collectors.toList()));
        
        
      //highest to lowest
        Comparator<Mountain> mountainComparator = new Comparator<Mountain>() {
        	@Override
        	public int compare(Mountain o1,Mountain o2) {
        		return o2.getHeight() - o1.getHeight();
        	}
        };
        
        Collections.sort(mountains,mountainComparator);
        System.out.println(mountains.stream()
        		.map(Mountain::getName)
        		.collect(Collectors.toList()));
        
        
        //lambda to get highest to lowest
        Comparator<Mountain> mountainComparator2 = (m1, m2) ->
        		m2.getHeight() - m1.getHeight();
        
        Collections.sort(mountains,mountainComparator2);
        System.out.println(mountains.stream()
                .map(Mountain::getName)
                .collect(Collectors.toList()));
    }
    
    
   
    
    
    
    
}
