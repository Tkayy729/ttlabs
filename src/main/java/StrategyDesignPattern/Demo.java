package StrategyDesignPattern;

public class Demo {
    public static void main(String[] args) {
        FlyBehaviour flyWithWings = new FlyWithWings();
        FlyBehaviour noFly =  new NoFly();


        RedDuck redDuck = new RedDuck(noFly);
        MallardDuck mallardDuck = new MallardDuck(flyWithWings);
        mallardDuck.performFly();
        System.out.println("-----------------------");
        redDuck.performFly();
    }
}
