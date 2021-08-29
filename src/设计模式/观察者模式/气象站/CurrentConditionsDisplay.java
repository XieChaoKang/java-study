package 设计模式.观察者模式.气象站;

public class CurrentConditionsDisplay implements OBserver,DisplayElement{

    private float temperature;
    private float humidity;
    private Subject weatherData;

    //构造函数 初始化主题对象 并将自己注册为观察者
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(temperature + "::" + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
