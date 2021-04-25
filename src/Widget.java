import java.util.*;

/**
 * 
 */

/**
 * @author ANREW25
 *
 */
public class Widget<T> {
	private T type;
	

	public static void main(String... args) {
		Widget<String> widget = new Widget<>();
		
		String[] strings = new String[] {"Hi","There"};
		System.out.println(Widget.firstArrayElement(strings));
		
		
	}

	public void printList(List<?> list) {
		list.forEach(System.out::println);
	}
	public void printList1(List<? extends String> list) {
		list.forEach(System.out::println);
	}
	public void printList2(List<? super String> list) {
		list.forEach(System.out::println);
	}
	
	
	
	
	public static <T> T firstArrayElement(T[] t) {
		//if there is a first element return it.
		if(t.length >0) {
			return t[0];
		}
		//otherwise return null
		return null;
	}
	
	

	public T getType() {
		return type;
	}


	public void setType(T type) {
		this.type = type;
	}
	
	
}
