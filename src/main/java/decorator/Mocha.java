package decorator;

/**
 * 摩卡 装饰者
 * @author lhq
 * @version $Id: DUMMY $
 */
public class Mocha extends CondimentDecorator {
	private Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+", Mocha";
	}

	@Override
	public double cost() {
		return 0.20+beverage.cost();
	}
}
