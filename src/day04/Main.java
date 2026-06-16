package day04;

public class Main {
    public static void main(String[] args) {
        int[] myNumbers = {4, 2, 9, 1, 5};
        String myText = "radar";


        System.out.println("Min: " + findMin(myNumbers));
        System.out.println("the reversed : " + reverseString(myText));
        System.out.println("isPalindrome? : " + isPalindrome(myText));
        System.out.println("this word : " + myText + " has this number of vowels :" + countVowels(myText));
    }

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
}
