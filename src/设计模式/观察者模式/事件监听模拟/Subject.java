package 设计模式.观察者模式.事件监听模拟;

import 设计模式.观察者模式.气象站.OBserver;

/**
 * 主题实现的接口 注册，删除，通知观察者
 */
public interface Subject {

    void registerObserver(MyObserver oBserver);

    void removeObserver(MyObserver oBserver);

    void notifyObserver();
}
