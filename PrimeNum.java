import java.util.Scanner;
public class PrimeNum {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num,flag=0;
		System.out.println("Enter a number:\t");
		num = read.nextInt();
		if(num==0 || num==1) {
			System.out.println(num+" is neither Prime nor Composite number");
		}
		for(int i = 2; i<num; i++) {
			if(num%i==0) {
				flag=1;
			}
		}
		if(flag==1) {
			System.out.println(num+" IS NOT a Prime Number");
		}
		else {
			System.out.println(num+" IS a Prime Number");
		}
	}
}
