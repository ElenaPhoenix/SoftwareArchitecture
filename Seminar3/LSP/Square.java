package LSP;

public class Square extends QuadRangle{
    int len;

    public Square(int len) {
        this.len = len;
    }

    @Override
    int area() {
        return len * len; // Если метод ищет площадь, то и наследник должен искать площадь
    }
}
