package me.buhuan.design_pattern.strategy;

/**
 * Created by hbh on 2017/2/2.
 */
public class Main {

    public static void main(String[] args) {
            if (args.length != 2) {
                System.exit(0);
            }

            int seed1 = Integer.parseInt(args[0]);
            int seed2 = Integer.parseInt(args[1]);

            Player player1 = new Player("", new WinningStrategy(seed1));
            Player player2 = new Player("", new ProbStrategy(seed2));
            for (int i = 0; i < 10000; i++) {
                Hand nextHand1 = player1.nextHand();
                Hand nextHand2 = player2.nextHand();
                if (nextHand1.isStrongerThan(nextHand2)) {
                    System.out.println("Winner:" + player1);
                    player1.win();
                    player2.lose();
                } else if (nextHand2.isStrongerThan(nextHand1)) {
                    System.out.println("WInner:" + player2);
                    player2.win();
                    player1.lose();
                } else {
                    System.out.println("Even");
                    player1.even();
                    player2.even();
                }
            }
            System.out.println("Total:");
            System.out.println(player1.toString());
            System.out.println(player2.toString());
    }

}
