package observer;

/**
 * @author lhq
 * @version $Id: DUMMY $
 */
public class SimpleWeatherDisplay implements Observer, DisplayElement {
	private String description;
	private Observable weatherData;

	public SimpleWeatherDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(SimpleWeatherDisplay.this);
	}

	@Override
	public void display() {
		System.out.println("simple weather precast :" + description);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData ob = (WeatherData) o;
			this.description = ob.getDescription();
		}
		display();

	}
}
