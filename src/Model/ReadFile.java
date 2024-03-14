package Model;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    final String path;
    public String data;

    public String[] array;

    public ReadFile() {
        this.path = "D:\\intellijProjects\\Fruits\\input.txt";
        this.data = getData();
        this.array = data.split("\\s+");
    }

    private String getData() {
        StringBuilder sb = new StringBuilder();
        try (FileReader reader = new FileReader(path)) {
            while (reader.ready()) {
                sb.append((char) reader.read());
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }
        return data = sb.toString();
    }

    @Override
    public String toString() {
        return this.data;
    }
}
