package day02;
import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello, I'm Ibrahim!");
        System.out.println("I'm a new student and i will do the day02 task! ^_^");
        menu();


    } // نهاية main

    // ---------------- الدوال (Methods) ----------------

    public static void menu() {
        int choice;
        int number;
        do {
            System.out.println("\n--- Day 2 CLI Menu ---");
            System.out.println("1. Check Positive or Negative"); // دالة isPositive
            System.out.println("2. Get Grade Letter"); // دالة gradeLetter
            System.out.println("3. Sum from 1 to N"); // دالة sumFromOneToN
            System.out.println("4. Calculate Factorial"); // دالة factorial
            System.out.println("5. Check Prime"); // دالة isPrime
            System.out.println("6. Print Multiplication Table"); // مسألة جدول الضرب
            System.out.println("7. Reverse a Number"); // مسألة عكس الرقم
            System.out.println("8. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the number you want to check:");
                    number = scanner.nextInt();
                    System.out.println(number + " isPositive? : " + isPositive(number));
                }
                case 2 -> {
                    System.out.println("Enter the grade you want to check:");
                    number = scanner.nextInt();
                    System.out.println(number + " will give you the letter grade: " + gradeLetter(number));
                }
                case 3 -> {
                    System.out.println("Enter the number you want to sum from 1 to:");
                    number = scanner.nextInt();
                    System.out.println("The sum of the numbers from 1 to " + number + " is: " + sumFromOneToN(number));
                }
                case 4 -> {
                    System.out.println("Enter the number you want to calculate the factorial of:");
                    number = scanner.nextInt();
                    System.out.println("The factorial of " + number + " is: " + factorial(number));
                }
                case 5 -> {
                    System.out.println("Enter the number you want to check:");
                    number = scanner.nextInt();
                    System.out.println(number + " isPrime? : " + isPrime(number));
                }
                case 6 -> {
                    System.out.println("Enter the number you want to print the multiplication table of:");
                    number = scanner.nextInt();
                    printMultiplicationTable(number);
                }
                case 7 -> {
                    System.out.println("Enter the number you want to reverse:");
                    number = scanner.nextInt();
                    System.out.println("The reverse of " + number + " is: " + reverseNumber(number));
                }
                case 8 -> System.out.println("Exiting... Goodbye!");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 8);

    }

    public static boolean isPositive(int number) {
        return number > 0;
        }

        public static String gradeLetter (int grade){
            if (grade >= 90)
                return "A";
            else if (grade >= 80)
                return "B";
            else if (grade >= 70)
                return "C";
            else if (grade >= 60)
                return "D";
            else
                return "F";
        }

        public static int sumFromOneToN (int n){
            int sum = 0;
            for (int i = 0; i <= n; i++) {
                sum += i;
            }
            return sum;
        }

        public static int factorial ( int n){
            int factorial = 1;
            for(int i = 1; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }

        public static boolean isPrime ( int n){
            if (n <= 1) {
                return false;
            }

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static void printMultiplicationTable (int n){
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " x " + n + " = " + i * n + "  ");
            }
        }

    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = (reversed * 10) + digit;
            number = number / 10;
        }
        return reversed;
    }
}
