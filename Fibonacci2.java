package Fibonacci;

public class Fibonacci2 {
	
	public static void main(String[] args) {
		int count=10;
		System.out.println("The Fibonacci Series is as follows:");
		series s = new series();
		System.out.print(s.n1+" "+s.n2);
		s.printSeries(count-2);
	}

}
