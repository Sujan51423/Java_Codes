package arrayCodes;

public class Second_Largest_in_Array {

	public static void main(String[] args) {
		int[] numbers = {1,4,2,6,2,4,12,5,11};
		int seclargest = 0, largest = numbers[0];
		
		// Logic without swapping
		for(int itr1 = 1; itr1 < numbers.length; itr1++) {
			if(numbers[itr1] > largest) {
				seclargest = largest;
				largest = numbers[itr1];
			}
			else if(numbers[itr1] > seclargest && numbers[itr1] != largest) {
				seclargest = numbers[itr1];
			}
		}
		System.out.println("Second Largest: " + seclargest);
		
		// Logic with swapping
		for(int itr1 = 0; itr1 < numbers.length; itr1++) {
			int temp;
			for (int itr2 = itr1; itr2 < numbers.length; itr2++) {
				if (numbers[itr1] < numbers[itr2]) {
					temp = numbers[itr1];
					numbers[itr1] = numbers[itr2];
					numbers[itr2] = temp;
				}
			}
		}
		System.out.println("2nd Largest: " + numbers[1]);
	}

}
