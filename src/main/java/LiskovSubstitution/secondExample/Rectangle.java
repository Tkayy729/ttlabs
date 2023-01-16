package LiskovSubstitution.secondExample;

public class Rectangle {
    protected int height;
    protected int width;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    void area(){
        System.out.println(this.height * this.width);
    }
}
