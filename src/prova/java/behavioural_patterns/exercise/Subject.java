package prova.java.behavioural_patterns.exercise;

import java.util.ArrayList;
import java.util.List;

public interface Subject
{
    void register(Observer o);
}

class Button implements Subject
{
    private List<Observer> obs = new ArrayList<>();

    @Override
    public void register(Observer o) {
        obs.add(o);
    }

    public void print() {

    }
}
