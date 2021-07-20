package prova.java.behavioural_patterns.observer;

public class Main
{
    public static void main(String[] args) {
        NewsAgency ansa = new NewsAgency();
        NewsChannel rai1 = new NewsChannel();
        NewsChannel rai2 = new NewsChannel();
        // La rai è un Observer, e osserva l'Ansa

        ansa.register(rai1);
        ansa.register(rai2);

        ansa.releaseNews("Italia vince");
    }
}
