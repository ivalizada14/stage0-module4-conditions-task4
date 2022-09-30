package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int greatest = first;
        greatest =greatest<second?second:greatest;
        greatest =greatest<third?third:greatest;
        System.out.println(greatest);
    }
}
