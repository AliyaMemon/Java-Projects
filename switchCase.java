import java.util.*;
public class switchCase {
	public static void main(String[] args) {
		int choice;
		System.out.println("Choose one from the following Programming Languages:\n1. Java\n2. Python\n3. Ruby\n4. C\n5. C++\nEnter your choice:");
		Scanner s = new Scanner(System.in);
		choice = s.nextInt();
		switch(choice) {
			case 1 : System.out.println("You chose Java Programming Language.");
					break;
			case 2 : System.out.println("You chose Python Programming Language.");
					break;
			case 3 : System.out.println("You chose Ruby Programming Language.");
					break;
			case 4 : System.out.println("You chose C Programming Language.");
					break;
			case 5 : System.out.println("You chose C++ Programming Language.");
					break;
			default : System.out.println("The choice is invalid");
  	}
	}
}
