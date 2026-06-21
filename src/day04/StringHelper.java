package day04;

public class StringHelper {
    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min)
                min = numbers[i];
        }
        return min;
    }

    public static String reverseString(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--)
            reversed += text.charAt(i);
        return reversed;
    }

    public static boolean isPalindrome(String text) {
        return text.equals(reverseString(text));
    }

    public static int countVowels(String text) {
        int counterVowels = 0;
        String lowertext = text.toLowerCase();
        for (int i = 0; i < lowertext.length(); i++) {
            char c = lowertext.charAt(i);
            if (c == 'a' || c ==  'i' || c ==  'o' || c ==  'u' || c ==  'e')
                counterVowels++;
        }
        return counterVowels;
    }

    //I re-made the reverse method just to practice more
    public static String cleanAndReverse(String text) {
        String cleantext = text.substring(1, text.length() - 1);
        String reversed = "";
        for (int i = cleantext.length() - 1; i >= 0; i--) {
            reversed += cleantext.charAt(i);
        }
        return reversed;
    }
}
