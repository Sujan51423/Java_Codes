/**
 * 
 */
package logicalCodes;

/**
 * @author Sujan5
 *
 */
public class Odd_and_Even_using_Two_Threads {

	static int num; 
	int n = 1;

	void evenPrint() {
		synchronized (this) {
			while(n<num) {
				while(n%2 == 0) {
					try {
						wait();
					}
					catch (Exception e) {
						System.out.println(e);
					}
					System.out.println(n);
					n++;
					notify();
				}
			}
		}
	}
	
	void oddPrint() {
		synchronized (this) {
			while(n<num) {
				while(n%2 != 0) {
					try {
						wait();
					}
					catch (Exception e) {
						System.out.println(e);
					}
					System.out.println(n);
					n++;
					notify();
				}
			}
		}		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		num = 10;
		
		Odd_and_Even_using_Two_Threads od = new Odd_and_Even_using_Two_Threads();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				od.evenPrint();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				od.oddPrint();
			}
		});
		t1.start();
		t2.start();
	}
}
