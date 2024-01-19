package logicalCodes;

public class Minimum_Coins_for_Change {

	public static void main(String[] args) {
		
		int amount = 23;
		int remain = amount, coin5 = 0, coin2 = 0, coin1 = 0;
		while (remain > 0) {
			if(remain > 5) {
				coin5++;
				remain = remain - 5;
			}
			else if(remain > 2) {
				coin2++;
				remain = remain -2;
			}
			else {
				coin1++;
				remain = remain -1;
			}
		}
		System.out.println("Amount: " + amount);
		System.out.println("Rs5 Coins: " + coin5);
		System.out.println("Rs2 Coins: " + coin2);
		System.out.println("Rs1 Coins: " + coin1);
		System.out.println("Total Coins: " + (coin5+coin2+coin1));
	}

}
