package me.buhuan.design_pattern.chain_of_responsibility;

/**
 * Created by hbh on 2017/2/7.
 * 解决问题的抽象类
 */
public abstract class Support {

    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }
    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public abstract boolean resolve(Trouble trouble);

    public String toString() {
        return "[" + name + "]";
    }

    public void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    public void done(Trouble trouble) {
        System.out.println(trouble + "is resolved by" + this + ".");
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + "cannot be resolved");
    }
}
