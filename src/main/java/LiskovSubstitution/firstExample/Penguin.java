package LiskovSubstitution.firstExample;

public class Penguin extends Bird{
    @Override
    public void fly() {
        System.out.println("cannot fly");
    }
    // Penguin violates that the rule because it behaves differently
    // from its base class

    public void swim(){
        System.out.println("I can swim");
    }
}
