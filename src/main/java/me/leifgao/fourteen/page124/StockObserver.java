package me.leifgao.fourteen.page124;

/**
 * Created by leif on 2017/1/23
 */
public class StockObserver {
    private String name;
    private Secretary sub;

    public StockObserver(String name, Secretary sub) {
        this.name = name ;
        this.sub = sub;
    }

    public void update() {
        System.out.println(sub.getAction() + this.name + " 关闭股票行情，继续工作");
    }
}

