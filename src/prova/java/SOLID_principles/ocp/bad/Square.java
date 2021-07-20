package prova.java.SOLID_principles.ocp.bad;

public class Square extends Shape
{
    public Square() {
        this.shapeType = ShapeType.Square;
    }

    public void drawSquare() {
        System.out.println("drawSquare");
    }
}
