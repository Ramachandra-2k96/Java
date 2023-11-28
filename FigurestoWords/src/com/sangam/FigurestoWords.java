package com.sangam;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FigurestoWords {

    private static ArrayList<String> readWordsFromFile() throws IOException {
        File file = new File("words.txt");
        ArrayList<String> wordsList = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                wordsList.add(scanner.nextLine());
            }
        }
        return wordsList;
    }

    private static void convert20(int num, ArrayList<String> wordsList) {
        System.out.print(wordsList.get(num - 1) + " ");
    }

    private static void convert99(int num, ArrayList<String> wordsList) {
        System.out.print(wordsList.get(17 + num) + " ");
    }

    private static void convert100(int num, ArrayList<String> wordsList) {
        System.out.print(wordsList.get(26 + num) + " ");
    }

    public static void main(String[] args) {
        try {
            System.out.println("This program will work up to 199");
            System.out.println("Enter any number: ");

            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            scanner.close();

            if (num >= 1 && num <= 20) {
                convert20(num, readWordsFromFile());
            } else if (num >= 21 && num <= 29) {
                int part1 = (num / 10) * 10;
                int part2 = num % 10;
                convert20(part1, readWordsFromFile());
                convert20(part2, readWordsFromFile());
            } else if (num >= 30 && num < 100) {
                int part1 = num / 10;
                int part2 = num % 10;
                convert99(part1, readWordsFromFile());
                convert20(part2, readWordsFromFile());
            } else if (num >= 100 && num <= 199) {
                int part1 = num / 100;
                int part2 = num % 100;

                convert100(part1, readWordsFromFile());

                if (part2 > 0) {
                	System.out.print("and ");
                    if (part2 >= 1 && part2 <= 20) {
                        convert20(part2, readWordsFromFile());
                    } else {
                        int part3 = part2 / 10;
                        int part4 = part2 % 10;
                        convert99(part3, readWordsFromFile());

                        if (part4 > 0) {
                            convert20(part4, readWordsFromFile());
                        }
                    }
                }
            }
                else {
                System.out.println("Number out of range.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
