package array;

import java.awt.print.Printable;

public class MissingNumberInArray {

	public static void main(String[] args) {
		/*printMissingNumber(new int[]{1, 2, 3, 4, 6}, 6); 
		printMissingNumber(new int[]{1, 2, 3, 4, 6}, 6); 
		printMissingNumber(new int[]{1, 2, 3, 4, 6,7,8}, 8); 
		printMissingNumber(new int[]{1, 2, 3, 4, 6}, 6); */
		printMissingNumber(new int[]{3, 4}, 4);

	}

	private static void printMissingNumber(int[] numbers, int totalCount) {
		int expectedSum = (totalCount * (totalCount + 1)) / 2;
		int actualSum = 0;
		for (int i : numbers) {
			actualSum += i;
		}
		
		int nu =expectedSum - actualSum;
		System.out.println("Missing number is " + nu);
	}

}
