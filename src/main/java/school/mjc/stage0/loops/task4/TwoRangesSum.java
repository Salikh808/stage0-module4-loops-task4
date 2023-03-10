package school.mjc.stage0.loops.task4;

public class TwoRangesSum {

    public static void main(String[] args) {

        printSumOfTwoRanges(0,3);
    }
    public static void printSumOfTwoRanges(int numberToSkip, int lastInRow) {

        int skippedSum = 0;
        int restSum = 0;
        if (numberToSkip > lastInRow && lastInRow > 0) {
            System.out.println("number to skip is bugger then the last");
        } else if (lastInRow < 0){
            System.out.println("last number in row is negative");
        } else

        for (int i = 0; i <= lastInRow; i++) {
            if (i <= numberToSkip) {
                skippedSum += i;
            } else {
                restSum += i;
            }
        }
        System.out.println("skipped sum is " + skippedSum);
        System.out.println("counted sum is " + restSum);

    }
}





