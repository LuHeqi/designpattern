package strategy;

/**
 * @author lhq
 * @version $Id: DUMMY $
 */
public class MuteQuack implements  QuackBehavior {
	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
