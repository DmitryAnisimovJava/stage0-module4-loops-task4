package school.mjc.stage0.loops.task4;


public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
    	if (numberToSkip > lastInRow) {
			System.out.println("number to skip is bigger then the last");
		} else if (lastInRow < 0) {
			System.out.println("last number in row is negative");
		} else if (lastInRow >= 0) {
			int sum1 = 0, sum2 = 0;
			for(int counter = 0; counter <= numberToSkip; counter++) {
				sum1 = sum1 + counter;
			}
			System.out.println("skipped sum is " + sum1);
			for(int counter = ++numberToSkip; counter <= lastInRow; counter++) {
				sum2 = sum2 + counter;
			}
			System.out.println("counted sum is " + sum2);
		}
    }
}
