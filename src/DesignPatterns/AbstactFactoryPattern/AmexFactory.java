/**
 * 
 */
package DesignPatterns.AbstactFactoryPattern;

/**
 * @author ANREW25
 *
 */
public class AmexFactory extends CreditCardFactory {
	
	
	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch(cardType) {
		case GOLD:
			return new AmexGoldCreditCard();
		case PLATINUM:
			return new AmexPlatinumCreditCard();
		}
		
		return null;
	}
	
	@Override
	public Validator getValidator(CardType cardType) {
		
		switch(cardType) {
		case GOLD:
			return new AmexGoldCreditCard();
			
		case PLATINUM:
			return new AmexPlatinumCreditCard();
		}
		return null;
	}
	
	
	
}
