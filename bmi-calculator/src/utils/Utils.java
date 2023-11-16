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
}
