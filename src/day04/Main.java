package day04;

public class Main {
    public static void main(String[] args) {
        int[] myNumbers = {4, 2, 9, 1, 5};
        String myText = "radar";
        String myname = "ibrahim";

        System.out.println("Min: " + StringHelper.findMin(myNumbers));
        System.out.println("the reversed : " + StringHelper.reverseString(myText));
        System.out.println("isPalindrome? : " + StringHelper.isPalindrome(myText));
        System.out.println("this word : " + myText + " has this number of vowels :" + StringHelper.countVowels(myText));
        System.out.println("the clean reverse of my name is :" + StringHelper.cleanAndReverse(myname));
    }
}
