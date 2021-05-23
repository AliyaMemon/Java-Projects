import Conversion.*;
import java.util.*;
public class task3 {
	public static void main(String[] args) {
		System.out.println("Enter the minute count to be converted into years and days:\t");
		Scanner min = new Scanner(System.in);
		int m = min.nextInt();
		convert obj = new convert();
		obj.calculate(m);
	}
}
