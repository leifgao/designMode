package me.leifgao.fourteen.page126;

/**
 * Created by leif on 2017/1/23
 */
public class StockObserver extends Observer {

    public StockObserver(String name, Secretary sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(sub.getAction() + "  " + this.name + "关闭股票继续工作");
    }
}
