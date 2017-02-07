package me.buhuan.design_pattern.chain_of_responsibility;

/**
 * Created by hbh on 2017/2/7.
 * 用来解决问题的具体类（仅解决标号小于制定编号的问题）
 */
public class LimitSupport extends Support{

    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    public boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limit) {
            return true;
        }
        return false;
    }
}
