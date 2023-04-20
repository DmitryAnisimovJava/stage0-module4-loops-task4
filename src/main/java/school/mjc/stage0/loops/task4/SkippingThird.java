package school.mjc.stage0.loops.task4;


public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
    	int counter = 1;
    	if (lastPrinted >= 1) {
    		for (int numbers = 1; numbers <= lastPrinted; numbers++) {
        		if (counter == 3) {
    				counter = 1;
    				continue;
    			}
        		System.out.println(numbers);
        		counter++;
        	}
		}
    }
}
