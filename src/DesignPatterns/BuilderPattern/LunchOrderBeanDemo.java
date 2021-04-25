/**
 * 
 */
package DesignPatterns.BuilderPattern;


/**
 * @author ANREW25
 *
 */
public class LunchOrderBeanDemo {

	public static void main(String[] args) {
		
		LunchOrder.Builder builder = new LunchOrder.Builder();
		
		builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");
		
		
		LunchOrder lunchOrderBean = builder.build();
		
		System.out.println(lunchOrderBean.getBread());
		System.out.println(lunchOrderBean.getCondiments());
		System.out.println(lunchOrderBean.getDressing());
		System.out.println(lunchOrderBean.getMeat());
		
		
		
	}
	
	
	
	
	
}
