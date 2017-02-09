package me.leifgao.fourteen.page128;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leif on 2017/2/6
 */
public class Boss implements Subject {
    private String action;
    private List<Observer> observers = new ArrayList<Observer>();

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        action = action;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update();
        }
    }
}
