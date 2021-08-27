package 设计模式.策略模式.鸭子;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
