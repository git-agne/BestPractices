package prova.java.creational_patterns.abstract_factory;

public class Main {
    public static void main(String[] args) {
        UIFactory factory = new UIFactoryWindows();
        factory.buildButton().show();
        factory.buildSlider().show();
        factory.buildWindow().show();
    }
}
