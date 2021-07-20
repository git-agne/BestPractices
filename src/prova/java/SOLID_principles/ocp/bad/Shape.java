package prova.java.SOLID_principles.ocp.bad;

public abstract class Shape
{
    protected enum ShapeType {
        Circle,
        Square
    }

    protected ShapeType shapeType;

    public static void drawAll(Shape[] shapes) {
        for(Shape shape: shapes) {
            switch(shape.shapeType) {
                case Circle:
                    Circle c = (Circle) shape;
                    c.drawCircle();
                    break;
                case Square:
                    Square s = (Square) shape;
                    s.drawSquare();
                    break;
            }
        }
    }
}
