package me.leifgao.fourteen.page126;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leif on 2017/1/23
 */
public class Secretary {

    private List<Observer> observers = new ArrayList<Observer>();
    private String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void Attach(Observer observer) {
        observers.add(observer);
    }

    public void Detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observers ) {
            observer.update();
        }
    }
}
