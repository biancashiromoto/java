import utils.Utils;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		try {
			Scanner scanner = new Scanner(System.in);

			System.out.println("""
				_________________________________
				Hello world!""");
			Thread.sleep(500);
			System.out.println("""
				_________________________________
				This is a BMI calculator""");
			Thread.sleep(500);
			System.out.println("""
				_________________________________
				You will be required to type your height and weight.
				The values must be typed using a comma to separate decimals.""");
			Thread.sleep(500);
			System.out.println("""
				_________________________________
				For example, a valid input for weight would be '60,7'.""");
			Thread.sleep(500);
			System.out.println("""
				_________________________________
				Type 'y' and press enter to continue or press any key to leave.""");

			String response = scanner.nextLine();
			String y = "y";

			if (response.toLowerCase().equals(y)) {
				double weight = Utils.getInput("""
					_________________________________
					Enter your body weight:\s""");
				double height = Utils.getInput("""
					_________________________________
					Enter your height:\s""");

				double bmi = Utils.calculateBMI(weight, height);
				System.out.printf("""
					_________________________________
					Your BMI is: %2.2f%n""", bmi);
			} else {
				scanner.close();
			}
		} catch (InterruptedException error) {
//			error.printStackTrace();
		}
	}
}
