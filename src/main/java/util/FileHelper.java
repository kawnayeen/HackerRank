package util;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileHelper {
    public void writeToFile(String fileName, String data) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException ignored) {
        }
    }

    public List<String> readLineByLine(String fileName) {
        try {
            return Files.readAllLines(Paths.get(fileName));
        } catch (IOException ignored) {
        }
        return Arrays.asList();
    }
}
