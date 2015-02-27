package decorator;

/**
 * @author lhq
 * @version $Id: DUMMY $
 */
public class Whip extends CondimentDecorator {
	private Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+", Whip";
	}

	@Override
	public double cost() {
		return 0.3+beverage.cost();
	}
}
