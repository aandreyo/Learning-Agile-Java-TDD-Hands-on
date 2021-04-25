/**
 * 
 */

/**
 * @author ANREW25
 *
 */
public class Mountain implements Comparable<Mountain>{

	private String name;
	private int height;
	
	public Mountain(String name, int height) {
		this.name=name;
		this.height=height;
	}

	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	//lowest to highest:: use o.height first if highest to lowest
	public int compareTo(Mountain o) {
		return this.height - o.height;
	}
	
	
}
