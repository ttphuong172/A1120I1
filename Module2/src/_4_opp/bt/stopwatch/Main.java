package _4_opp.bt.stopwatch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[1000000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random()*1000000);
        }
        StopWatch stopWatch = new StopWatch();
        Arrays.sort(numbers);
        stopWatch.stop();
        System.out.println("Milis: " + stopWatch.getElapsedTime());
    }
}
