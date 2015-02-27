package observer;

/**
 * @author lhq
 * @version $Id: DUMMY $
 */
public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		new CurrentConditionDisplay(weatherData);
		new SimpleWeatherDisplay(weatherData);
		weatherData.setMeasurements(35.3f, 1.001f, "晴");
		weatherData.setMeasurements(18, 1.002f, "雨");
		weatherData.setMeasurements(30, 1.001f, "阴");
	}
}
