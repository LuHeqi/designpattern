package strategy;

/**
 * @author lhq
 * @version $Id: DUMMY $
 */
public class Squeak implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println(" Squeak ");
	}
}
