package observer;

/**
 * @author lhq
 * @version $Id: DUMMY $
 */
public class CurrentConditionDisplay implements Observer ,DisplayElement{
	private  float temperature;
	private float pressure;
	private  String description;

	private Observable weatherData;

	public CurrentConditionDisplay() {

	}

	public CurrentConditionDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			this.temperature = ((WeatherData) o).getTemperature();
			this.pressure = ((WeatherData) o).getPressure();
			this.description = ((WeatherData) o).getDescription();
		}
		display();

	}

	@Override
	public void display() {
		System.out.println("current condition : "+temperature+" degree ,  "+pressure +" Mpa , "+description);
	}
}
