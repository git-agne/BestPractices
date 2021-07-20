package prova.java.SOLID_principles.lsp.example1.good;

public class Main
{
    public static void main(String[] args) {
        FlyingBird[] fb = new FlyingBird[] {new Duck()};
        Kiwi k = new Kiwi();
        for(FlyingBird b: fb) {
            b.fly();
        }
    }
}
