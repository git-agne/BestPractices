package prova.java.structural_patterns.composite;

public class Main
{
    public static void main(String[] args) {
        Shape s1 = new Triangle();
        Shape s2 = new Circle();

        Drawing d = new Drawing();
        d.add(s1);
        d.add(s2);

        drawStuff(d);
        // Sia gli oggetti singoli, sia l'oggetto contenitore, sono tutti Shape
        // Hanno quindi lo stesso comportamento
    }

    public static void drawStuff(Shape s) {
        s.draw("red");
    }
}
