package logicalCodes;

public class Buy_and_Sell_Stocks {

	public static void main(String[] args) {
		
		int[] stocks = {7,1,4,6,5};
		int minStock = stocks[0];
		int maxDiff = 0;
		for(int i=1; i<stocks.length; i++) {
			maxDiff = Math.max(maxDiff, stocks[i] - minStock);
			minStock = Math.min(minStock, stocks[i]);	
		}
		System.out.println(maxDiff);
	}

}
