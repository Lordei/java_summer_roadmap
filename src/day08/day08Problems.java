package day08;

import java.util.ArrayList;

public class day08Problems {
    public static void main(String[] args) {
        String text = "Hello World I'm the best programmer";
        System.out.println("Count words in \"" + text + "\" is " + countWords(text));
        System.out.println("Count lines in notes.txt is " + countLines("notes.txt"));
        System.out.println("Does the word \"the\" exist in \"" + text + "\"? Answer: " + containsWord(text, "the"));
    }
//todo: count words in a text
    public static int countWords(String text) {
            return text.split(" ").length;
    }
//todo: count lines in a file
    public static int countLines(String fileName) {
       return FileManager.readText(fileName).split("\n").length;
    }
//todo: is a word in a text?
    public static boolean containsWord(String text, String word) {
       return text.contains(word);
    }
}
