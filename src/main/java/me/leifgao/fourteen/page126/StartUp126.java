package me.leifgao.fourteen.page126;

/**
 * Created by leif on 2017/1/23
 */
public class StartUp126 {
    public static void main(String[] args) {
        Secretary qianTai = new Secretary();

        Observer gao = new StockObserver("老高", qianTai);
        Observer kong = new StockObserver("大孔", qianTai);
        Observer wang = new NbaObserver("小王", qianTai);
        Observer zhang = new NbaObserver("小张", qianTai);

        qianTai.Attach(gao);
        qianTai.Attach(kong);
        qianTai.Attach(wang);
        qianTai.Attach(zhang);
        qianTai.Detach(kong);

        qianTai.setAction("老板回来了");

        qianTai.notifyObserver();
    }
}
