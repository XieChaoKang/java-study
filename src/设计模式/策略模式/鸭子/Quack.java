package 设计模式.策略模式.鸭子;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱~");
    }
}
