package 设计模式.观察者模式.事件监听模拟;

public class EventObserver2 implements disposeEvents, MyObserver{

    private Subject themeObject;
    private String message;

    public EventObserver2(ThemeObject themeObject){
        this.themeObject = themeObject;
        themeObject.registerObserver(this);
    }

    @Override
    public void update(String message) {
        this.message = message;
        dispose();
    }

    @Override
    public void dispose() {
        System.out.println("被动接收事件通知，开始处理：："+message);
    }
}
