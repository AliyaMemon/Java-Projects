package Conversion;

public class convert {
	public void calculate(int num) {
		int yr, day;
		yr = ((num / 60) / 24) / 365;
		day =((num / 60) / 24) % 365;
		System.out.println(num + " minutes converts into approximately "+ yr + " years and "+ day+ " days.");
	}
}
