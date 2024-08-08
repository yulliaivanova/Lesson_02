package homework_14.task_01;

public class Rectangle extends GeometricalShape{

    private double length ;
    private double height ;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double getArea() {
        return length * height;
    }

    @Override
    public double getPerimeter() {
        return (length + height) * 2;
    }
}
