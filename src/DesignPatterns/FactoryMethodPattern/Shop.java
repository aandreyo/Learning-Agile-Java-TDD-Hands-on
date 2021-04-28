/**
 * 
 */
package DesignPatterns.FactoryMethodPattern;

/**
 * @author ANREW25
 *
 */
public class Shop extends Website {

	@Override
	public void createWebsite() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());

	}

}
