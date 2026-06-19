package day07;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


public class CollectionsProblems {
    public static void main(String[] args) {
        //--------Problem-solving 1---------
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5, 1, 6));
        System.out.println("the array before removing duplicates: " + numbers);
        removeDuplicates(numbers);
        PROremoveDuplicates(numbers);
        //--------Problem-solving 2---------
        String text = "programming";
        countCharacters(text);
        //--------Problem-solving 3---------
        String word1 = "listen";
        String word2 = "silent";
        anagram(word1, word2);
        //--------Problem-solving 4---------
        int[] numbers1 = {2, 5, 3, 1};
        thefirstappearing(numbers1);
    }

    public static void removeDuplicates(ArrayList<Integer> list) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for ( int number : list) {
            uniqueNumbers.add(number);
        }
        System.out.println("the array after removing duplicates: " + uniqueNumbers);
    }
    public static void PROremoveDuplicates(ArrayList<Integer> list) {
        HashSet<Integer> uniqueNumbers = new HashSet<>(list);
        System.out.println("the array after removing duplicates with PRO's way: " + uniqueNumbers);
    }
    public static void countCharacters(String text) {
        HashMap<Character, Integer> charMap = new HashMap<>(); // create a HashMap
        char[] characters = text.toCharArray(); // convert String to char[]
        for (char character : characters) {
            if (charMap.containsKey(character)) { // check if the character is already in the HashMap
                int currentCount = charMap.get(character); // get the current count
                charMap.put(character, currentCount + 1); // increment the count if the character is already in the HashMap
            }else {
                charMap.put(character, 1); // if the character is not in the HashMap, add it with a count of 1
            }
        }
        System.out.println("the character count: " + charMap);
    }
    public static void anagram(String word1, String word2) {
        // 1. check if the lengths are equal
        if (word1.length() != word2.length()) {
            System.out.println(word1 + " and " + word2 + " are NOT anagrams.");
            return; // to end the method if the lengths are not equal
        }
        // 2. sort the characters of both words
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        // 3. sort the characters of both words
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        // 4. check if the sorted characters are equal
        if (Arrays.equals(chars1, chars2)) {
            System.out.println(word1 + " is an anagram of " + word2);
        } else {
            System.out.println(word1 + " and " + word2 + " are NOT anagrams!");
        }
        }
    public static void thefirstappearing(int[] numbers) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (int number : numbers) {
            if (!uniqueNumbers.add(number)) { // check if the number is already in the HashSet, if yes, it will be (!false), if not, it will be (!true)
                System.out.println("the first appearing number is: " + number); //will print the first repeated appearing number
                return; // to end the method if we find the first repeated number
            }
        }
        System.out.println("there is no first appearing number"); //if the loop finishes without finding any repeated number
    }
    }
