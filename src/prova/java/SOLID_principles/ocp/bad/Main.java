package prova.java.SOLID_principles.ocp.bad;

public class Main
{
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{new Circle(), new Square()};
        Shape.drawAll(shapes);
    }
}
