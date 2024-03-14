package View;

import Model.CountFruits;
import Model.LongestWord;
import Model.RepetitionRate;

import java.util.Scanner;

public class View {

    RepetitionRate repetitionRate;
    CountFruits countFruits;
    LongestWord longestWord;

    public View() {
        this.longestWord = new LongestWord();
        this.countFruits = new CountFruits();
        this.repetitionRate = new RepetitionRate();
    }

    public void run() {
        while (true) {
            System.out.println("\nWe've got a fruit bucket here, what do you want to do?: \n 1. How many fruits in " +
                    "general? \n 2. What is the longest name of a fruit? \n 3. Show me the full list of the fruits with " +
                    "quantity!\n 4. Exit. \n");
            String command = prompt("Input number (1,2,3 or 4): ");
            switch (command) {
                case "1":
                    System.out.println("There are " + countFruits + " fruits in a bucket\n");
                    break;
                case "2":
                    System.out.println("Longest name of a fruit in a bucket is - " + longestWord + "\n");
                    break;
                case "3":
                    System.out.println("The full list: " + repetitionRate + "\n");
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Use numbers from 1 to 4!");
            }
        }

    }


    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
}
