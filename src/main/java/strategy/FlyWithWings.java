package strategy;

/**
 * @author lhq
 * @version $Id: DUMMY $
 */
public class FlyWithWings implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println(" fly with wings");
	}
}
