package kz.issakov.arman;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MontyHallProblem mhp = new MontyHallProblem();
        System.out.println(mhp.startMontyHoll(mhp.shuffleArray(), 10000));
    }
}