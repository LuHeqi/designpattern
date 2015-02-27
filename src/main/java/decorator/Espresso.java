package decorator;

/**
 * 浓缩咖啡
 * @author lhq
 * @version $Id: DUMMY $
 */
public class Espresso extends Beverage{
	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}
}
