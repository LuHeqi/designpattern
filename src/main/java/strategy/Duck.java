package strategy;

/**
 * @author lhq
 * @version $Id: DUMMY $
 */
public abstract class Duck {
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;

	public abstract void display();

	public void performQuack(){
		quackBehavior.quack();
	}
	public void performFly(){
		flyBehavior.fly();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
