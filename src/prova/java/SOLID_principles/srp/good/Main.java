package prova.java.SOLID_principles.srp.good;

import prova.java.SOLID_principles.srp.bad.ITextManipulator;
import prova.java.SOLID_principles.srp.bad.TextManipulator;

public class Main
{
    public static void main(String[] args) {
        ITextManipulator t = new TextManipulator("My string");
        t.appendText(" ciao");
        t.findWordAndReplace("ciao", "addio");
        t.printText();

        //ITextWriter tw = new TextPrinter(t);
    }
}
