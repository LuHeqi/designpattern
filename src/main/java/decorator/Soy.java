package decorator;

/**
 * 摩卡 装饰者
 * @author lhq
 * @version $Id: DUMMY $
 */
public class Soy extends CondimentDecorator {
	private Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return 0.1 + beverage.cost();
	}
}
