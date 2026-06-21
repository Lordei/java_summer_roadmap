package day01;
import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static double number1, number2;
    public static void main(String[] args) {
        runcalculator();
        printSeparator();
        checkEvenOdd();
        printSeparator();
        printto100();
        printSeparator();
        printsumtoN();
        printSeparator();
        printisEven();
        printSeparator();
        printmaxOfTwo();
        printSeparator();
        System.out.println("thank you for using my programs!");
        System.out.println("Goodbye! ^_^");

    } //method main

    public static boolean isEven(double number1) {
    return (int )(number1) % 2 == 0;
}
    public static void printisEven() {
    System.out.println("This is a program to check if the number is even or not but the catch we will do it in Methods!");
    System.out.println("Enter the number:");
    number1 = scanner.nextInt();
    System.out.println("The status of the number is: " + isEven(number1));
}
    public static double maxOfTwo(double number1, double number2) {
    if (number1 > number2)
        return number1;
    return number2;
}
    public static void printmaxOfTwo() {
        System.out.println("This is a program to find the maximum of two numbers.");
        System.out.println("Enter the first number:");
        number1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        number2 = scanner.nextDouble();
        double max = maxOfTwo(number1, number2);
            System.out.println("The maximum of the two numbers is " + max);
    }
    public static void printSeparator() {
        System.out.println("-*-*-*-*-*-*-*-*-*-*-**-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }
    public static void runcalculator() {
        System.out.println("Hello, I'm Ibrahim!");
        System.out.println("I'm a new student and i will do the day01 task! ^_^");
        System.out.println("Please enter the first number:");
        number1 = scanner.nextDouble();
        System.out.println("enter the operator you want to use (+, -, *, /, %)");
        char operator = scanner.next().charAt(0);
        System.out.println("Please enter the second number:");
        number2 = scanner.nextDouble();
        switch (operator) {
            case '+' -> System.out.println(number1 + number2);
            case '-' -> System.out.println(number1 - number2);
            case '*' -> System.out.println(number1 * number2);
            case '/' -> { if (number2 == 0)
                System.out.println("Error: Division by zero!");
            else
                System.out.println(number1 / number2); }
            case '%' -> { if (number2 == 0)
                System.out.println("Error: Division by zero!");
            else
                System.out.println((int) (number1) % (int) (number2)); }
            default -> System.out.println("Invalid operator!");
        } //switch
    }
    public static void checkEvenOdd() {
        System.out.println("This is a program to check if a number is even or odd.");
        System.out.println("Enter a number:");
        int checknumber = scanner.nextInt();
        if (checknumber % 2 == 0) {
            System.out.println(checknumber + " is even.");
        } else {
            System.out.println(checknumber + " is odd.");
        }
    }
    public static void printto100() {
        System.out.println("This is a program to print the numbers from 1 to 100.");
        System.out.println("if you want to enter the program, just Say yes");
        String input = scanner.next();
        if (input.equalsIgnoreCase("yes")) {
            for (int i = 1; i <= 100; i++) {
                System.out.println(i);
            }
        }

    }
    public static void printsumtoN() {
        System.out.println("This is a program to calculate the sum of the numbers from 1 to n.");
        System.out.println("Enter the number n:");
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("The sum of the numbers from 1 to " + N + " is " + sum);
    }

} //class Main!
