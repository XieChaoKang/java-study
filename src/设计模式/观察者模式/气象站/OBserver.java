package 设计模式.观察者模式.气象站;

/**
 * 观察者实现的接口 以便主题通过接口来通知观察者数据是否有变动
 */
public interface OBserver {
    void update(float temp, float humidity, float pressure);
}
