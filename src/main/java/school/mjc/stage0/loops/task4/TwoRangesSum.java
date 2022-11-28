package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int counted = 0;
        int skipCounter = 0;
        int counter =1;
        do {

            if (numberToSkip > lastInRow) {
                System.out.println("number to skip is bugger then the last");
                break;
            } else if (lastInRow < 0) {
                System.out.println("last number in row is negative");
                break;
            }


            if (counter%numberToSkip==0) {
                skipCounter += counter;
            } else {
                counted+=counter;

            }
            counter++;
        } while (counter < lastInRow);
        System.out.println("skipped sum is " + skipCounter);
        System.out.println("counted sum is " + counted);




    }

    public static void main(String[] args) {
        TwoRangesSum trs = new TwoRangesSum();
        trs.printSumOfTwoRanges(3,10);
    }
}
