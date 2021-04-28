/**
 * 
 */
package DesignPatterns.FactoryMethodPattern;
import java.util.*;
/**
 * @author ANREW25
 *
 */
public abstract class Website {

	
	protected List<Page> pages = new ArrayList<>();
	
	public List<Page> getPages() {
		return pages;
	}

	public Website() {
		this.createWebsite();
	}
	
	public abstract void createWebsite();
	
}
