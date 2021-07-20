package prova.java.SOLID_principles.srp.bad;

public class Main {

    public static void main(String[] args) {
        ITextManipulator tm = new TextManipulator("My string");
        tm.appendText(" ciao");
        tm.findWordAndReplace("ciao", "addio");
        tm.printText();


    }
}
