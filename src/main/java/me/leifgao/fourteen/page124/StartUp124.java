package me.leifgao.fourteen.page124;

/**
 * Created by leif on 2017/1/23
 */
public class StartUp124 {
    public static void main(String[] args) {
        Secretary qianTai = new Secretary();

        qianTai.Attach(new StockObserver("老高", qianTai));
        qianTai.Attach(new StockObserver("大孔", qianTai));

        qianTai.setAction("老板回来了");

        qianTai.notifyStockObserver();
    }
}