package StrategyDesignPattern;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    public Duck(FlyBehaviour flyBehaviour){
        this.flyBehaviour =flyBehaviour;
    }
    void swim(){
        System.out.println( "I'm swimming");
    }

    void performFly(){
        flyBehaviour.fly();
    }
}
