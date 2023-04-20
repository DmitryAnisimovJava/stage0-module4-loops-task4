package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
    	if ((toBreakWith >= numberToGoUntil && toBreakWith > 0) || 
    			(toBreakWith <= numberToGoUntil && toBreakWith < 0)) {
			System.out.println("iterating till the end");
			for(int counter = 1; counter <= numberToGoUntil; counter++) {
				System.out.println(counter);
			}
		} else {
			for(int counter = 1; counter <= numberToGoUntil; counter++) {
				if (counter > toBreakWith) {
					break;
				}
				System.out.println(counter);
			}
		}
    }
}
