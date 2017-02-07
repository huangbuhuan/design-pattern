package me.buhuan.design_pattern.chain_of_responsibility;

/**
 * Created by hbh on 2017/2/7.
 * 制作Support的职责链，制造问题并测试程序行为
 */
public class Main {

    public static void main(String[] args) {
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 100);
        Support charlie = new SpecialSupport("Charlie", 429);
        Support diana = new LimitSupport("Diana", 200);
        Support elmo = new OddSupport("Elmo");
        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo);
        for (int i = 0; i < 500; i++) {
            alice.support(new Trouble(i));
        }
    }

}
