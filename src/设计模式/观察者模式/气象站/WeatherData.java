package 设计模式.观察者模式.气象站;

import java.util.ArrayList;

/**
 * 主题
 */
public class WeatherData implements  Subject{

    private ArrayList<OBserver> serverList; //观察者列表

    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData(){
        serverList = new ArrayList<>(); //初始化列表
    }

    @Override
    public void registerObserver(OBserver oBserver) {
        serverList.add(oBserver); //注册观察者
    }

    @Override
    public void removeObserver(OBserver oBserver) {
        int i = serverList.indexOf(oBserver);
        if (i > 0){
            serverList.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (OBserver server : serverList) {
            server.update(temp, humidity, pressure);
        }
    }

    //数据变更 通知观察者
    public void  measurementsChanged(){
        notifyObserver();
    }

    public void  updateMeasurements(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
