package day05;

public class Convertor {

    // 1. Temperature conversions
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    // 2. Weight conversions
    public static double kgToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double poundsToKg(double pounds) {
        return pounds / 2.20462;
    }

    // 3. Length conversions
    public static double cmToInches(double cm) {
        return cm / 2.54;
    }

    public static double inchesToCm(double inches) {
        return inches * 2.54;
    }
}

