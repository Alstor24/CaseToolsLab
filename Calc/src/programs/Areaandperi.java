package programs;
import java.util.Scanner;


public class Areaandperi {
	 static Scanner scanner= new Scanner(System.in);
	public static void main(String []args) {
		 System.out.println("Put radius");
		 double radius = scanner.nextInt();
		double area = 3.14*radius*radius;
         System.out.println(area);
		
		 circum(radius);
		 double anss = circum(radius);
		 System.out.println(anss);
	     
			 
		 }
	public static  double circum(double radius) {
		double circ = 2*3.14*radius;
		return circ;
	}

		 }

