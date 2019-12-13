
public class Divisors {
	
	private int n;
	private int integer;
	private int count;
	
	public Divisors(int n) {
		this.n = n;
	}

	public void findMostDivisors() {
		// A method which finds which integer between 1 and n has the largest number of divisors, and how many divisors does it have
		int count;
		int max = 0;
		int number = 1;
		
		for (int i = 1; i <= n; i++) {
			if(Thread.currentThread().isInterrupted()) {
				System.out.println("The thread takes too long so it has been interrupted!");
				System.out.println("So far we have found that the integer " + number + " has the most divisors in the range between 1 and "
						+ i + " => " + max + " divisors");
				break;
			}
			count = 0;
			for (int j = 1; j <= i; j++) {
				
				if(i%j == 0) {
					count++;
				}
				if(count > max) {
					max = count;
					number = i;
				}
			}
		}
		this.integer = number;
		this.count = max;
		if(!Thread.currentThread().isInterrupted()) {
			System.out.println(getInteger() + " is the integer between 1 and " + n + " which has the most divisors => " + getCount() + " divisors");
		}
		

	}
	
	public int getInteger() {
		return this.integer;
	}
	
	public int getCount() {
		return this.count;
	}
	

}
