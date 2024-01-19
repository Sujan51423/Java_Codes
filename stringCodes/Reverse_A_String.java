package stringCodes;

public class Reverse_A_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String normal = "abc";
		StringBuffer reversed = new StringBuffer(normal);
		for(int i = 0, j = normal.length()-1; i<normal.length();i++, j--) {
			reversed.append(normal.charAt(j));
		}
		System.out.println(reversed);
	}

}
