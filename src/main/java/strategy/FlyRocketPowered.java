package strategy;

/**
 * @author lhq
 * @version $Id: DUMMY $
 */
public class FlyRocketPowered implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println(" I am flying with a rocket");
	}
}
