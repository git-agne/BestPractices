package prova.java.SOLID_principles.ocp.bad;

public class Circle extends Shape
{
    public Circle() {
        this.shapeType = ShapeType.Circle;
    }

    public void drawCircle() {
        System.out.println("drawCircle");
    }
}
