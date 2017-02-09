package me.leifgao.fourteen.page128;

/**
 * Created by leif on 2017/2/6
 */
public abstract class Observer {

    protected String name;
    protected Subject sub;

    public Observer(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();

}
