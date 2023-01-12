package LiskovSubstitution.firstExample;

public interface SwimmingBird {

     default void swim(){
        System.out.println("I can swim");
    }
}
