package me.leifgao.fourteen.page128;

/**
 * Created by leif on 2017/2/6
 */
public class StartUp128 {
    public static void main(String[] args) {
        Subject boss = new Boss();

        Observer gao = new NbaObserver("老高", boss);
        Observer kong = new NbaObserver("大孔", boss);

        boss.attach(gao);
        boss.attach(kong);

        boss.setAction("工作时间");

        boss.notifyObserver();
    }
}
