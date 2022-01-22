package WeatherStation;

public class ForecastDisplay implements Observer, DisplayElement{
    private WeatherData weatherData;
    private float temperature;
    private float humidity;
    private float pressure;
    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast: " + temperature + "F degrees and " + humidity + "% humidity " + pressure + " pressure");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
