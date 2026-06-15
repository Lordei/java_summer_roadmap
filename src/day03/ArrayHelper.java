package day03;

public class ArrayHelper {

    public int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] > max)
                max = numbers[i];
        return max;
    }

    public double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum += numbers[i];
        return (double) (sum) / numbers.length;
    }

    public int countEvens(int[] numbers) {
        int counterEven = 0;
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] % 2 == 0)
                counterEven++;
        return counterEven;
    }
}


