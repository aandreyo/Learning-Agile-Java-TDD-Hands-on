/**
 * 
 */
package DesignPatterns.AbstactFactoryPattern;



/**
 * @author ANREW25
 *
 */
public class AmexPlatinumValidator extends Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		return false;
	}
	
}
