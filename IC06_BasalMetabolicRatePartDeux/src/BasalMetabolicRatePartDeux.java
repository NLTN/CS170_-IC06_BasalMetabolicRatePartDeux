/*
    Nguyen, Nguyen
    CS A170
    02/26/2018

    IC06_BasalMetabolicRatePartDeux
*/
import java.text.DecimalFormat;
import java.util.Scanner;

public class BasalMetabolicRatePartDeux {

	public static final int CHOCOLATE_BAR_CALORIES = 230;

	public static void main(String[] args) {
		double weight, height, age, bmr, bars;
		String gender;
		int activity;

		// Use scanner for user input
		Scanner consoleScanner = new Scanner(System.in);
		DecimalFormat noDP = new DecimalFormat("0");
		DecimalFormat oneDP = new DecimalFormat("0.0");

		// User input
		System.out.print("Please enter your weight (lb): ");
		weight = consoleScanner.nextDouble();
		System.out.print("Please enter your height (in): ");
		height = consoleScanner.nextDouble();
		System.out.print("Please enter your age: ");
		age = consoleScanner.nextDouble();
		
		System.out.println("Please enter Male or Female:");
		gender = consoleScanner.next().toLowerCase();
		
		System.out.println("Please enter activity factor (1-4):");
		System.out.println("1. Sedentary (not active)\n2. Somewhat active (exercise occasionally)");
		System.out.println("3. Active (exercise 3-4 times per week)\n4. Highly active (exercise everyday)");
		activity = consoleScanner.nextInt();

		consoleScanner.close(); // CLOSE THE SCANNER

		// BMR calculation with Harris-Benedict equation
		if (gender.contains("f")) {
			bmr = 655 + (4.35 * weight) + (4.7 * height) - (4.7 * age);
		} else {
			bmr = 66 + (6.23 * weight) + (12.7 * height) - (6.8 * age);
		}

		// Activity Factor
		if (activity == 1)
			bmr *= 1.2;
		else if (activity == 2)
			bmr *= 1.3;
		else if (activity == 3)
			bmr *= 1.4;
		else
			bmr *= 1.5;

		// Number of chocolate bars needed to maintain BMR
		bars = bmr / CHOCOLATE_BAR_CALORIES;

		// Display output to the user
		System.out.println("As a " + gender + " your BMR x Activity Factor is " + noDP.format(bmr) + " and you need to eat " + oneDP.format(bars)
				+ " chocolate bars to maintain this amount of calories.");

	}
}
