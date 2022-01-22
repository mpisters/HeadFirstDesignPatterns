package WeatherStation;

public class ForecastDisplay implements Observer, DisplayElement{
    private WeatherData weatherData;
    private float lastPressure;
    private float currentPressure;
    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        String message = "";
        String improvingWeather = "Improving weather on the way!";
        String worseWeather = "Watch out for cooler, rainy weather";
        String sameWeather = "More of the same";

        if (currentPressure > lastPressure) message = improvingWeather;
        else if (currentPressure < lastPressure) message = worseWeather;
        else message = sameWeather;

        System.out.println("Forecast: " + message);
    }

    @Override
    public void update() {
        this.lastPressure = currentPressure;
        this.currentPressure = this.weatherData.getPressure();
        display();
    }
}
