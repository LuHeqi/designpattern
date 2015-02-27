package observer;

/**
 * @author lhq
 * @version $Id: DUMMY $
 */
public interface Observable {

	void registerObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObservers();

}
