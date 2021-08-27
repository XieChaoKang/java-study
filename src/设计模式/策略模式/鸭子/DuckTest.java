package 设计模式.策略模式.鸭子;

public class DuckTest {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();

        Duck duck1 = new ModelDuck();
        duck1.performFly();
        duck1.performQuack();
        duck1.setFlyBehavior(new FlyRocketPowered());
        duck1.setQuackBehavior(new Quack());
        duck1.performFly();
        duck1.performQuack();
    }
}
