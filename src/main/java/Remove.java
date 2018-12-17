import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.nio.charset.*;

public class Remove {

    public void removeDigits(String first_path, String second_path) {

        File file = new File(first_path);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(second_path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            String newLine = "";

            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) < 48 || line.charAt(i) > 57) {
                    newLine += line.charAt(i);
                }
            }
            writer.write(newLine);
        }
        writer.close();
    }

}
