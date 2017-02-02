package me.buhuan.design_pattern.strategy;

/**
 * Created by hbh on 2017/2/2.
 */
public interface Strategy {
    Hand nextHand();
    void study(boolean win);
}
