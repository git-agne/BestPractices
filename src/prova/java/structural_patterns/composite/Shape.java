package prova.java.structural_patterns.composite;

import java.util.ArrayList;
import java.util.List;

public interface Shape
{
    void draw(String fillColor);
}

class Triangle implements Shape
{
    @Override
    public void draw(String fillColor) {
        System.out.println("Draw a triangle with color " + fillColor);
    }
}

class Circle implements Shape
{
    @Override
    public void draw(String fillColor) {
        System.out.println("Draw a circle with color " + fillColor);
    }
}

class Drawing implements Shape
{
    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing me with color " + fillColor);

        for(Shape s: shapes) {
            s.draw(fillColor);
        }
    }

    public void add(Shape s) {
        shapes.add(s);
    }

    public void remove(Shape s) {
        shapes.remove(s);
    }

    public void clear() {
        shapes.clear();
    }
}