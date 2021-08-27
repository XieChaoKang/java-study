package 设计模式.策略模式.鸭子;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("can`t fly");
    }
}
