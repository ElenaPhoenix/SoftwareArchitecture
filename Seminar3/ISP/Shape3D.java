package ISP;

public interface Shape3D extends Shape{ // благодаря extends Shape3D теперь заключает в себе методы 2D-фигур и 3D-фигур
    double value();
}