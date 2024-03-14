package Model;

import Model.ReadFile;

import java.util.Arrays;
import java.util.HashMap;


public class RepetitionRate {
    public HashMap<String, Integer> hashMap;

    private final ReadFile data;

    public RepetitionRate() {
        this.data = new ReadFile();
        this.hashMap = getHashMap();

    }

    public HashMap<String, Integer> getHashMap() {

        String[] fruits = data.array;
        hashMap = new HashMap<>();
        for (int i = 0; i < fruits.length; i++) {
            if (!hashMap.containsKey(fruits[i])) {
                hashMap.put(fruits[i], 1);
            } else hashMap.put(fruits[i], hashMap.get(fruits[i]) + 1);
        }
        return hashMap;
    }

    @Override
    public String toString() {
        return Arrays.toString(hashMap.entrySet().toArray());

    }
}
