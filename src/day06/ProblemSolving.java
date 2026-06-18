package day06;

public class ProblemSolving {
    public static void main(String[] args) {
        int year = 2026;
        int number = 1234;
        double radius = 5.0;
        System.out.println("Is year " + year + " a leap year?: " + leapYear(year));
        System.out.println("Area of circle with radius " + radius + " is " + circleArea(radius));
        System.out.println("Sum of digits of " + number + " : " + sumOfnumbers(number));
    }

    public static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static int sumOfnumbers (int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
