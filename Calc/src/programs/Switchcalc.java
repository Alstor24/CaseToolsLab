package programs;
import java.util.Scanner;


public class Switchcalc {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		
		System.out.println("provide input where 1 is add, 2 is subt, 3 is mult, 4 is divide");
	    int ans = scanner.nextInt();
		
		extracted(scanner, ans);
		scanner.close();
		
		
		
		

	}

	public static void extracted(Scanner scanner, int ans) {
		switch (ans) {
		
		case 1: System.out.println("Addition, input 2 numbers ");
		int one = scanner.nextInt();
		int two = scanner.nextInt();
		int add = one + two;
		System.out.println(add);
		break;
		
		case 2: System.out.println("Subtraction, input 2 numbers");
		int onee = scanner.nextInt();
		int twoo = scanner.nextInt();
		int sub = onee -twoo;
		System.out.println(sub);
		break;
		
		case 3: System.out.println("Multiply , input 2 numbers");
		int on = scanner.nextInt();
		int tw = scanner.nextInt();
		int mul = on * tw;
		System.out.println(mul);
		break;
		
		case 4: System.out.println("Division, input 2 numbers");
		int no = scanner.nextInt();
		int tww = scanner.nextInt();
		int div = no / tww;
		System.out.println(div);
		break;
		}
	}

}
