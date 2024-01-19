package stringCodes;

public class NonRepeating_Char_in_String {

	public static void main(String[] args) {

		String sample = "abdacbns";
		System.out.println("Given String: " + sample);
		for (int itr = 0; itr < sample.length(); itr++) {
			int repeat = 0;
			for (int itr1 = 0; itr1 < sample.length(); itr1++) {
				if (sample.charAt(itr) == sample.charAt(itr1)) {
					repeat++;
				}
			}
			if (repeat == 1) {
				System.out.println("Non Repeative Character: " + sample.charAt(itr));
				// break; //Uncomment for first value only
			}
		}
	}
}
