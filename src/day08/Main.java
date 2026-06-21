package day08;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static final String FILE_NAME = "notes.txt";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Note> notes = new ArrayList<>();
        String savedText = FileManager.readText("FILE_NAME");
        if (!savedText.isEmpty()) {
            String[] lines = savedText.split("\n");
            for (String line : lines) {
                notes.add(FileManager.parseNote(line));
            }
        }
        int choice = 0;
        while (choice != 3) {
            System.out.println("1. Add a note");
            System.out.println("2. List notes");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter note id");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter note title");
                    String title = scanner.nextLine();
                    System.out.println("Enter note content");
                    String content = scanner.nextLine();
                    notes.add(new Note(id, title, content));
                    String allNotesText = "";
                    for (Note note : notes) {
                        allNotesText += FileManager.noteToLine(note) + "\n";
                    }
                    FileManager.saveText("FILE_NAME", allNotesText);
                    System.out.println("Note added successfully!");
                    break;
                case 2:
                     for (Note note : notes) {
                         System.out.println(note);
                     }
                     break;
                case 3:
                         System.out.println("Goodbye!");

                         break;
                default:
                         System.out.println("Invalid choice!");
                         break;
            }

        }
    }
}

