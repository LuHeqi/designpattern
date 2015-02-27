package strategypattern;

/**
 * @author lhq
 * @version $Id: DUMMY $
 */
public class Quack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println(" quack ");
	}
}
