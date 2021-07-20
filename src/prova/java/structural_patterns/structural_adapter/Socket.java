package prova.java.structural_patterns.structural_adapter;

public class Socket
{
    public Volt getVolt() {
        return new Volt(120);
    }
}
