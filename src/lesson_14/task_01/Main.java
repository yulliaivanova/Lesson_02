package lesson_14.task_01;

public class Main {
    public static void main(String[] args) {

        GeometricalShape[] geometricalShapes = new GeometricalShape[3];
        geometricalShapes[0] = new Circle();
        geometricalShapes[1] = new Square();
        geometricalShapes[2] = new Rectangle();


        Circle circle = new Circle();
        circle.radius = 5;

        Square square = new Square();
        square.side = 4;

        Rectangle rectangle = new Rectangle();
        rectangle.side1 = 2;
        rectangle.side2 = 3;

        System.out.println(" Проходимся циклом по массиву");
        for (GeometricalShape currentGeometricalShapes : geometricalShapes) {
            currentGeometricalShapes.area ();
            currentGeometricalShapes.perimeter() ;
        }

    }
}
