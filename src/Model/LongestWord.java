package Model;

public class LongestWord {

    ReadFile data;
    String longest;

    public LongestWord() {
        this.data = new ReadFile();
        this.longest = getLongest();
    }

    private String getLongest() {
        String[] fruits = data.array;
        longest = null;
        int maxLenght = 0;
        for (String s : fruits) {
            if (s.length() > maxLenght) {
                maxLenght = s.length();
                longest = s;
            }
        }
        return longest;
    }

    @Override
    public String toString() {
        return longest;
    }
}
