package me.buhuan.design_pattern.chain_of_responsibility;

/**
 * Created by hbh on 2017/2/7.
 * 解决问题的具体类（永远不处理的问题）
 */
public class NoSupport extends Support{

    public NoSupport(String name) {
        super(name);
    }

    @Override
    public boolean resolve(Trouble trouble) {
        return false;
    }

}
