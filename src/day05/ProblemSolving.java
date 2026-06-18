package day05;

public class ProblemSolving {
    public static void main(String[] args) {
        int minute = 100;
        double Riyal = 150.50;
        minuteToHours(minute);
        riyalToDollar(Riyal);
        calculateBMI(80.30, 1.75);
    }
    public static void minuteToHours(int minute) {
        int hours = minute / 60;
        int minutes = minute % 60;
        System.out.println(hours + " hours and " + minutes + " minutes");
    }
    public static void riyalToDollar(double Riyal) {
        double Dollar = Riyal / 3.75;
        System.out.printf("This Riyals = %.2f ,Will give you this much in Dollars = %.2f %n",Riyal,Dollar);
    }
    public static void calculateBMI(double weightKg, double heightMeters) {
        double bmi = weightKg / (heightMeters * heightMeters);
        System.out.printf("Your BMI is : %.2f\n", bmi);
    }
}
