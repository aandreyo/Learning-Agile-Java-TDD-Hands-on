/**
 * 
 */
package DesignPatterns.FactoryMethodPattern;


/**
 * @author ANREW25
 *
 */
public class FactoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
		
		System.out.println(site.getPages());
		
		site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
		
		System.out.println(site.getPages());
	}

}
