package observer;

import java.util.ArrayList;

/**
 * @author lhq
 * @version $Id: DUMMY $
 */
public class WeatherData implements Observable {
	private float temperature;
	private float pressure;
	private String description;

	private ArrayList<Observer> obs;

	public WeatherData() {
		obs = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer observer) {
		obs.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		if ( obs.contains(observer)) {
			obs.remove(observer);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : obs) {
			observer.update(this,null);
		}
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature,float pressure,String description){
		this.temperature = temperature;
		this.pressure =pressure;
		this.description = description;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getPressure() {
		return pressure;
	}

	public String getDescription() {
		return description;
	}
}
