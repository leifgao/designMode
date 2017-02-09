package me.leifgao.fourteen.page128;

/**
 * Created by leif on 2017/2/6
 */
public class NbaObserver extends Observer {

    public NbaObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(sub.getAction() + "  " + this.name + "停止观看NBA，继续工作");
    }
}
