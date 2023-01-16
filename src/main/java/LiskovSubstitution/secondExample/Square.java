package LiskovSubstitution.secondExample;

public class Square extends Rectangle{

    public Square(int width, int height) {
        super(width, height);
    }

    @Override
    public void setWidth(int width) {
        this.height = width;
        this.width = width;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height;
    }
}
