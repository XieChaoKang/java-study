package 设计模式.观察者模式.事件监听模拟;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Observable;
import java.util.Observer;

public class EventObserver1 implements Observer,disposeEvents {

    Observable observable;
    private String message;

    public EventObserver1(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof ThemeObject){
            ThemeObject t = (ThemeObject) o;
            this.message = t.getMessage();
            dispose();
        }
    }

    @Override
    public void dispose() {
        System.out.println("主动获取事件通知，开始处理::"+message);
    }
}
