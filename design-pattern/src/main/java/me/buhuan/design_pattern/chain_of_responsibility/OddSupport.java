package me.buhuan.design_pattern.chain_of_responsibility;

/**
 * Created by hbh on 2017/2/7.
 * 用来解决问题的具体类（仅解决奇数的问题）
 */
public class OddSupport extends Support{

    public OddSupport(String name) {
        super(name);
    }

    @Override
    public boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1) {
            return true;
        }
        return false;
    }
}
