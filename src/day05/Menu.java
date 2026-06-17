package day05;
import java.util.Scanner;
public class Menu {

    public void start() {
        Scanner input = new Scanner(System.in);
        char choice;
        double number;
        int option;
        do {
            System.out.println("-----This is the Menu-----");
            System.out.println("a. Temperature conversions");
            System.out.println("b. Weight conversions");
            System.out.println("c. Length conversions");
            System.out.println("d. Exit");
            System.out.println("Enter your choice: ");
            choice = input.next().charAt(0);
            if (choice == 'd' || choice == 'D') {
                System.out.println("Good bye!");
                input.close();
                break;
            }
                else {
                switch (choice) {
                    case 'a' -> {
                        System.out.println("1. If you want to convert from C to F");
                        System.out.println("2. If you want to convert from F to C");
                        option = input.nextInt();
                        if(option == 1) {
                            System.out.println("Enter the degree in C");
                            number = input.nextDouble();
                            System.out.println("The degree in C will convert to " + Convertor.celsiusToFahrenheit(number) + " in F");
                        } else if (option == 2) {
                            System.out.println("Enter the degree in F");
                            number = input.nextDouble();
                            System.out.println("The degree in F will convert to " + Convertor.fahrenheitToCelsius(number) + " in C");
                        } else {
                            System.out.println("Error: invalid option!");
                        }
                    }
                    case 'b' -> {
                        System.out.println("1. If you want to convert from KG to LB");
                        System.out.println("2. If you want to convert from LB to KG");
                        option = input.nextInt();
                        if(option == 1) {
                            System.out.println("Enter the weight in KG");
                            number = input.nextDouble();
                            System.out.println("The weight in KG will convert to " + Convertor.kgToPounds(number) + " in LB");
                        } else if (option == 2) {
                            System.out.println("Enter the weight in LB");
                            number = input.nextDouble();
                            System.out.println("The weight in LB will convert to " + Convertor.poundsToKg(number) + " in KG");
                        } else {
                            System.out.println("Error: invalid option!");
                        }
                            }
                    case 'c' -> {
                        System.out.println("1. If you want to convert from cm to Inches");
                        System.out.println("2. If you want to convert from Inches to cm");
                        option = input.nextInt();
                        if(option == 1) {
                            System.out.println("Enter the length in cm");
                            number = input.nextDouble();
                            System.out.println("The length in cm will convert to " + Convertor.cmToInches(number) + " in Inches");
                        } else if (option == 2) {
                            System.out.println("Enter the length in Inches");
                            number = input.nextDouble();
                            System.out.println("The length in Inches will convert to " + Convertor.inchesToCm(number) + " in cm");
                        } else {
                            System.out.println("Error: invalid option!");
                        }
                    }
                    default -> {
                        System.out.println("Error: Choice Invalid!");
                        System.out.println("Try Again!");
                    }
                }
            }
        } while (true);
    }
}
