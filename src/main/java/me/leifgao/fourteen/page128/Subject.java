package me.leifgao.fourteen.page128;

/**
 * Created by leif on 2017/2/6
 */
public interface Subject {
    void setAction(String action);
    String getAction();

    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObserver();
}
