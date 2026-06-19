package day07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class CollectionsPractice {
    public static void main(String[] args) {
        //-------------------ArrayList-----------------
        ArrayList<String> names = new ArrayList<>();
        names.add("ibrahim");
        names.add("Lord");
        names.add("Sara");
        System.out.println("the size of the list is " + names.size());
        names.remove("Lord");
        for (String name : names) {
            System.out.println(name);
        }
        //---------HashSet-----------
        HashSet<String> uniqueEmails = new HashSet<>();
        uniqueEmails.add("a@gmail.com");
        uniqueEmails.add("b@gmail.com");
        uniqueEmails.add("c@gmail.com");
        uniqueEmails.add("a@gmail.com");
        System.out.println("the size of the unique Emails is " + uniqueEmails.size());
        for (String email : uniqueEmails) {
            System.out.println(email);
        }

        //----------------HashMap-----------------
        String text = "java is fun and java is hard";
        countWords(text);
    }
    public static void countWords(String text) {
        HashMap<String, Integer> wordMap = new HashMap<>();
        String[] words = text.split(" ");

        for (String word : words) {
            if (wordMap.containsKey(word)) {
                int currentCount = wordMap.get(word);
                wordMap.put(word, currentCount + 1);
            } else {
                wordMap.put(word, 1);
            }
        }
        System.out.println(wordMap);
    }
}
