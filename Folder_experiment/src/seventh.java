import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class seventh {

	
	public static void main(String[] args)
	{
		createProfilePage();
	}
	
	public static void createProfilePage() {
        String s1 = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <title>Custom Video Player</title>\n" +
                "    <style>\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body class=\"bg-gray-900 flex justify-center items-center h-screen\">\n" +
                "   <h1>I am ";
        String s2 = "</h1>\n" +
                "</body>\n" +
                "</html>";

        List<String> sub = new ArrayList<>();
        try {
            File file = new File("TeacherWebsite.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(":");
                sub.add(parts[0]);
                String[] names = parts[1].split(",");
                for (String name : names) {
                    File dir= new File(parts[0] + File.separator + name);
   //While searching in Internet i found this one "File.separator " which makes our program run in both windows and Linux without error because in (\ in Windows, / in Linux) 
                    dir.mkdirs();
                }
            }
            sc.close();

            for (String s : sub) {
                File rootFolder = new File(s);
                File[] subFolders = rootFolder.listFiles();
                if (subFolders != null) {
                    for (File subFolder : subFolders) {
                        FileWriter writer = new FileWriter(new File(subFolder, subFolder.getName() + ".html"));
                        writer.write(s1 + subFolder.getName() + s2);
                        writer.close();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
