package Generics.classGenerics;

public class PrintSomething<T> {
   private T thingToPrint;

    public PrintSomething(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}
