package prova.java.SOLID_principles.lsp.example1.bad;

public class Kiwi implements Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }
}
