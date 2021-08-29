package 设计模式.观察者模式.气象站;

/**
 * 主题实现的接口 注册，删除，通知观察者
 */
public interface Subject {

    void registerObserver(OBserver oBserver);

    void removeObserver(OBserver oBserver);

    void notifyObserver();
}
