package prova.java.SOLID_principles.lsp.example1.bad;

public class Main
{
    public static void main(String[] args) {
        Bird[] birds = new Bird[]{new Duck(), new Kiwi()};

        for(Bird b: birds) {
            if(b instanceof Kiwi) {
                continue;
            }
            b.fly();
        }
    }
}
