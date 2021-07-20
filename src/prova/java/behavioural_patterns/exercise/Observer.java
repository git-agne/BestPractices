package prova.java.behavioural_patterns.exercise;

public interface Observer
{
    void printMessage(String s);
}

// CONTROLLARE COME FARE

class MsgPrinter implements Observer
{
    @Override
    public void printMessage(String s) {
        System.out.println("Messaggio: " + s);
    }
}
