package me.leifgao.fourteen.page126;

/**
 * Created by leif on 2017/1/23
 */
public class NbaObserver extends Observer{

    public NbaObserver(String name, Secretary sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(sub.getAction() + "  " + this.name + "停止观看NBA，继续工作");
    }
}
