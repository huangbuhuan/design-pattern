package me.buhuan.design_pattern.strategy;

/**
 * Created by hbh on 2017/2/2.
 */
public class Hand {
    public static final int HAND_VALUE_GUU = 0;
    public static final int HAND_VALUE_CHO = 1;
    public static final int HAND_VALUE_PAA = 2;

    public static Hand[] hands = {
            new Hand(HAND_VALUE_CHO),
            new Hand(HAND_VALUE_GUU),
            new Hand(HAND_VALUE_PAA)
    };

    private static final String[] name = {
            "石头", "剪刀", "步"
    };
    private int handValue;

    public Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
        return hands[handValue];
    }

    public boolean isStrongerThan(Hand hand) {
        return flight(hand) == 1;
    }

    public boolean isWeakThan(Hand hand) {
        return flight(hand) == -1;
    }

    private int flight(Hand hand) {
        if (this == hand) {
            return 0;
        } else if ((this.handValue + 1) % 3 == hand.handValue ){
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        return name[handValue];
    }
}
