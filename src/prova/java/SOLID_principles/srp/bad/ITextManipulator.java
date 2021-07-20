package prova.java.SOLID_principles.srp.bad;

public interface ITextManipulator
{
    String getText();
    void appendText(String newText);
    String findWordAndReplace(String word, String replWord);
    void printText();
}
