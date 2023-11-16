package com.sangamone;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class testclass {
	
	public List<Integer> readLinesAndCompare(String file1, String file2) {
	        List<Integer> faultLines = new ArrayList<>();
	        List<String> sentencesFile1 = readLinesFromFile(file1);
	        List<String> sentencesFile2 = readLinesFromFile(file2);

	        for (int i = 0; i < sentencesFile1.size(); i++) {
	            if (!sentencesFile1.get(i).equals(sentencesFile2.get(i))) {
	                faultLines.add(i + 1);
	            }
	        }

	        return faultLines;
	    }

	    public List<String> compareWords(String file1, String file2) {
	        List<String> faultWords = new ArrayList<>();

	        List<String> sentencesFile1 = readLinesFromFile(file1);
	        List<String> sentencesFile2 = readLinesFromFile(file2);

	        for (int i = 0; i <sentencesFile1.size(); i++) {
	            String[] words1 = sentencesFile1.get(i).split(" ");
	            String[] words2 = sentencesFile2.get(i).split(" ");

	            for (int j = 0; j < Math.min(words1.length, words2.length); j++) {
	                if (!words1[j].equals(words2[j])) {
	                    faultWords.add(sentencesFile1.get(i) + " : " + words1[j]);
	                    faultWords.add(sentencesFile2.get(i) + " : " + words2[j]);
	                }
	            }
	        }

	        return faultWords;
	    }

	    private List<String> readLinesFromFile(String filePath) {
	        List<String> lines = new ArrayList<>();
	        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                lines.add(line.trim());
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return lines;
	    }
}