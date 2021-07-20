package prova.java.SOLID_principles.ocp.good;

public interface Shape
{
    void draw();

    static void drawAll(Shape[] shapes) {
        for(Shape s: shapes) {
            s.draw();
        }
    }
}
