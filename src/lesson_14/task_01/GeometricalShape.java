package lesson_14.task_01;

public abstract class GeometricalShape {

    public int perimeter;
    public int area;
    public int getPerimeter(){
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
