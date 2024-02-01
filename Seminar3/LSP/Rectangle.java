package LSP;

public class Rectangle extends QuadRangle{
    public int height;
    public int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    int area() {
        return height * width;
    }
}
