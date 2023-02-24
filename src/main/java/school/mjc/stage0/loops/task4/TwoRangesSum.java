package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {

        for (int i = 0; i < lastInRow; i++) {
            if (i == numberToSkip) {
                continue;
            }
            System.out.println(i+" ");
        }
    }
}
