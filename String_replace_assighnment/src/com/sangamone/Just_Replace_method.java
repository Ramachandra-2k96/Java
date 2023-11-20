package com.sangamone;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Just_Replace_method {
	public static String replacePlaceholders(String template, String salutation, String name, String amount, String date) {
	        template = template.replace("$1salutation", salutation);
	        template = template.replace("$2name", name);
	        template = template.replace("$3amount", amount);
	        template = template.replace("$4date", date);
	        return template;
	    }

	    public static List<String> readFile(String file) throws IOException {
	        List<String> list = new ArrayList<>();
	        Scanner sc1= new Scanner(new File(file));
	        String line;
	            while (sc1.hasNextLine()){
	            	line = sc1.nextLine().replace("\n","" );
	                list.add(line);
	            }
	        return list;
	    }

	    public static String readTemplate(String file) throws IOException {
	        StringBuilder template = new StringBuilder();
	        Scanner sc = new Scanner(new File(file));
	            String line;
	            while (sc.hasNextLine()) {
	            	line = sc.nextLine().replace("\n","" );
	                template.append(line);
	            }
	        return template.toString();
	    }

	    public static void writeFile(List<String> list, String outputFile) throws IOException {
	        FileWriter fw = new FileWriter(new File(outputFile));
	            for (String line : list) {
	            	fw.write(line+'\n');
	            }
	        fw.close();
	    }

	    public static void main(String[] args) throws IOException {
	            List<String> mainList = readFile("list1.txt");
	            String template = readTemplate("template.txt");
	            List<String> finalResult = new ArrayList<>();

	            for (String m : mainList) {
	                String[] temp = m.split(", ");
	                finalResult.add(replacePlaceholders(template, temp[0], temp[1], temp[2], temp[3]));
	            }

	            writeFile(finalResult, "output.txt");
	        }
}
