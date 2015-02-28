package decorator;

/**
 * 调料Decorator(抽象装饰者)
 * 必须要让 CondimentDecorator 能取代 Beverage ,所以Condiment 必须extends Beverage
 * @author lhq
 * @version $Id: DUMMY $
 */
public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();

}
