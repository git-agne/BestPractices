package prova.java.creational_patterns.prototype;

public class Main
{
    public static void main(String[] args) {
        Employees e = new Employees();
        e.load();

        Employees e2 = (Employees) e.clone();
    }
}
