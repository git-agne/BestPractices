package prova.java.creational_patterns.abstract_factory;

public interface Button {
    void show();
}

class WindowsButton implements Button {

    @Override
    public void show() {

    }
}

class OSXButton implements Button {

    @Override
    public void show() {

    }
}