package Model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountFruits {

    public ReadFile data;
    public Integer count;


    public CountFruits() {
        this.data = new ReadFile();
        this.count = getCount();

    }

    public Integer getCount() {
        String[] words = data.array;
        return count = words.length;
    }


    @Override
    public String toString() {
        return count.toString();
    }
}