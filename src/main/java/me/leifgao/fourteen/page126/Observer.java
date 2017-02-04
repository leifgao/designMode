package me.leifgao.fourteen.page126;

/**
 * Created by leif on 2017/1/23
 */
public abstract class Observer {

    protected String name;
    protected Secretary sub;

    public Observer(String name, Secretary sub) {
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();

}
