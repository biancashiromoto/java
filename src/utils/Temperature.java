package utils;

public class Temperature {
    public static double celsiusToFahrenheit(double temp) {
        double result = (temp * 1.8) + 32;
        System.out.println(result);
        return result;
    }
}