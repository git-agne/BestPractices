package prova.java.SOLID_principles.srp.good;

import java.util.Arrays;

public class TextPrinter implements ITextWriter
{
    private final ITextManipulator textManipulator;

    public TextPrinter(ITextManipulator textManipulator) {
        this.textManipulator = textManipulator;
    }

    @Override
    public void printText() {
        System.out.println(textManipulator.getText());
    }

    @Override
    public void printOutEachWordOfText() {
        System.out.println(Arrays.toString(textManipulator.getText().split(" ")));
    }
}
