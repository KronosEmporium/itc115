class fibonacci {
	
	// fib function returns Fibonaaci number for given
	// value. If value is <=1, return the value
	static int fib(int n) {
		if (n <= 1) 
			return n;
		return fib(n-1) + fib(n-2);
	}
	
	// Main function, for loop iterates 12 times to
	// produce 12 Fibonacci numbers
	public static void main (String args[]) {
		for ( int i = 0; i < 12; i++ ) {
			System.out.println( fib(i) );
		}
	}
}
