package 设计模式.观察者模式.气象站.利用java内置观察者模式;

import java.util.ArrayList;
import java.util.Observable;

/**
 * 主题
 */
public class WeatherData extends Observable {

    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData(){}

    //数据变更 通知观察者
    public void  measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void  updateMeasurements(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
