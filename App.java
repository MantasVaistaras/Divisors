public class App {

	public static void main(String[] args) {
		
		int n = (int) 1E5;
		Divisors divisors = new Divisors(n);
		
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				divisors.findMostDivisors();
			}
			
		});
		t.start();
		//interrupts the thread if it takes more than 5s to process
		int x = 4000;
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.interrupt();
	}

}
