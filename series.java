package Fibonacci;

public class series {
	int n1=0,n2=1,n3;
	void printSeries(int count) {
		if(count>0) {
			n3 = n1 + n2;
			System.out.print(" "+ n3);
			n1=n2;
			n2=n3;
			printSeries(count-1);
		}
	}
	
}