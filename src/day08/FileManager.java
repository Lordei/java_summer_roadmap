package day08;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileManager {



    public static void saveText(String fileName, String text) {
        try {
            Files.writeString(Path.of(fileName), text);
        } catch (Exception e) {
            // e.getMessage() تطبع لك وش المشكلة بالضبط لو فشل الحفظ
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static String readText(String fileName) {
        try {
            if (Files.exists(Path.of(fileName))) {
                return Files.readString(Path.of(fileName));
            }else {
                    return "";
                }
            } catch (Exception e) {
            return "";
        }
    }

    public static String noteToLine(Note note) {
        return note.getId() + "|" + note.getTitle() + "|" + note.getContent();
    }

    public static Note parseNote(String line) {
        String[] parts = line.split("\\|");
        return new Note(Integer.parseInt(parts[0]), parts[1], parts[2]);
    }
}

