package 设计模式.观察者模式.事件监听模拟;

import 设计模式.观察者模式.气象站.OBserver;
import 设计模式.观察者模式.事件监听模拟.Subject;

import java.util.ArrayList;
import java.util.Observable;

public class ThemeObject extends Observable implements Subject {

    private ArrayList<MyObserver> observers;

    private String message;

    public ThemeObject(){
        observers = new ArrayList<>();
    }

    public void sendEvent(){
        setChanged();
        notifyObservers();
        clearChanged();
    }

    public void updateMessage(String message){
        this.message = message;
        sendEvent();
    }

    public void updateMessage2(String message){
        this.message = message;
        notifyObserver();
    }

    public String getMessage() {
        return message;
    }

    @Override
    public void registerObserver(MyObserver oBserver) {
        observers.add(oBserver);
    }

    @Override
    public void removeObserver(MyObserver oBserver) {
        int index = observers.indexOf(oBserver);
        if (index > 0){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObserver() {
        for (MyObserver observer : observers) {
            observer.update(message);
        }
    }


}
