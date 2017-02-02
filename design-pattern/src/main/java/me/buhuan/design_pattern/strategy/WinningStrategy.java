package me.buhuan.design_pattern.strategy;

import java.util.Random;

/**
 * Created by hbh on 2017/2/2.
 */
public class WinningStrategy implements Strategy{

    private Random random;
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
