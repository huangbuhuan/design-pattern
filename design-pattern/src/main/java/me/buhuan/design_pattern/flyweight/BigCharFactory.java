package me.buhuan.design_pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hbh on 2017/2/13.
 */
public class BigCharFactory {
    private Map<String, BigChar> pool = new HashMap<>();
    private static BigCharFactory singleton = new BigCharFactory();

    private BigCharFactory() {

    }

    public static BigCharFactory getSingleton() {
        return singleton;
    }

    public synchronized BigChar getBigChar(char charName) {
        BigChar bc = (BigChar)pool.get("" + charName);
        if (bc == null) {
            bc = new BigChar(charName);
            pool.put(""+ charName, bc);
        }
        return bc;
    }
}
