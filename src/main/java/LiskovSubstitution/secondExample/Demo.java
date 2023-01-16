package LiskovSubstitution.secondExample;

import LiskovSubstitution.firstExample.Duck;

public class Demo {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();

        Rectangle rectangle = new Rectangle(2,10);
        rectangle.area();
        increaseRectangleWidth(rectangle);
        rectangle.area();

        System.out.println("-------------------------");

        Square square = new Square(2,10);
        square.area();
        increaseRectangleWidth(square);
        square.area();
    }

   static void increaseRectangleWidth(Rectangle rectangle){
        rectangle.setWidth(rectangle.width + 1);
    }
}
