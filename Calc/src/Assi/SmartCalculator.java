package Assi;

import java.util.Scanner;

public class SmartCalculator {

	private static Scanner scanner = new Scanner(System.in);

	private double principal;
	private double rate;
	private int time;
	private double[] numbers;
	private double totalMarks;
	private double marksObtained;

	public SmartCalculator() {
		this.principal = 0.0;
		this.rate = 0.0;
		this.time = 0;
		this.numbers = null;
		this.totalMarks = 0.0;
		this.marksObtained = 0.0;
	}

	public SmartCalculator(double principal, double rate, int time, double[] numbers, double totalMarks,
			double marksObtained) {
		this.principal = principal;
		this.rate = rate;
		this.time = time;
		this.numbers = numbers;
		this.totalMarks = totalMarks;
		this.marksObtained = marksObtained;
	}



	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public double[] getNumbers() {
		return numbers;
	}

	public void setNumbers(double[] numbers) {
		this.numbers = numbers;
	}

	public double getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}

	public double getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(double marksObtained) {
		this.marksObtained = marksObtained;
	}

	public double calculateSimpleInterest(double principal, double rate, int time) {
		setPrincipal(principal);
		setRate(rate);
		setTime(time);
		return (principal * rate * time) / 100;
	}

	public double calculateCompoundInterest(double principal, double rate, int time) {
		setPrincipal(principal);
		setRate(rate);
		setTime(time);
		return principal * Math.pow(1 + rate / 100, time) - principal;
	}

	public double calculateMean(double[] numbers) {
		setNumbers(numbers);
		double sum = 0;
		for (double num : numbers) {
			sum += num;
		}
		return sum / numbers.length;
	}

	public long calculateFactorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
		}
		long factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}

	public double calculatePercentage(double totalMarks, double marksObtained) {
		setTotalMarks(totalMarks);
		setMarksObtained(marksObtained);
		if (totalMarks <= 0) {
			throw new IllegalArgumentException("Total marks cannot be zero or negative.");
		}
		return (marksObtained / totalMarks) * 100;
	}

	public static void main(String[] args) {
		SmartCalculator calculator = new SmartCalculator();

		int choice;
		do {
			System.out.println("\nWelcome to Smart Calculator\n");
			System.out.println("1. Simple Interest");
			System.out.println("2. Compound Interest");
			System.out.println("3. Mean of Numbers");
			System.out.println("4. Factorial");
			System.out.println("5. Percentage");
			System.out.println("6. Exit");
			System.out.print("\nEnter your choice: ");

			try {
				choice = scanner.nextInt();

				switch (choice) {
				case 1:
					System.out.print("Enter principal, rate, and time: ");
					double simpleInterest = calculator.calculateSimpleInterest(scanner.nextDouble(),
							scanner.nextDouble(), scanner.nextInt());
					System.out.println("Simple Interest: " + simpleInterest);
					break;
				case 2:
					System.out.print("Enter principal, rate, and time: ");
					double compoundInterest = calculator.calculateCompoundInterest(scanner.nextDouble(),
							scanner.nextDouble(), scanner.nextInt());
					System.out.println("Compound Interest: " + compoundInterest);
					break;
				case 3:
					System.out.print("Enter the number of elements: ");
					int count = scanner.nextInt();
					double[] numbers = new double[count];
					System.out.println("Enter the elements:");
					for (int i = 0; i < count; i++) {
						System.out.print("Element " + (i + 1) + ": ");
						numbers[i] = scanner.nextDouble();
					}
					double mean = calculator.calculateMean(numbers);
					System.out.println("Mean of Numbers: " + mean);
					break;
				case 4:
					System.out.print("Enter a number: ");
					long factorial = calculator.calculateFactorial(scanner.nextInt());
					System.out.println("Factorial: " + factorial);
					break;
				case 5:
					System.out.print("Enter total marks and marks obtained: ");
					double percentage = calculator.calculatePercentage(scanner.nextDouble(), scanner.nextDouble());
					System.out.println("Percentage: " + percentage + "%");
					break;
				case 6:
					System.out.println("Exiting Smart Calculator.");
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
				}
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
				scanner.nextLine();
				choice = -1;
			}

		} while (choice != 6);

		scanner.close();
	}
}