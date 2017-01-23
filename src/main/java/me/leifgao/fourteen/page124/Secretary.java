package me.leifgao.fourteen.page124;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leif on 2017/1/23
 */
public class Secretary {
    //同事列表
    private List<StockObserver> observers = new ArrayList<StockObserver>();
    private String action;

    public void Attach(StockObserver observer) {
        observers.add(observer) ;
    }

    public void notifyStockObserver() {
        for (StockObserver stockObserver : observers) {
            stockObserver.update();
        }
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}