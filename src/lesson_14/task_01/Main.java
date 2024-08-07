package lesson_14.task_01;

public class Main {
    public static void main(String[] args) {

        GeometricalShape[] geometricalShapes = new GeometricalShape[3];
        geometricalShapes[0] = new Circle(5);
        geometricalShapes[1] = new Square(7);
        geometricalShapes[2] = new Rectangle(2,3);




        System.out.println(" Проходимся циклом по массиву");
        for (GeometricalShape currentGeometricalShapes : geometricalShapes) {
            System.out.println(" Площадь - " + currentGeometricalShapes.getArea());
            System.out.println(" Периметр - " + currentGeometricalShapes.getPerimeter());

        }

    }
}
