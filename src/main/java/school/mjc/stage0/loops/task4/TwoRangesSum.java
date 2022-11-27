package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int skpd = 0;
        if(numberToSkip>lastInRow){
            System.out.println("number to skip is bugger then the last");
            skpd+=1;
        }
        else if (lastInRow<0){
            System.out.println("last number in row is negative");
            skpd+=1;
        }
        System.out.println(skpd);


    }
}
