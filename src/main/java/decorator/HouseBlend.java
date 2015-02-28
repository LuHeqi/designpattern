package decorator;

/**
 * 星巴兹 咖啡
 * @author lhq
 * @version $Id: DUMMY $
 */
public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = " House Blend Coffee";
	}

	@Override
	public double cost() {
		return 0.89;
	}
}
