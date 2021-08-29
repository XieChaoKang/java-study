package 设计模式.观察者模式.事件监听模拟;

public class Test {

    public static void main(String[] args) {
        ThemeObject themeObject = new ThemeObject();
        EventObserver2 observer2 = new EventObserver2(themeObject);
        EventObserver1 observer1 = new EventObserver1(themeObject);
        themeObject.updateMessage("主动获取");
        themeObject.updateMessage2("被动接收");
    }
}
