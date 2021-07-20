package prova.java.SOLID_principles.ocp.good;

public class Main
{
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{new Square(), new Circle()};
        Shape.drawAll(shapes);
    }
}
