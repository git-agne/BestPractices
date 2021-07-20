package prova.java.creational_patterns.abstract_factory;

import javax.swing.*;

public interface UIFactory {
    // Non abbiamo creazione di un solo tipo di oggetto come in Factory Method, ma di tanti oggetti
    Button buildButton();
    Slider buildSlider();
    Window buildWindow();
}

class UIFactoryWindows implements UIFactory {

    @Override
    public Button buildButton() {
        return new WindowsButton();
    }

    @Override
    public Slider buildSlider() {
        return new WindowsSlider();
    }

    @Override
    public Window buildWindow() {
        return new WindowsWindow();
    }
}

class UIFactoryOSX implements UIFactory {

    @Override
    public Button buildButton() {
        return new OSXButton();
    }

    @Override
    public Slider buildSlider() {
        return new OSXSlider();
    }

    @Override
    public Window buildWindow() {
        return new OSXWindow();
    }
}