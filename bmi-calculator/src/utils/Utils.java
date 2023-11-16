package utils;

import java.util.Scanner;

public class Utils {
	public static double getInput(String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);
		return scanner.nextDouble();
	}

	public static double calculateBMI(double weight, double height) {
		double height2 = Math.pow(height, 2);

		return weight / height2;
	}

	public static String checkCategory(double bmi) {
		int bmiCategory = (int) bmi / 5;
		String category;

		switch (bmiCategory) {
			case 0:
				category = "Underweight";
				break;
			case 1:
				category = "Normal weight";
				break;
			case 2:
				category = "Overweight";
				break;
			default:
				category = "Obese";
				break;
		}
		return category;
	}
}
