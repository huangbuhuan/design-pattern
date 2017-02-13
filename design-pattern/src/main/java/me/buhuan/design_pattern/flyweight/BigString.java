package me.buhuan.design_pattern.flyweight;

/**
 * Created by hbh on 2017/2/13.
 */
public class BigString {
    private BigChar[] bigChars;

    public BigString(String string) {
        bigChars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getSingleton();
        for (int i = 0; i < bigChars.length; i ++) {
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    public void print() {
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i].print();
        }
    }
}
