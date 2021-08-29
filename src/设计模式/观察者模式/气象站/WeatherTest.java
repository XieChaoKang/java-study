package 设计模式.观察者模式.气象站;

public class WeatherTest {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.updateMeasurements(11,12,13.2f);
    }
}
