package prova.java.SOLID_principles.lsp.example1.bad;

public class Duck implements Bird {
    @Override
    public void fly() {
        System.out.println("I'm a duck and I like to fly");
    }
}
