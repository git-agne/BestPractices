package prova.java.behavioural_patterns.observer;

public interface Observer
{
    void update();
}

class NewsChannel implements Observer {
    @Override
    public void update() {
        System.out.println("new Breaking News available");
    }
}
