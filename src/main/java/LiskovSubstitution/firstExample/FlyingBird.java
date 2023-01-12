package LiskovSubstitution.firstExample;

public interface FlyingBird {

    default void fly(){
        System.out.println("I can fly");
    }
}
